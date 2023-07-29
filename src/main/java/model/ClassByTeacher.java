package model;

public class ClassByTeacher {
    String classByTeacherID;
    String teacherID;
    String classID;

    public ClassByTeacher() {
    }

    public ClassByTeacher(String classByTeacherID, String teacherID, String classID) {
        this.classByTeacherID = classByTeacherID;
        this.teacherID = teacherID;
        this.classID = classID;
    }

    public String getClassByTeacherID() {
        return classByTeacherID;
    }

    public void setClassByTeacherID(String classByTeacherID) {
        this.classByTeacherID = classByTeacherID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "ClassByTeacher{" +
                "classByTeacherID='" + classByTeacherID + '\'' +
                ", teacherID='" + teacherID + '\'' +
                ", classID='" + classID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


