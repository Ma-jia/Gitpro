package com.example.re.common;

import com.aliyun.tea.TeaModel;

/***
 * @Title:
 * @ClassName: com.hssmart.common.utils.AliyunSms.java
 * @Description:
 *
 * @Copyright  suihao- Powered By 研发中心
 * @author: suihao
 * @date:  2022-11-01 15:51
 * @version V1.0
 */
public class AliyunSms {
	/**
	 * 使用AK&SK初始化账号Client
	 * @param accessKeyId
	 * @param accessKeySecret
	 * @return Client
	 * @throws Exception
	 */
	public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
		com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
				// 您的 AccessKey ID
				.setAccessKeyId(accessKeyId)
				// 您的 AccessKey Secret
				.setAccessKeySecret(accessKeySecret);
		// 访问的域名
		config.endpoint = "dysmsapi.aliyuncs.com";
		return new com.aliyun.dysmsapi20170525.Client(config);
	}

	public static void main(String phone,String code) throws Exception {
		com.aliyun.dysmsapi20170525.Client client = AliyunSms.createClient("", "");
		com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
				.setPhoneNumbers("测试手机号")
				.setTemplateParam("{\"code\":\""+code+"\"}")
				.setTemplateCode("SMS_461035623")
				.setSignName("瑞吉外卖")
				.setPhoneNumbers(phone);
		com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
		com.aliyun.dysmsapi20170525.models.SendSmsResponse resp = client.sendSmsWithOptions(sendSmsRequest, runtime);
		com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(TeaModel.buildMap(resp)));
	}

}

