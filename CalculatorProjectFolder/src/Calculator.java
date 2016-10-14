import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jeremiahlewis on 10/10/16.
 */
public class Calculator {
    int result;
    char yayNay;

    public void calculate() throws IOException {
        Menu showMenu = new Menu();

        while (true) {
              Scanner calculate1 = new Scanner(System.in);
              int firstNumber;
              System.out.println("Please enter your first number");
              firstNumber = calculate1.nextInt();
              System.out.println(firstNumber);

              Scanner operatorval = new Scanner(System.in);
              String operator;
              System.out.println("Please enter an operator. ex: +, -, /, *");
              operator = operatorval.nextLine();
              System.out.println(operator);

              Scanner calculate2 = new Scanner(System.in);
              int secondNumber;
              System.out.println("Please enter your second number");
              secondNumber = calculate2.nextInt();
              System.out.println(secondNumber);


              if (operator.equals("+")) {
                  result = firstNumber + secondNumber;
                  System.out.println(result);
              } else if (operator.equals("-")) {
                  result = firstNumber - secondNumber;
                  System.out.println(result);
              } else if (operator.equals("*")) {
                  result = firstNumber + secondNumber;
                  System.out.println(result);
              } else if (operator.equals("/")) {
                  result = firstNumber + secondNumber;
                  System.out.println(result);

              }

              String fileName = "answers.txt";
              PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
              outFile.println(result);
              outFile.close();

              Scanner yesorNo = new Scanner(System.in);
              System.out.print("Would you like to enter a new equation");
              yayNay = yesorNo.next().charAt(0);

              if(yayNay =='y'){
                  continue;
              }
              else{
                  showMenu.menuList();
                  break;
              }



          }


      }

}
