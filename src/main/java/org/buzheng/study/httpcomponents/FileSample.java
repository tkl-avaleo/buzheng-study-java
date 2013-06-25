package org.buzheng.study.httpcomponents;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class FileSample {

	public static void main(String[] args) throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		
		HttpPost postRequest = new HttpPost("http://localhost:8080/servlet/fileHandlerServlet");
		
		FileBody bin = new FileBody(new File(""));
		StringBody comment = new StringBody("A binary file of some kind");
		
		MultipartEntity reqEntity = new MultipartEntity();
		reqEntity.addPart("bin", bin);
		reqEntity.addPart("comment", comment);
		
		postRequest.setEntity(reqEntity);
		
		HttpResponse res = httpclient.execute(postRequest);
		
		HttpEntity entity = res.getEntity();
		
		System.out.println("---------------------------------------------------");
		System.out.println(res.getStatusLine());
		if (entity != null) {
			System.out.println("Response content length: " + entity.getContentLength());
		}
		
		EntityUtils.consume(entity);
		
		httpclient.getConnectionManager().shutdown();
	}

}
