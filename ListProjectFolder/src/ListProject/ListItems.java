package ListProject;

/**
 * Created by jeremiahlewis on 10/11/16.
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class ListItems {
    ArrayList<String> myList = new ArrayList<>();
    String fileName = "list.txt";



    public void Listings() throws IOException {
        Menu m1 = new Menu();

        while (true) {
            //Starting to have the user list items
            System.out.println("List item: ");
            Scanner listing = new Scanner(System.in);
            String item = listing.nextLine();
            //adding the users input to an array
            myList.add(item);
            //Repeat if user wants to
            System.out.println("Would you like to add another item? y/n");
            Scanner choice = new Scanner(System.in);
            char yesorno = choice.next().charAt(0);

            if(yesorno == 'y'){
                continue;
            }
            else{
                System.out.println("Your list items have been saved");
            }
//            Allowing the user to see their current list
            System.out.println("Would you like to review your list?");
            Scanner review = new Scanner(System.in);
            char yesorno1 = review.next().charAt(0);

            if (yesorno1 == 'y'){
                for (String i : myList){
                    System.out.println(i);
                }
            }

            else{
                //Will return to the menu if the user doesn't want to see the list
                m1.MenuList();
                break;
            }

            System.out.println("Enter 'd' if you would like to delete an item from your list");
            System.out.println("Enter 'm' if you would like to return to the menu");
            Scanner deleteItem = new Scanner(System.in);
            char delete = deleteItem.next().charAt(0);

            if(delete =='d'){
                while(true) {
                    System.out.println("Which item do you want to delete? ");
                    Scanner stuff = new Scanner(System.in);
                    String item1 = stuff.nextLine();
                    myList.remove(item1);

                    System.out.println("Would you like to delete another item? y/n");
                    Scanner delete1 = new Scanner(System.in);
                    char again = delete1.next().charAt(0);
                    if(again == 'y'){
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }

            else if(delete == 'm'){
                m1.MenuList();
            }
            System.out.println(" Would you like to see the updated list?");
            Scanner yesorno2 = new Scanner(System.in);
            char yaynay = yesorno2.next().charAt(0);
            if(yaynay =='y'){
                for(String i : myList) {
                    System.out.println(i);
                }
            }
            else{
                m1.MenuList();
                break;
            }


        }

    }




}
