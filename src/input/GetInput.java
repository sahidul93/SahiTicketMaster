package input;

import java.util.Scanner;

public class GetInput {

    int ticket = 10;
    Scanner scanner;
    String[] eventName = new String[ticket];   //Enter an Event Name
    int[] ticketQuantity = new int[ticket];   //Enter Ticket Qty
    double[] price = new double[ticket];       // Price for that event
    double[] cash = new double[ticket];        // cash for that event

    public void getInput(int counter) { //get input method with parameters int counter
        boolean valid  = false; //initiate a decision based condition = set condition to prove it isnt false

        while (valid == false) ; // while decsion based condition is set to prove is it false
        scanner = new Scanner(System.in); // initiant new scanner into the system
        System.out.println("Enter Event name"); // outputing a string to the user
        eventName[counter] = scanner.nextLine(); //and if the event name is withing the paramerters of counter then initiate the scanner to the next line

        if (!eventName[counter].matches("[a-zA-Z]+")) {  // if eventName does not match the parameters in counter such as uppercase and lowercase alphabets
            System.out.println("Invalid entry. Please enter letters only"); // then print out to the user that their entry was invald and why
        } else { // else
            valid = true; // set the decesion based condition to equal ture
        }

        valid = false; // set condition to prove it isnt false
        while (valid == false) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Enter amount of Ticket Quantity: ");
                price[counter] = scanner.nextInt();
                if (price[counter] >= 0 && price[counter] <= 100) {
                    valid = true;

                } else {
                    valid = false;
                    System.out.println("Please enter a number between 0 - 100");
                }
            }
            catch (Exception e) {
                System.out.println("Not a valid entry. Please enter a number");
            }
        }
        valid = false;
        while (valid == false) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Enter price of Ticket: ");
                ticketQuantity[counter] = scanner.nextInt();
                if (ticketQuantity[counter] >= 0 && ticketQuantity[counter] <= 1000) {
                    valid = true;

                } else {
                    valid = false;
                    System.out.println("Please enter number between 0 - 1000");

                }
            }
            catch(Exception e){
                    System.out.println("Not a valid entry. Please enter a number");
                }
            }
        valid = false;
        while (valid == false) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Enter cash received: ");
                cash[counter] = scanner.nextInt();
                if (cash[counter] >= 0 && cash[counter] <= 1000) {
                    valid = true;

                } else {
                    valid = false;
                    System.out.println("Please enter a dollar amount between 0 - 10000");

                }
            }
            catch(Exception e){
                System.out.println("Not a valid entry. Please enter a number");
            }
        }
        }
    }











