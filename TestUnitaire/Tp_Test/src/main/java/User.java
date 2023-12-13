import java.lang.*;

public class User
{
    String firstname;
    String lastname;
    String password;
    String  email;
    int age;


    void setToNull()
    {
        this.firstname = null;
        this.lastname = null;
        this.age = 0;
        this.password = null;
    }

    public boolean isValidEmail(String email)
    {
        return email.matches("^[a-z]*@[a-z]*\\.[a-z]*$");
    }


    public boolean isValidPassword(String password)
    {
        if(password.matches("^(?=.*[A-Z])(?=.*[0-9]).+$"))
            if(password.length() >= 8)
                return password.length() <= 40;

        return false;
    }

    public boolean isValidAge(int age)
    {
        return age >= 13 && age <= 120;
    }

    boolean isUserValid()
    {
        if(isValidEmail(this.email)) {
            if (isValidPassword(this.password)) {
                if (isValidAge(this.age)) {
                    System.out.println("User is valid");
                    return true;
                } else {
                    System.out.println("User is not valid");
                    setToNull();
                    return false;
                }
            } else {
                System.out.println("User is not valid");
                setToNull();
                return false;
            }
        }

        return false;
    }



    public User(String firstname,String lastname, String password,String email,int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.email = email;

    }



}
