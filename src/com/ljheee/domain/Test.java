package com.ljheee.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Teacher t1 = new Teacher("ljh", "77.com");
		Teacher t2 = new Teacher("wtt", "qq.com");
		
		Course c1 = new Course("PE", t2);
		Course c2 = new Course("Math", t1);
		Course c3 = new Course("Science", t2);
		
		Student s1 = new Student("ltao");
		Student s2 = new Student("wenge");
		Student s3 = new Student("Sam");
		
		s1.addCourse(c1);//学生选课，执行时，课程也添加了学生，做双向绑定
		s1.addCourse(c2);
		s1.addCourse(c3);
		
		//映射文件中设置了级联
		//先存在任课教师，才有课程。
		session.save(t1);
		session.save(t2);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);//自动存  学生对象。
		
		
		
		session.getTransaction().commit();
		session.close();
	}

}
