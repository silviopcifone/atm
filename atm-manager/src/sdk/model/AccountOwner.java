package sdk.model;

public class AccountOwner extends User {
    private String ID;
    private int age;
    private String name;
    private String surname;
    private String username;
    public AccountOwner(String name, String surname, int age) {
        super(name, surname);
        setName(name);
        setSurname(surname);
        this.age = age;
        this.username = name + surname + age;
        this.ID = age * 2 + surname;
    }
    public AccountOwner(String name, String surname) {
        super(name, surname);
        this.username = name + surname;
        this.ID = 0 + surname;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
}
