package MainApp;

import domain.Student;
import domain.StudentDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class InsertStudent {
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
        System.out.println("Enter 10th per: ");
        double tenthPer=sc.nextDouble();
        System.out.println("Enter 12th per: ");
        double twelethPer=sc.nextDouble();
        System.out.println("Enter Degree per: ");
        double degree=sc.nextDouble();
        System.out.println("Enter Stream: ");
        String stream=sc.next();
        StudentDetails s1=new StudentDetails();
        s1.setTenthPer(tenthPer);
        s1.setTwelethPer(twelethPer);
        s1.setDegreePer(degree);
        s1.setStream(stream);

        System.out.println("Enter student name");
        String sname=sc.next();
        System.out.println("Enter student email");
        String email=sc.next();

        Student s2=new Student();
        s2.setsName(sname);
        s2.setEmail(email);
        s2.setStudRef(s1);
        tx= ses.beginTransaction();

        ses.save(s2);
        ses.save(s1);
        tx.commit();
        System.out.println("DATA INSERTED SUCCESSFULLY");
    }
}
