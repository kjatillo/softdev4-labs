package ex2;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }// Constructor - Department

    public int getDepartmentId() {
        return departmentId;
    }// Getter - getDepartmentId

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }// Setter - setDepartmentId

    public String getDepartmentName() {
        return departmentName;
    }// Getter - getDepartmentName

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }// Setter - setDepartmentName
}// Class - Department
