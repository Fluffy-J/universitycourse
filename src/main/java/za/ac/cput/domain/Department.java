package za.ac.cput.domain;

public class Department {
    private String depCode;
    private String depName;
    private String depHead;
    private String depMissionStatement;

    public Department() {
    }

    public Department(String depCode, String depName, String depHead, String depMissionStatement) {
        this.depCode = depCode;
        this.depName = depName;
        this.depHead = depHead;
        this.depMissionStatement = depMissionStatement;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }

    public String getDepMissionStatement() {
        return depMissionStatement;
    }

    public void setDepMissionStatement(String depMissionStatement) {
        this.depMissionStatement = depMissionStatement;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depCode='" + depCode + '\'' +
                ", depName='" + depName + '\'' +
                ", depHead='" + depHead + '\'' +
                ", depMissionStatement='" + depMissionStatement + '\'' +
                '}';
    }
}
