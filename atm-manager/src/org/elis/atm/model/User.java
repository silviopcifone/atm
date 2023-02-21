package org.elis.atm.model;

public class User {
    private final int ID;
    private String Id;
    private String name;
    private String surname;
    private String username;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = name + surname;
        this.ID = generate();
    }

    public int generate() {
        return 1;
    }

    public int getID() {
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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
