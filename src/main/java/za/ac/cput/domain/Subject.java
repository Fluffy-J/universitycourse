package za.ac.cput.domain;

import java.util.List;

public class Subject {

    private String subjectCode;
    private String subjectName;
    private List<Lecturer> lecturers;
    private String description;
    private  int credits;

    public Subject() {

    }

    public Subject(String subjectCode, String subjectName, List<Lecturer> lecturers, String description, int credits) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.lecturers = lecturers;
        this.description = description;
        this.credits = credits;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", lecturers=" + lecturers +
                ", description='" + description + '\'' +
                ", credits=" + credits +
                '}';
    }
}
