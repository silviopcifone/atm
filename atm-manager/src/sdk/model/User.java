package sdk.model;

public class User {
    public String ID;
    public String name;
    public String surname;
    public String username;
    public int age;


    public User (String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = name+surname;

    }

    public User (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ID= generate();
        this.username = name + surname + age;
    }

    public String generate() {
        return "1";
    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
