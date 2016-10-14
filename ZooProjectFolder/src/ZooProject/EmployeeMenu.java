package ZooProject;

/**
 * Created by jeremiahlewis on 10/14/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class EmployeeMenu {
    Animals a1 = new Animals("monkey", "ape", "male", 23, "Non-Agressive", "Tree House");
    public void employeeMenuList() throws IOException{
        System.out.println("Select an action");
        System.out.println("1. Add an animal");
        System.out.println("2. Log Out");

        Scanner employeeinput = new Scanner(System.in);
        int choice = employeeinput.nextInt();

        if(choice ==1 ){
            a1.createAnimal();
        }
        else if(choice == 2){
            System.out.println("Logging Out");
        }

    }
}
