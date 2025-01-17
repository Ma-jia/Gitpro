package com.example.re.common;

// This file is auto-generated, don't edit it. Thanks.

import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.*;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

public class Sample {

    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        config.regionId="cn-beijing";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    public static void send(String phone,String code) throws Exception {
//        java.util.List<String> args = java.util.Arrays.asList(args_);
        // 请确保代码运行环境设置了环境变量 ALIBABA_CLOUD_ACCESS_KEY_ID 和 ALIBABA_CLOUD_ACCESS_KEY_SECRET。
        // 工程代码泄露可能会导致 AccessKey 泄露，并威胁账号下所有资源的安全性。以下代码示例使用环境变量获取 AccessKey 的方式进行调用，仅供参考，建议使用更安全的 STS 方式，更多鉴权访问方式请参见：https://help.aliyun.com/document_detail/378657.html
        com.aliyun.dysmsapi20170525.Client client = Sample.createClient( );
        com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
                .setTemplateCode("SMS_461035623")
                .setTemplateParam("{\"code\":\"1234\"}")
                .setSignName("瑞吉外卖")
                .setPhoneNumbers(phone);
        System.out.println("ok@2");
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        System.out.println("ok@2");

        client.sendSmsWithOptions(sendSmsRequest, runtime);

//        System.out.println(sendSmsResponse.toString());
        try {
            // 复制代码运行请自行打印 API 的返回值
            client.sendSmsWithOptions(sendSmsRequest, runtime);
//            SendSmsResponse sendSmsResponse = client.getAcsResponse(request);
            System.out.println("ok@2");
//            client.sendSms(sendSmsRequest);
        } catch (TeaException error) {
            // 如有需要，请打印 error
            error.printStackTrace();
            com.aliyun.teautil.Common.assertAsString(error.message);
            System.out.println("ok");
        } catch (Exception _error) {
            TeaException error = new TeaException(_error.getMessage(), _error);
            // 如有需要，请打印 error
            error.printStackTrace();
            com.aliyun.teautil.Common.assertAsString(error.message);
        }
    }
}
