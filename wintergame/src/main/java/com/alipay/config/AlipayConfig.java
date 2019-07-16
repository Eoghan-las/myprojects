package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800619135";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCtqnMZQM9jLamAOIVoLw/kImTcIbzp6Df/kEjPAcNh1j3Ib1F/vvp37yWnmN2ncXhKVwMnV5uYo936/vV36O1SFuzvS5DdLP7BFDxTiglhHT+k76+T9+8GTGyJpm9YxxFx9t+gTnLCrH2GWzTtqs9/Qqd/np70/aju0Bg2NrkZuV5/yFMqje0W9M41/Kllv4bGWMLknRrrvi9s+ulpf+2/8bUFwcHTq47dWFXPgDLoW8vkoGL7Oxjj2kwWgUYuTCNx22aAcwFPiQ+pu1pvHAUxrh7rjESMk/zE0A/2Zu+PwxfRWbduoNIoX1+JZ1PNw8xdX+ILO4cXREFTBm1WLejPAgMBAAECggEAJbXojmhDYF7u+pfLaEcn5TsOubpdwlEZr9YN6V2RprIV8msxwFKhIt/8RjtsjkqWe1YPqkBc2jVjI3ivpt0eg3/U7VV0XILDwvt46g8EYGEwi8k8UB47ehuoSe+pKBb6E8wu3SmLw/gevckaYi2AJzs7EfxIuhxGzazERSl24j3BeaXhbhP/ZmUG017L4rBBA9OSmhPeAOAMFFqgOrbbKj/HBOcmM6YWzBeSyqY+86LTO/dBK8++DC20UKpHMCSyyYE4nYptGw72DvaKqBf8TMONQbmAludTHbWT4jZdargYPnTK64RSm+wDH0ObIiDADkKBQD5PslT0UwCuW8HhWQKBgQDmMghAVUR1tFQLqUdUygrE1c73L/mis55wqo0oz+9d4XSU/Hu075LQAllpZNg8CXNfpQtPNWh+SXdzwvEUPrGPO4Fhlu/9oNnJfb/pfznaBbTbmKwLG9/EsjOorIwZ+5yU1J6Uxz2aZv4MjjF0s7E49bzmZovAuQj6IxKSEEkhFQKBgQDBIiy+O2uVKvZv5skYf6QRuArk80kS7arDoJQzvZznkCXtmeIjXN5vfDSj9A38jq5ybB0yXuRKH0ZJqvXsx2/I3LZ63qCz0ihWWF41AS1fhiL/Md7em2SnXpDKOzB8cTTwfmTxnE1SsseuIEW/oEWWyVw5NLIUGsLwRAcwJ50zUwKBgAH02OcbEmrhrnku5iFNWkwT+R9WtAty9VzFxk9bfRBSMzh08OQ3yQqlinb/2WqhNe7RK0hwDsRMAYzlUkE2yzGJcu8OZlnEfTVeMTxdzXMR61iWcpfhk8RLM28ykDpETi9hoztmehqO14fpyXfRcyclx4Y5xuRLbk0Z8TV2l/iFAoGALVj04IXbMN8xlfy+Yv41a+OmyzNEiSk820otAikXWlfCUBO9wUfhApRLV+PKFO77jupLwLP/LlhBjLKTo9EAMk2Am0ECwrYpunxtQkzQdolsVjdDeUlLTPErVhCnxdBe+cjzsrdcgHpx4DS7q87aCBmnidcRqR7PftK6TVg/1PkCgYEAql7oNbApifDPxkB0TGPwMRQkiXz985/80+AJrhK3QFa5/LviTmsiQ9w9TCLS+2ECr2HZm7+bgMuw4f1r2Ni6wKp6jdBMeWwiDoid3j2sQI1v3kIDg1nHaCFtvtr45T2kPjThFT0xjxNXkOSh9YnS7W98ds0WMj8sHKtcDNV2NnY=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsyL9NT23ncEX3PfLuaHfOq6LblbUXfc4f/sQv1IUAjDwW2UTyIzRDVD0Ng20CFYeVC8/JGwC/bnUL3NWGeeNNVcC3dSA9Tzxxmzd/I5npqtCdv4akHqkcL/KwQbAnBIvDF65lVupxkxF4gVRIdd85srp9HBX6lF2XJzQv7YtlNz0jylLEF9WVu04tHfPAKQnM8kCF77OBx3Fl6VpDqQr/LcjXoq1cqipHX7AUnEcv5tQae05lZWyuio3xgmEG4hnW/JcV2Rmwye2ZSUyJ6GnUko8AqBBCCgma9wPg6T4fn+uXPREzrfNq7egYRj6/mZDjI+V2mIIeH3kW9Ta7/WmRQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://pay2.java1234.com/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://pay2.java1234.com/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

