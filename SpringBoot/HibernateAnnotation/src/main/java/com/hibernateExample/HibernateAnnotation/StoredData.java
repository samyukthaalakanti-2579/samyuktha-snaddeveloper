package com.hibernateExample.HibernateAnnotation;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
     
public class StoredData
{
	public static void main(String[] args) {    
        
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	    Customer c1=new Customer();
	    c1.setId(1);
	    c1.setCname("koushik");
	    c1.setCustomer_branch("snad");
	    c1.setCustomer_salary(12345);
	    c1.setCustomer_acc_no(1235647);
	    
	    Customer c2=new Customer();
	    c2.setId(2);
	    c2.setCname("Anumasa");
	    c2.setCustomer_branch("snad");
	    c2.setCustomer_salary(523145);
	    c2.setCustomer_acc_no(1235658);
	    
	    Customer c3=new Customer();
	    c3.setId(3);
	    c3.setCname("Samyuktha");
	    c3.setCustomer_branch("snad");
	    c3.setCustomer_salary(85467);
	    c3.setCustomer_acc_no(1235659);
	    
	    Customer c4=new Customer();
	    c4.setId(4);
	    c4.setCname("poorna");
	    c4.setCustomer_branch("snad");
	    c4.setCustomer_salary(5231564);
	    c4.setCustomer_acc_no(1235668);
	    
	    Customer c5=new Customer();
	    c5.setId(5);
	    c5.setCname("ravi");
	    c5.setCustomer_branch("snad");
	    c5.setCustomer_salary(154561);
	    c5.setCustomer_acc_no(12356567);
	    
	    session.save(c3);
	    session.save(c4);
	    session.save(c5);
	    
	    
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	        
	}   
}
