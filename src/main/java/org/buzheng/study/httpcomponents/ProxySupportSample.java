package org.buzheng.study.httpcomponents;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * from: 
 * http://hc.apache.org/httpcomponents-client-ga/httpclient/examples/org/apache/http/examples/client/ClientExecuteProxy.java
 *
 */
public class ProxySupportSample {

	public static void main(String[] args) throws Exception {

		HttpHost proxy = new HttpHost("127.0.0.1", 8080, "http");

		HttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY,
				proxy);

		HttpHost target = new HttpHost("issues.apache.org", 443, "https");
		HttpGet req = new HttpGet("/");

		System.out.println("executing request to " + target + " via " + proxy);
		HttpResponse rsp = httpClient.execute(target, req);
		HttpEntity entity = rsp.getEntity();

		System.out.println("----------------------------------------");
		System.out.println(rsp.getStatusLine());
		Header[] headers = rsp.getAllHeaders();
		for (int i = 0; i < headers.length; i++) {
			System.out.println(headers[i]);
		}
		System.out.println("----------------------------------------");

		if (entity != null) {
			System.out.println(EntityUtils.toString(entity));
		}
		
		httpClient.getConnectionManager().shutdown();
	}

}
