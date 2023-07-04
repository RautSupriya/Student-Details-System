package domain;

import javax.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    @Column(name="s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    @Column(name = "s_name")
    private String sName;
    @Column(name="email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "s_ref")
    private StudentDetails studRef;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentDetails getStudRef() {
        return studRef;
    }

    public void setStudRef(StudentDetails studRef) {
        this.studRef = studRef;
    }
}
