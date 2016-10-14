/**
 * Created by jeremiahlewis on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class GroceryTotal {
    public void shoppingBill() throws IOException{
        ArrayList<Double> myItemList = new ArrayList<>();
        Menu showMenu = new Menu();

        while(true) {
            System.out.print("Please enter the price of your item: ");
            Scanner myItem = new Scanner(System.in);
            double pricing = myItem.nextDouble();
            myItemList.add(pricing);

            System.out.println("Would you like to add another item? y/n");
            Scanner choice = new Scanner(System.in);
            char yesno = choice.next().charAt(0);

            if(yesno == 'y'){
                continue;
            }
            else if (yesno =='n'){
                double sum = 0;
                double withTax;
                double totalWithTax = 0;
                System.out.println("Your total receipt is listed  as follows: ");

                for(double i : myItemList){
                    System.out.println(i);
                    sum = sum + i;
                    double tax = sum * 0.06;
                    withTax = Math.round(tax*100)/100;
                    totalWithTax = sum + withTax;

                }
                System.out.println("Your total bill is " + totalWithTax);

                }
            System.out.println("Would you like to go back to the menu? y/n");
            Scanner goBack = new Scanner(System.in);
            char yesorno = goBack.next().charAt(0);

            if(yesorno =='y'){
                showMenu.menuList();


            }
            else{
                System.out.println("Thank you for using the Java Calculator");
                break;

            }

        }




    }

}
