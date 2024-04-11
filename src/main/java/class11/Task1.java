package class11;

public class Task1 {

    public static void main(String[] args) {
        String userName = "Kabulgood";
        String password = "OneTWoThree";
        String comPass = password;

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("User name or password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(userName)){
            System.out.println("password cannot contains user name");
        }else if (password.contains(comPass)){
            System.out.println("passwords do not match");
        }else if(userName.contains(userName) && password.contains(password)){
            System.out.println("Your user name and password has been created");
        }




    }
}
