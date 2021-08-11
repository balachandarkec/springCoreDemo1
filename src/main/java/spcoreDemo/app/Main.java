package spcoreDemo.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spcoreDemo.config.AppConfig;
import spcoreDemo.models.Address;
import spcoreDemo.models.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. XML Based Configuration
		Resource resource=new ClassPathResource("AppContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		// 2.  Java Based Configuration 
		//AnnotationConfigApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
//		Address adds= (Address) factory.getBean("address");
//		Address adds1= (Address) factory.getBean("address1");
//		
//	  System.out.println(adds.toString());
//	  
	  Employee emp= (Employee)factory.getBean(Employee.class);
	  
//	  emp.setAddress(adds);
//	  emp.setName("Vani");
	  
	
      System.out.println(  emp.toString());
	}

}
