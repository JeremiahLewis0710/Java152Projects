/**
 * Created by jeremiahlewis on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public void menuList() throws IOException{
        System.out.println("Welcome to the Java Calculator. Please select from the list below by pressing a number 1-4");
        System.out.println("1. Calculator");
        System.out.println("2. Tip Calculator");
        System.out.println("3. Grocery Bill");
        System.out.println("4. Help");
        Scanner navigate = new Scanner(System.in);
        int choice = navigate.nextInt();

        Calculator calc = new Calculator();
        TipCalculator tips = new TipCalculator();
        GroceryTotal shopList = new GroceryTotal();
        Help showHelp = new Help();

        if(choice == 1){
            calc.calculate();
        }
        else if(choice == 2){
            tips.tipcalc();
        }
        else if( choice ==3){
            shopList.shoppingBill();
        }
        else if(choice == 4){
            showHelp.helpList();
        }


    }

}
