package model;

public class TeacherAccount {
    String username;
    String password;
    String teacherID;

    public TeacherAccount() {
    }

    public TeacherAccount(String username, String password, String teacherID) {
        this.username = username;
        this.password = password;
        this.teacherID = teacherID;
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

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "TeacherAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", teacherID='" + teacherID + '\'' +
                '}';
    }

}
