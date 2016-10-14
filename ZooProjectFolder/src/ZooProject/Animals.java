package ZooProject;

/**
 * Created by jeremiahlewis on 10/14/16.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class Animals extends Zoo {
    String isAgressive;
    String exhibitLocation;
    String species;
    String fileName = "animals.txt";
    ArrayList<Animals> animalList = new ArrayList<>();


    public Animals(String n, String s, String g, int a, String i, String l) {

        super(n, g, a);
        isAgressive = i;
        exhibitLocation = l;
        species = s;
    }

    public void createAnimal() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        EmployeeMenu em1 = new EmployeeMenu();


        System.out.println("What is the name of the new animal?");
        Scanner listName = new Scanner(System.in);
        String named = listName.nextLine();

        System.out.println("What species?");
        Scanner listSpecies = new Scanner(System.in);
        String nameSpecies = listSpecies.nextLine();

        System.out.println("What gender? Male/Female");
        Scanner maleFemale = new Scanner(System.in);
        String listGender = maleFemale.nextLine();

        System.out.println("What is the current age of the animal? ");
        Scanner listAge = new Scanner(System.in);
        int ageNum = listAge.nextInt();

        System.out.println("What is the current temper of the animal? Aggressive/Non-Aggressive ");
        Scanner angry = new Scanner(System.in);
        String isAngry = angry.nextLine();


        System.out.println("Where will the animal be housed");
        Scanner location = new Scanner(System.in);
        String listLocation = location.nextLine();

        name = named;
        species = nameSpecies;
        gender = listGender;
        age = ageNum;
        isAgressive = isAngry;
        exhibitLocation = listLocation;

        Animals object = new Animals(name, species, gender, age,  isAgressive, exhibitLocation );
        animalList.add(object);

        outFile.println(object.name);
        outFile.println(object.gender);
        outFile.println(object.species);
        outFile.println(object.age);
        outFile.println(object.isAgressive);
        outFile.println(object.exhibitLocation);
        outFile.close();
        em1.employeeMenuList();










    }


}
