package com.lab1oops.debanjan;
import java.util.Random;


public class CredentialService extends Employee {

    String dept;
    public CredentialService(String firstName, String lastName, String dept)
    {
        super(firstName, lastName);
        this.dept = dept;
    }

    private String generatePassword()
    {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                +"jklmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    private String generateEmailAddress()
    {
        String firstName = getFirstName();
        String lastName = getlastName();
        return firstName+lastName+"@"+dept+".binotech.com";
    }

    public void showCredentials()
    {
        String email =  generateEmailAddress();
        String password = generatePassword();
        System.out.println("Dear "+ getFirstName() +" your generated credentials are as follows");
        System.out.println("Email ---> "+email);
        System.out.println("Password ---> "+password);
    }
}
