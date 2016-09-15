package com.ds;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DemoClient {

		public static void main(String[] args) {
		// Locate spring bean cfg file
			FileSystemResource res=new FileSystemResource("./src/DemoCfg.xml");
			//Activate beanfactory Container
			XmlBeanFactory factory=new XmlBeanFactory(res);
			//get spring bean obj ref from spring container
			Object obj=factory.getBean("db");
			//type casting 
			Demo bref=(Demo)obj;
			//call b.method
			String result=bref.generateWishMsg("ganesh");
			System.out.println("Result is:"+result);
		}//main
        }//class


