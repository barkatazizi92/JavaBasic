package class21;

public class BankAccount {
    private String name;
    private String userName;
    private String password;

    BankAccount(String name, String userName, String password){
        this.name=name;
        this.password=password;
        this.userName=userName;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return name;
    }
}
