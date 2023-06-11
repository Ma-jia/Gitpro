package com.example.re.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.re.common.AliyunSms;
import com.example.re.common.Sample;
import com.example.re.common.R;
import com.example.re.common.ValidateCodeUtils;
import com.example.re.entity.User;
import com.example.re.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sendMsg")
    private R<String> sendMsg(@RequestBody User user, HttpSession session) throws Exception {
        String phone = user.getPhone();
        if(phone!=null){
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info(code);
//            AliyunSms.main(phone,code);
            session.setAttribute(phone,code);
            return R.success("验证码发送成功");
        }

        return R.error("发送失败");
    }

    @PostMapping("/login")
    private R<User> login(@RequestBody Map map, HttpSession session) throws Exception {
        String phone = map.get("phone").toString();
        String code = map.get("code").toString();
        String codeInSession = (String) session.getAttribute(phone);
        if(codeInSession!=null&&code.equals(codeInSession)){
            LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone,phone);
            User user = userService.getOne(queryWrapper);
            if(user==null){
                user=new User();
                user.setPhone(phone);
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user",user.getId());
            return  R.success(user);
        }

        return R.error("登录失败");
    }
}
