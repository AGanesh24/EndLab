package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction ts= s.beginTransaction();
		
		Truck t=new Truck();
		t.setId(102);
		t.setName("tata");
		t.setColor("blue");
		t.setMaxSpeed(120);
		t.setLoadCapacity(400);
		t.setType("EV");
		
		Car c=new Car();
		c.setId(101);
		c.setName("tata");
		c.setColor("blue");
		c.setMaxSpeed(120);
		c.setNumOfDoors(4);
		c.setType("EV");
		
		ts.commit();

	}

}
