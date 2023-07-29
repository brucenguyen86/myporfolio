package model;

public class Class {
    private String id;
    private String name;
    private String intakeID;

    public Class() {
    }

    public Class(String id, String name, String intakeID) {
        this.id = id;
        this.name = name;
        this.intakeID = intakeID;
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

    public String getIntakeID() {
        return intakeID;
    }

    public void setIntakeID(String intakeID) {
        this.intakeID = intakeID;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", intakeID='" + intakeID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
