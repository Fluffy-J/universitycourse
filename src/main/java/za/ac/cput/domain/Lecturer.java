package za.ac.cput.domain;

/* 
@author : Joshua Mokwebo 
date: 04/03/2024 
time : 4:29
Repository :Fluffy-J/universitycourse
*/

public class Lecturer {
    private String emloyeeId;
    private String firstName;
    private String lastName;
    private String sex ;
    private int credits;
    private Contact contact;

    public Lecturer() {
    }

    public Lecturer(String emloyeeId, String firstName, String lastName, String sex, int credits, Contact contact) {
        this.emloyeeId = emloyeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.credits = credits;
        this.contact = contact;
    }

    public String getEmloyeeId() {
        return emloyeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getCredits() {
        return credits;
    }

    public Contact getContact() {
        return contact;
    }

    public void setEmloyeeId(String emloyeeId) {
        this.emloyeeId = emloyeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "emloyeeId=" + emloyeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", credits=" + credits + ", contact=" + contact + '}';
    }  
    
}


    

