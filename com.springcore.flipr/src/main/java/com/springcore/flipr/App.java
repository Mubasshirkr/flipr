package com.springcore.flipr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tables.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("com/springcore/flipr/flipr.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	User user = new User();
    	
    	user.setId(1);
    	user.setEmail("mubasshirkr@gmail.com");
    	user.setName("Mubasshir Khan");
    	user.setPassword("12345");
    	user.setCrated_at(null);
    	
    	Session session =factory.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(user);
    	tx.commit();
    	
    	session.close();
    
}
}