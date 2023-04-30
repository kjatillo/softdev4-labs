/**
 * Created by: Ken
 * Created on: 30/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Contact {
    private String name;
    private char gender;
    private String mobile;

    public Contact(String name, char gender, String mobile) {
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
    }// Constructor - Contact

    public String getName() {
        return name;
    }// Getter - name

    public void setName(String name) {
        this.name = name;
    }// Setter - name

    public char getGender() {
        return gender;
    }// Getter - gender

    public void setGender(char gender) {
        this.gender = gender;
    }// Setter - gender

    public String getMobile() {
        return mobile;
    }// Getter - mobile

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }// Setter - mobile
}// Class - Contact
