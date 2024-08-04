package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
	public static void main(String[] args) {
		String api_key = "NCSMTBEIAH0QQQ6R";
		String api_secret = "MNNFMHB9PJEUIGRDHAKKP6XFKPR7VZAX";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01090837645");
		params.put("from", "01076523051");
		params.put("type", "SMS");
		params.put("text", "당신의 남자친구를 납치했다.. 얼른 연락 해보아라.. 01090837645");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}
