import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Address_book {
    Scanner fetch = new Scanner(System.in);

    //Declare the variables
    String first_name;
    String last_name;
    long phone_no;
    String email;
    int zip_code;
    String city;


    //Using set method to assign variables from the user
    public void set_details(){
        System.out.println("GIVE ME THE FIRST NAME :");
        this.first_name = fetch.nextLine();
        System.out.println("GIVE ME THE LAST NAME :");
        this.last_name = fetch.nextLine();
        System.out.println("GIVE ME THE PHONE NO. :");
        this.phone_no = fetch.nextInt();
        System.out.println("GIVE ME THE EMAIL: ");
        this.email = fetch.next();
        System.out.println("GIVE ME THE ZIP CODE");
        this.zip_code = fetch.nextInt();
        System.out.println("GIVE ME THE CITY :");
        this.city = fetch.next();

    }

    //Display output
    public String toString() {

        return ("FIRST NAME : " + first_name + "\nLAST NAME : " + last_name + "\nPHONE : " + phone_no + "\nEMAIL : " + email + "\nZIP CODE : " + zip_code + "\nCITY : " + city);
    }

    public String getName() {

        return first_name;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creating a list
        List<Address_book> users = new ArrayList<>();

        Address_book salman = new Address_book();//creating salman object
        Address_book tom = new Address_book();// creating tom object
        System.out.println("GIVE ME SALMAN's DETAILS");
        salman.set_details();
        salman.set_details();
        System.out.println("GIVE ME TOM's DETAILS");
        tom.set_details();

        users.add(salman);
        users.add(tom);

        System.out.println("WHAT DO YOU WANT TO DO\n" +
                "1.ADD DETAILS\n 2.EXIT");
        int choice = input.nextInt();


        switch (choice) {

            case 1://Adding entries to the book
                System.out.println("HOW MANY USERS DO YOU WANT TO ADD");
                int user_choice = input.nextInt();
                for (int i = 0; i < user_choice; i++) {
                    Address_book person = new Address_book();
                    person.set_details();
                    users.add(person);
                    System.out.println(person.toString());
                }

                System.out.println("WHAT NEXT DO YOU WANT TO DO\n1.EDIT THE DETAILS\n2.DELETE USER\n3.EXIT");
                int choice2 = input.nextInt();
                switch (choice2) {


                    case 1:
                        System.out.println(users);//if user want to edit the added details
                        System.out.println("WHOSE DETAILS DO YOU WANT TO EDIT");
                        String store = input.next();
                        for (Address_book i : users) {

                            if (i.getName().equals(store)) {

                                //int temporary = users.indexOf(i);
                                System.out.println("CHANGE THE EMAIL :");
                                String changer = input.next();
                                i.email = changer;

                            }

                        }
                        System.out.println(users);
                        break;
                    case 2:
                        System.out.println(users);//if user want to delete the added details
                        System.out.println("WHOSE DETAILS DO YOU WANT TO DELETE");
                        String delete_store = input.next();
                        for (Address_book i : users) {

                            if (i.getName().equals(delete_store)) {

                                users.remove(i);

                            }

                        }
                        System.out.println(users);




                    default:
                        break;
                }
                break;


            default:
                break;


        }


        System.out.println("THE FINAL LIST OF USERS IS");
        System.out.println(users);

    }

}