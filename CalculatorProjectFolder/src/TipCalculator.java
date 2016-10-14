/**
 * Created by jeremiahlewis on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class TipCalculator {
    public void tipcalc() throws IOException{
        double total;
        double tip = 0;
        int quality;
        Menu showMenu = new Menu();



        Scanner bill = new Scanner(System.in);
        System.out.println("What is your bill total?");
        total = bill.nextDouble();

        Scanner goodorbad = new Scanner(System.in);
        System.out.println("How was your service? Please answer with numbers 1-4"+"\n" +"1. Very Good - 20%"+"\n"+"2. Good - 15%"+"\n"+"3. Bad - 10%"+"\n"+"4. Very Bad - 5%"+"\n");
        quality = goodorbad.nextInt();

        if(quality == 1){
            tip = 0.20;
        }
        else if(quality == 2){
            tip = 0.15;
        }
        else if(quality == 3){
            tip = 0.10;
        }
        else if(quality == 4){
            tip = 0.05;
        }
        double calcTip = total * tip;
        calcTip = Math.round(calcTip*100)/100;
        double withTip = total + calcTip;

        System.out.println("Your total bill without the tip is "+ total);
        System.out.println("Your tip will equal to " + calcTip);
        System.out.print("Your total with the tip will be "+ withTip);

        System.out.print("Would you like to return to the menu? y/n");
        Scanner returnTo = new Scanner(System.in);
        char yesno = returnTo.next().charAt(0);

        if(yesno =='y'){
            showMenu.menuList();
        }
        else if(yesno == 'n'){
            System.out.print("Thank you for using the Java Calculator");
        }



    }
}


