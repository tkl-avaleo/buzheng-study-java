package org.buzheng.study.httpcomponents;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * GET 方法使用例子
 */
public class HttpGetSample {

	public static void main(String[] args) throws Exception {
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://www.google.com");
		
		HttpResponse response = httpClient.execute(httpGet);
		
		try {
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			System.out.println("StatusCode: " + statusCode);
			
			HttpEntity entity = response.getEntity();
			String html = EntityUtils.toString(entity);
			
			System.out.println("-----------------------------------------");
			System.out.println(html);			
			
		} finally {
			httpGet.releaseConnection();
		}
		
	}

}
