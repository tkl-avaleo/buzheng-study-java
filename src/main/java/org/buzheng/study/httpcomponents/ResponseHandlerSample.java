package org.buzheng.study.httpcomponents;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseHandlerSample {
	
	static Logger logger = LoggerFactory.getLogger(ResponseHandlerSample.class);

	public static void main(String[] args) throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet("Http://www.google.com");
		
		ResponseHandler<String> resHandler = new BasicResponseHandler();
		String resBody = httpClient.execute(getRequest, resHandler);

		logger.info("=== resonse : {}", resBody);
		
		getRequest.releaseConnection();
		
		httpClient.getConnectionManager().shutdown();
	}

}
