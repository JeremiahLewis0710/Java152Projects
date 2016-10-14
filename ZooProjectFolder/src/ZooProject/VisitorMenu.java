package ZooProject;

/**
 * Created by jeremiahlewis on 10/14/16.
 */
import java.util.Scanner;
public class VisitorMenu {
    public void visitorMenuList(){
        System.out.println("What would you like to do?");
        System.out.println("1. View Animals");
        System.out.println("2. Log Out");

        Scanner userinput = new Scanner(System.in);
        int choice = userinput.nextInt();

        if(choice ==1 ){
            //v1.animallist();
        }



    }
}
