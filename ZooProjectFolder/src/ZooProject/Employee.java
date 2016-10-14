package ZooProject;

/**
 * Created by jeremiahlewis on 10/14/16.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee extends People {
    String exhibit;
    ArrayList<Employee> employeelist = new ArrayList<>();
    String fileName = "employee.txt";
    EmployeeMenu em1 = new EmployeeMenu();

    public Employee(String n, String g, int a,String e, String p) {
        super(n, g, a, p);
        exhibit = e;
    }

    void createEmployee() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));

        System.out.println("Welcome to the Java Zoo Database, please confirm your identity.");
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

        System.out.println("What is your exhibit? ");
        Scanner yesorno = new Scanner(System.in);
        String whereExhibit = yesorno.nextLine();

        name = named;
        gender = mof;
        age = ages;
        phonenum = phone;
        exhibit = whereExhibit;

        Employee object = new Employee(name, gender, age,  phonenum, exhibit );
        employeelist.add(object);
        outFile.println(object.name);
        outFile.println(object.gender);
        outFile.println(object.age);
        outFile.println(object.phonenum);
        outFile.println(object.exhibit);
        outFile.close();

        em1.employeeMenuList();



    }


}
