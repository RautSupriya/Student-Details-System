package MainApp;

import domain.Student;
import domain.StudentDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DisplayStudent {
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
        System.out.println("Enter student id: ");
        int studId=sc.nextInt();

        Student s1=ses.get(Student.class,studId);
        System.out.println("Student Id: "+s1.getsId());
        System.out.println("Student Name: "+s1.getsName());
        System.out.println("Email Id: "+s1.getEmail());
        System.out.println("10th percentage: "+s1.getStudRef().getTenthPer());
        System.out.println("12th percentage: "+s1.getStudRef().getTwelethPer());
        System.out.println("Degree Percentage: "+s1.getStudRef().getDegreePer());
        System.out.println("Stream: "+s1.getStudRef().getStream());
    }
}
