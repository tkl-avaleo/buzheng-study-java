package org.buzheng.study.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
 
 
public class UserJpaTest {
     
    EntityManagerFactory emf = null;
     
    @Before
    public void before() {
        //根据在persistence.xml中配置的persistence-unit name 创建EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("myJPA");
    }
     
    /**
     * 添加用户
     */
    @Test
    public void addUser() {
         
        //创建一个用户
        User user = new User();
        user.setName("叶开");
        user.setPassword("yekai");
         
        //创建实体管理器对象
        EntityManager em = emf.createEntityManager();
        //开启事务
        em.getTransaction().begin();
        //持久化对象
        em.persist(user);
        //提交事务
        em.getTransaction().commit();
        //关闭EntityManager
        em.close();
    }
     
    /**
     * 修改用户（用户处于托管状态）
     */
    @Test
    public void modifyUser1() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //查找id为1的User,进行更新
        User user = em.find(User.class, 1L);//User 的主键id为Long型
        user.setName("楚留香");
        em.getTransaction().commit();
        em.close();
    }
     
    /**
     * 修改用户（用户处于游离(脱管)状态）
     */
    @Test
    public void modifyUser2() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //查找id为1的User,进行更新
        User user = em.find(User.class, 1L);//User 的主键id为Long型
        em.clear();//将实体管理器中的所有实体变成了游离态(脱管)
        user.setName("李寻欢");
        em.merge(user);//处于游离态的实体必须使用该方法才能更新
        em.getTransaction().commit();
        em.close();
    }
     
     
     
    /**
     * 删除用户
     */
    @Test
    public void deleteUser() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //查找id为1的User
        User user = em.find(User.class, 1L);//User 的主键id为Long型
        //进行删除
        em.remove(user);
        em.getTransaction().commit();
        em.close();
    }
     
    /**
     * 关闭EntityManagerFactory
     */
    @After
    public void after() {
        if(null != emf) {
            emf.close();
        }
    }
 
}
