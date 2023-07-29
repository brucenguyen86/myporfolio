package model;

import java.util.Objects;

public class Human {
    private String id;
    private String name;
    private String birthday;
    private String phonenumber;
    private String email;
    private String address;

    public Human() {
    }

    public Human(String id, String name, String birthday, String phonenumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "human{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getPhonenumber() == human.getPhonenumber() && Objects.equals(getId(), human.getId()) && Objects.equals(getName(), human.getName()) && Objects.equals(getBirthday(), human.getBirthday()) && Objects.equals(getEmail(), human.getEmail()) && Objects.equals(getAddress(), human.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBirthday(), getPhonenumber(), getEmail(), getAddress());
    }

}

