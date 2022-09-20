import com.lab1oops.debanjan.CredentialService;
import com.lab1oops.debanjan.Department;

public class Main {
    public static void main(String[] args)
    {
        Department d = new Department();
        String dept = d.selectDepartments();

        if (dept == "Wrong Choice") {
            System.out.println("Wrong Choice");
            System.exit(0);
        }

        CredentialService c = new CredentialService("debanjan", "chowdhury", dept);
        c.showCredentials();
    }


}