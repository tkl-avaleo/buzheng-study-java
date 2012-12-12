package org.buzheng.study.mongo;

import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class MongoTest {

	public static void main(String[] args) throws Exception {
		Mongo m = new Mongo("localhost", 27017);
		DB db = m.getDB("mydb");
		
		// 得到指定数据库的所有集合
		Set<String> colls = db.getCollectionNames();
		System.out.println(colls);
		
		// 得到指定集合
		DBCollection coll = db.getCollection("user");
		System.out.println(coll.getName());
		
		
		// 插入文档
//		BasicDBObject doc = new BasicDBObject();
//		doc.put("name", "MongoDB");
//		doc.put("type", "database");
//		doc.put("count", 1);
//		
//		BasicDBObject info = new BasicDBObject();
//		info.put("x", 203);
//		info.put("y", 100);
//		
//		doc.put("info", info);
//		
//		coll.insert(doc);
		
		// 得到第一条记录
		System.out.println(coll.findOne());
		
		// 增加多份文档
//		for (int i = 0; i < 100; i++) {
//			coll.insert(new BasicDBObject().append("i", i));
//		}
		
		// 统计集合中的总记录数
		System.out.println(coll.getCount());
		
		// 利用游标得到所有记录
		DBCursor cur = coll.find();
		int i = 1;
		while (cur.hasNext()) {
			System.out.println(i++ + "\t" + cur.next());
		}
		
		// 查询指定文档
		System.out.println("查询指定文档-----------------------");
		BasicDBObject query = new BasicDBObject();
		//query.put("i", 8);
		query.put("i", new BasicDBObject("$gt", 30).append("$lte", 32));
		
		System.out.println("查询条件：" + query);
		cur = coll.find(query);
		
		while (cur.hasNext()) {
			System.out.println(cur.next());
		}
		
		
		
	}

}
