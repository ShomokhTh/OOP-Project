package lostpropertysystem;

import java.util.*;

/**
 *
 * @author عفراء
 */
public class User {

    private int ID;
    private String password;
    private String name;
    private Date DateOfBirth;
    private Boolean Online = true;

    public User() {
    }

    public User(int ID, String password, String name, Date DateOfBirth) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.DateOfBirth = DateOfBirth;
    }

    public User(int ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Boolean getOnline() {
        return Online;
    }

    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public void print() {
        System.out.println("User{ID=" + ID + ", password=" + password + ", name=" + name + " , DateOfBirth= " + DateOfBirth + " \", Online=\"" + Online + "}");
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.ID;
        hash = 71 * hash + Objects.hashCode(this.password);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.DateOfBirth);
        hash = 71 * hash + Objects.hashCode(this.Online);
        return hash;
    }
    public void logout() {
        Online=!Online;
    }

    public boolean equals(User user) {
        if (this == user) {
            return true;
        }
        if (user == null) {
            return false;
        }
        if (getClass() != user.getClass()) {
            return false;
        }
        final lostpropertysystem.User other = (lostpropertysystem.User) user;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", name=" + name + ", DateOfBirth=" + DateOfBirth + ", Online=" + Online + '}';
    }

}
