package com.ds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClient
{

public static void main(String[] args) 
  {
		// Activate hibernate s/w
			Configuration cfg=new Configuration(); 
		/*	cfg.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
			cfg.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
			cfg.setProperty("hibernate.connection.username", "system");
			cfg.setProperty("hibernate.connection.password", "ganesh");*/
			cfg.addFile(".\\src\\Employee.hbm.xml");
			//read and verify hb cfg file,hb mapping file entries
			/*cfg=cfg.configure("/hibernate.cfg.xml");*/
		//build hibernate session factory obj
		SessionFactory factory=cfg.buildSessionFactory();
		//create hb session obj
		Session ses=factory.openSession();
		//begin the transaction(Tx)
		Transaction tx=ses.beginTransaction();
		//prepare hb pojo class obj with data
		EmpBean eb=new EmpBean();
		eb.setNo(1018);
		eb.setFname("GANESH");
		eb.setLname("BALAGAM");
		eb.setMail("ganesh@gmail.com");
		//insert record
		ses.save(eb);
		//colmmit the transaction(tx)
		tx.commit();
		System.out.println("Record inserted Sucessfully");
		//close hb objs
		ses.close();
		factory.close();
	}
		}


