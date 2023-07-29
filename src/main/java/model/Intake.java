package model;

public class Intake {
    private String id;
    private String name;
    private String courseID;

    public Intake() {
    }

    public Intake(String id, String name, String courseID) {
        this.id = id;
        this.name = name;
        this.courseID = courseID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Intake{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", courseID='" + courseID + '\'' +
                '}';
    }

}
