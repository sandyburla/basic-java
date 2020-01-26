package MappingHibernet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = null;
	Integer employeeID = null;

	public static void main(String[] args) {
		Mapping m = new Mapping();
		m.addEmployee();
	}

	private void addEmployee() {
		// TODO Auto-generated method stub
		tx = session.beginTransaction();
		Laptop l = new Laptop(12,"mac", "35k");
		Student s = new Student(1,"abc", "xyz.gmail", "jdajhsg", l);
		session.save(l);
		session.save(s);
		tx.commit();
		session.close();
	

	}

}
