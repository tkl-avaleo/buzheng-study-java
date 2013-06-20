package org.buzheng.study.httpcomponents;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * 使用 POST 的例子
 */
public class HttpPostSample {

	public static void main(String[] args) throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost("http://www.taobao.com");
		
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "xxxxxx"));
		nvps.add(new BasicNameValuePair("password", "xxxxxx"));
		
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		
		HttpResponse response = httpClient.execute(httpPost);
		
		System.out.println(response.getStatusLine());
		
		EntityUtils.consume(response.getEntity());
		
		httpPost.releaseConnection();
	}

}
