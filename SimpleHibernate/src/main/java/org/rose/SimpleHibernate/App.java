package org.rose.SimpleHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        StudentBO s=new StudentBO();
        s.setId(108);
        s.setName("Cicily");
        s.setGender("Female");
        Configuration c=new Configuration().configure().addAnnotatedClass(StudentBO.class);
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
        session.save(s);
        tr.commit();
        
    }
}
