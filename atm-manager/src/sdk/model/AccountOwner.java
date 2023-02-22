package sdk.model;

public class AccountOwner {

    private String name;
    private String surname;
    private byte eta;
    private String username;
    private String Id;


    public AccountOwner(String name, String surname, byte eta) {
        this.name = name;
        this.surname = surname;
        this.eta = eta;
        this.username = name + surname + eta;
        this.Id = (eta * 2) + surname;
    }

    public AccountOwner(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.username = name + surname;
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

    public byte getEta() {
        return eta;
    }

    public void setEta(byte eta) {
        this.eta = eta;
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
