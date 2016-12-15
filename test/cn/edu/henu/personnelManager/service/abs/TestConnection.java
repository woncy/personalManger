package cn.edu.henu.personnelManager.service.abs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestConnection {
	@Test
	public void testSession(){
		Configuration config = new AnnotationConfiguration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
		System.out.println("测试分支");
	}
}
