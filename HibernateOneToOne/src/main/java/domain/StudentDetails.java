package domain;

import javax.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentDetails {
    @Id
    @Column(name = "stud_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studId;
    @Column(name = "10th_per")
    private double tenthPer;

    @Column(name = "12th_per")
    private double twelethPer;
    @Column(name = "degree_per")
    private double degreePer;

    @Column(name = "stream")
    private String stream;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public double getTenthPer() {
        return tenthPer;
    }

    public void setTenthPer(double tenthPer) {
        this.tenthPer = tenthPer;
    }

    public double getTwelethPer() {
        return twelethPer;
    }

    public void setTwelethPer(double twelethPer) {
        this.twelethPer = twelethPer;
    }

    public double getDegreePer() {
        return degreePer;
    }

    public void setDegreePer(double degreePer) {
        this.degreePer = degreePer;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
