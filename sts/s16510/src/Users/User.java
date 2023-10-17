package Users;

import java.util.ArrayList;

public class User {
    private String id;
    private String fullName;
    private String emailAddress;
    private int age;

    public User(String id, String fullName, String emailAddress, int age, ArrayList<String> al) {
        this.id = id;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.al = al;
    }

    ArrayList<String> al=new ArrayList<>();
    private int access_level;
    private int maximumLimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getAccess_level() {
        return access_level;
    }

    public void setAccess_level(int access_level) {
        this.access_level = access_level;
    }

    public int getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(int maximumLimit) {
        this.maximumLimit = maximumLimit;
    }
}
