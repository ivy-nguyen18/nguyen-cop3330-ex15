package ex15.base;

public class Login {
    private String password;
    private String username;

    public Login(String username, String password){
        this.password = password;
        this.username = username;
    }

    public void validate(String passwordCheck){
        if(password.equals(passwordCheck)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }
    }
}
