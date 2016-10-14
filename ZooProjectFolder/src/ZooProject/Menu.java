package ZooProject;

/**
 * Created by jeremiahlewis on 10/12/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public void menuList() throws IOException{
        Visitors v1 = new Visitors("Jeremiah", "Male", 25, "6062866534", "yes");
        Employee e1 = new Employee("Jeremiah", "Male", 45, "123123123", "monkeys");
        System.out.println("Welcome to the Java Zoo Please tell us who you are");

        System.out.println("1. Visitor");
        System.out.println("2. Employee");

        Scanner choice = new Scanner(System.in);
        int oneor2 = choice.nextInt();

        if(oneor2 ==1){
            v1.createVisitor();
        }
        else if(oneor2 == 2){
            e1.createEmployee();
        }




    }
}
