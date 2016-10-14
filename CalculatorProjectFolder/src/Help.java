import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jeremiahlewis on 10/10/16.
 */
public class Help {
    public void helpList() throws IOException{
        Menu nav2Menu = new Menu();
        System.out.print("This will be explaining how to use the program");
        System.out.print("Would you like to be sent back to the menu? y/n ");

        Scanner menuNav = new Scanner(System.in);
        char choice = menuNav.next().charAt(0);

        if(choice =='y'){
            nav2Menu.menuList();
        }
        else if (choice =='n'){
            System.out.print("Thank you for using the Java Calculator!");
        }



    }
}
