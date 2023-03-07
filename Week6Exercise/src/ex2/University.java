package ex2;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class University {
    private String universityName;
    private Department[] departmentList;

    public University(String universityName, int[] departmentId, String[] departmentName) {
        this.universityName = universityName;
        departmentList = new Department[departmentId.length];

        for (int i = 0; i < departmentList.length; i++) {
            departmentList[i] = new Department(departmentId[i], departmentName[i]);
        }// for
    }// Constructor - University

    public String getUniversityName() {
        return universityName;
    }// Getter - getUniversityName

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }// Setter - setUniversityName

    public void showList() {
        for (Department department : departmentList) {
            System.out.println(department.getDepartmentId() + " "
                    + department.getDepartmentName());
        }// for
    }// Method - showList

    public void changeDepartmentName(String oldName, String newName) {
        for (Department department : departmentList) {
            if (department.getDepartmentName().equals(oldName)) {
                department.setDepartmentName(newName);
            }// if
        }// for
    }// Method - changeDepartmentName
}// Class - University
