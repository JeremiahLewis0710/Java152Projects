package ZooProject;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by jeremiahlewis on 10/13/16.
 */
public class Visitors extends People {
    String firstTime;
    ArrayList<Visitors> visitorlist = new ArrayList<>();
    String fileName = "visitors.txt";


    public Visitors(String n, String g, int a, String p, String f) {
        super(n, g, a, p);
        firstTime = f;
    }


    public void createVisitor() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));

        System.out.println("Welcome to the Java Zoo, what is your name?");
        Scanner listName = new Scanner(System.in);
        String named = listName.nextLine();

        System.out.println("What is your gender? Male/Female");
        Scanner listGender = new Scanner(System.in);
        String mof = listGender.nextLine();

        System.out.println("What is your age?");
        Scanner listAge = new Scanner(System.in);
        int ages = listAge.nextInt();

        System.out.println("What is your phone number? ex 6062861234");
        Scanner num = new Scanner(System.in);
        String phone = num.nextLine();

        System.out.println("Is this your first visit to our Zoo?");
        Scanner yesorno = new Scanner(System.in);
        String yaynay = yesorno.nextLine();

        name = named;
        gender = mof;
        age = ages;
        phonenum = phone;
        firstTime = yaynay;

        Visitors object = new Visitors(name, gender, age,  phonenum, firstTime );
        visitorlist.add(object);
        outFile.println(object.name);
        outFile.println(object.gender);
        outFile.println(object.age);
        outFile.println(object.phonenum);
        outFile.println(object.firstTime);
        outFile.close();

        }





    }


