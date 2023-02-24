package atm2.model;

import java.util.ArrayList;
import java.util.List;

public class AccountOwner2 {
    public String name;
    public String surname;
    private String username;
    private String Id;

    List<Account2> accounts = new ArrayList<>();
    public byte age;

    public AccountOwner2(String name, String surname,byte age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = name + surname + age;
        this.Id = (age * 2) + surname;
    }

    public AccountOwner2(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.username = name + surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public byte getEta()
    {
        return age;
    }

    public void setEta(byte eta)
    {
        this.age = eta;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getId()
    {
        return Id;
    }

    public void setId(String id) {
        this.Id=id;
    }

    public void setAccount(Account2 account) {
        accounts.add(account);
    }
    public List<Account2> getAccounts() {
        return accounts;
    }

    public void editData(String expectedName, String expectedSurname, byte expectedAge) {
        setName(expectedName);
        setSurname(expectedSurname);
        setEta(expectedAge);
    }
}
