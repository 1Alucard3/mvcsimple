package ch.heigvd.amt.mvcsimple.model;

public class UserInfo {
    private String firstName;
    private String lastName;
    private String emailAddress;

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    String getEmailAddress(){
        return emailAddress;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
}
