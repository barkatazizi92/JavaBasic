package class18;
/*
Write program: User that has a constructor that initializes instance variable name and mobile number. Create
a subclass/child class  userInfo that will have user address variable and it also being initialized through
constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */

public class User {

    private String name;
    private int mobileNumber;

    public User(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName(){
        return name+" "+mobileNumber;
    }
}
class UserInfo extends User{
    private String address;

    public UserInfo( String name, int mobileNumber,String address) {
       super(name,mobileNumber);
       this.address=address;
    }
    public void userDetails() {
        System.out.println(getName()+" "+address);
    }
}

class UserTester {
    public static void main(String[] args) {
        UserInfo use = new UserInfo("Hamid", 233455667, "Dc");
        use.userDetails();


    }
}
