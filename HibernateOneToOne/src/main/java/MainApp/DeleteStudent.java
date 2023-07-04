package MainApp;

import domain.Student;
import domain.StudentDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeleteStudent
{
    public static void main(String[] args) {
        //DECLARE THE RESOURCES
        Configuration cfg = null;
        Session ses = null;
        SessionFactory factory = null;
        Transaction tx = null;

        //CREATE THE OBJECT
        cfg = new Configuration();
        cfg = cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(StudentDetails.class);
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Id");
        int studId= sc.nextInt();
        Student s1= ses.get(Student.class,studId);
        StudentDetails s2=s1.getStudRef();

        tx=ses.beginTransaction();
        ses.delete(s2);
        ses.delete(s1);
        tx.commit();
        System.out.println("RECORD DELETED!!");

    }
}
