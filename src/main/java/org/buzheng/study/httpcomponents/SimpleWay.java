package org.buzheng.study.httpcomponents;

import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

/**
 * 一个简单的方法
 */
public class SimpleWay {


	public static void main(String[] args) throws Exception {
		
		System.out.println("--------- GET  ----------------");
		System.out.println(Request.Get("http://www.google.com")
	    .execute().returnContent());
		

		System.out.println("--------- POST ----------------");
		
		System.out.println(Request.Post("http://www.taobao.com")
			    .bodyForm(Form.form().add("username", "xxxx").add("password", "xxxx").build()).execute().returnContent());	
	}

}
