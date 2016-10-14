package ListProject;

/**
 * Created by jeremiahlewis on 10/11/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    ListItems l1 = new ListItems();
    ViewList l2 = new ViewList();
    Help h1 = new Help();

    public void MenuList() throws IOException{
        System.out.println("WELCOME TO JAVA NOTES" + "\n");
        System.out.println("Please enter the number of the option that you want to get started. ");
        System.out.println("1. Create a List");
        System.out.println("2. Show List");
        System.out.println("3. Help ");
        System.out.println("4. Quit");
        System.out.println("\n");
        Scanner choices = new Scanner(System.in);
        int choice = choices.nextInt();

        if(choice == 1){
            l1.Listings();
        }
        else if(choice == 2){
            l2.ViewListItems();
        }

        else if(choice == 3){
            h1.ListHelp();
        }

        else if(choice == 4){
            System.out.println("Logging Out");
        }





    }
}
