package org.buzheng.study.httpcomponents;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * 
 *
 */
public class ResponseHttpHeader {

	public static void main(String[] args) throws Exception {

		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://www.google.com");

		HttpResponse response = httpClient.execute(httpGet);

		StatusLine statusLine = response.getStatusLine();
		int statusCode = statusLine.getStatusCode();
		System.out.println("StatusCode: " + statusCode);

		// 获取所有的响应头信息
		Header[] headers = response.getAllHeaders();
		
		System.out.println(headers.length);
		System.out.println("-----------------------------------------");
		for (Header header : headers) {
			System.out.println(header);
		}
		
		System.out.println("-----------------------------------------");
		
		for (Header header : headers) {
			// getName 和 getValue 分别得出头信息的键值
			System.out.println(header.getName() + " - " + header.getValue());
		}

		System.out.println("-----------------------------------------");
		for (Header header : headers) {
			Header[] hs = response.getHeaders(header.getName());
			System.out.println(hs.length);

			System.out.println("==");
			for (Header h : hs) {
				System.out.println(h);
			}
		}
		
//		HttpEntity entity = response.getEntity();
//		String html = EntityUtils.toString(entity);
//
//		System.out.println("-----------------------------------------");
//		System.out.println(html);

		
		httpGet.releaseConnection();

	}

}
