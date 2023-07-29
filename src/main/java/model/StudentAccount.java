package model;

public class StudentAccount {
    String accountid;
    String username;
    String password;
    String studentID;

    public StudentAccount() {
    }

    public StudentAccount(String accountid, String username, String password, String studentID) {
        this.accountid = accountid;
        this.username = username;
        this.password = password;
        this.studentID = studentID;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "accountid='" + accountid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}
