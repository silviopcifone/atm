package test;
import org.junit.Test;
import sdk.model.AccountOwner;
import sdk.model.User;

import static org.junit.Assert.assertEquals;
public class TestAccountOwner {


    // username test
    @Test
    public void testAccountOwnerCreation(){
        String name = "Luca";
        String surname = "Bianchi";
        int age = 12;
        String expectedName = name;
        String expectedSurname = surname;
        int  expectedAge = age;
        AccountOwner owner = new AccountOwner(name, surname, age);
        assertEquals(expectedName, owner.getName());
        assertEquals(expectedSurname, owner.getSurname());
        assertEquals(expectedAge, owner.getAge());
    }

    @Test
    public void testAccountOwnerUsername(){
        String name = "Luca";
        String surname = "Bianchi";
        int age = 12;
        String expectedUserName = name + surname + age;

        AccountOwner owner = new AccountOwner(name, surname, age);
        assertEquals(expectedUserName, owner.getUsername());
    }
    @Test
    public void testAccountOwnerUsernameNoAge(){
        String name = "Luca";
        String surname = "Bianchi";
        String expectedUserName = name + surname;

        AccountOwner owner = new AccountOwner(name, surname);
        assertEquals(expectedUserName, owner.getUsername());
    }

    @Test
    public void testAccountOwnerIdGeneration(){
        String name = "Luca";
        String surname = "Bianchi";
        int age = 12;
        String expectedUserId = age * 2 + surname;

        AccountOwner owner = new AccountOwner(name, surname, age);
        assertEquals(expectedUserId, owner.getID());
    }


}
