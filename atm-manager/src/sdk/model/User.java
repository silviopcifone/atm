package sdk.model;

public class User {
    public String name;
    public String surname;
    public String username;
    public int age;


    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = name + surname;
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = name + surname + age;
    }
}
