package sdk.model;

public class User {

    private String ID;
    private String name;
    private String surname;
    private String username;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = name + surname;

    }

    public User() {

    }

    int generate() {
        return 1;
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
