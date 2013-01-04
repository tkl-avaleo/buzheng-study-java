package org.buzheng.study.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

public class JpaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Test
	public void createTable() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJPA");
		factory.close();
	}
	
	@Test 
	public void save() {
		Person person = new Person();
		person.setName("buzheng");
				
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJPA");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void update() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJPA");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Person p = em.find(Person.class, 1);
		p.setName("zhjiun"); // p 为托管状态
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
	@Test
	public void update2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Person p = em.find(Person.class, 1);
		em.clear(); // 将实体管理器中的所有实体变为托管状态
		p.setName("congcat");
		em.merge(p); // 把托管状态变为托管状态，merge可以自动选择insert 或 update数据
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	@Test 
	public void remove(){  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJPA");  
        EntityManager em = factory.createEntityManager();  
        em.getTransaction().begin();  
        Person person = em.find(Person.class, 1);  
        em.remove(person); //删除实体  
        em.getTransaction().commit();  
        em.close();
        factory.close();
    }  
	
	@Test
	public void find() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("myJPA");
		EntityManager em = factory.createEntityManager();
		Person person = em.find(Person.class, 3); // 类似于hibernate的get方法,没找到数据时，返回null
		System.out.println(person.getName());
		em.close();
		factory.close();
	}

	@Test
	public void find2() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("myJPA");
		EntityManager em = factory.createEntityManager();
		Person person = em.getReference(Person.class, 1); // 类似于hibernate的load方法,延迟加载.没相应数据时会出现异常
		System.out.println(person.getName()); // 真正调用时才查找数据
		em.close();
		factory.close();
	}
}
