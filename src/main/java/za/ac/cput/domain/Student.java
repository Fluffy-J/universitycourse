package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Mpumzi Mbula
 * 219053324
 * 03-03-2024
 */
public class Student {
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private String idNumber;
    private LocalDate dob;

    private Contact contact;
    private ArrayList<Subject> subjectList;
    public Student (){

    }

    public Student(String studentNumber, String firstName, String lastName, String gender, String idNumber, LocalDate dob, String phoneNumber ,String email,ArrayList<Subject>subjectList) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.idNumber = idNumber;
        this.dob = dob;
        this.subjectList=subjectList;
        contact=new Contact(phoneNumber,email);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", dob=" + dob +
                ", contact=" + contact +
                ", subjectList=" + subjectList +
                '}';
    }
}
