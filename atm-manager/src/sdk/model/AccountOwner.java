package sdk.model;

public class AccountOwner extends User {

    private int età;
    private String username;
    private String id;



    public AccountOwner(String name, String surname) {
        super(name, surname);
        this.username = name + surname;
    }

    public AccountOwner(String name, String surname, int età) {
        super(name, surname);
        this.età = età;
        this.username = name + surname + età;
        this.id = età*2+surname;
    }


    @Override
    public int generate() {
        int x = super.generate();
        return x + 1;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
