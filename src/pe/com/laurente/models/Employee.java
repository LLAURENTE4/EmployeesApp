package pe.com.laurente.models;

import java.util.Date;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class Employee {
    private Integer no;
    private Date birthdate;
    private String firstname;
    private String lastname;
    private String gender;
    private Date hiredate;

public Employee(Integer no,Date birthdate,String firstname,String lastname,String gender,Date hiredate){
    this.no=no;
    this.birthdate=birthdate;
    this.firstname=firstname;
    this.lastname=lastname;
    this.gender=gender;
    this.hiredate=hiredate;
}



    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}
