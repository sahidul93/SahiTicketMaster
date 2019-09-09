package input;

public class FirstTable extends Calculation {

    public void finalReceipt(int counter) {
        System.out.println("Thank You For Shopping With Us");

        System.out.println("           Receipt");

        System.out.println("");

        System.out.println("Event Name: " + eventName[counter]);
        System.out.println("Amount of Tickets Purchased: " + ticketQuantity[counter]);
        System.out.println("Price of The Items: $" + price[counter]);
        System.out.println("Sub Total: $" + subTotal[counter]);
        System.out.println("Your Total Discount Is: " + discount[counter]);
        System.out.println("Tax: " + tax[counter]);
        System.out.println("You Grand Total Is : " + total[counter]);
        System.out.println("Cash Received: $" + cash[counter]);
        System.out.println("Change: $" + change[counter]);
    }

    public static void title() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s ", "Event Name", "Ticket Quantity", "Ticket Price", "SubTotal", "Discount", "Tax", "Total", "Cash", "Change");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    }

    public void fullTable(int counter) {

        System.out.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s ", eventName[counter], ticketQuantity[counter], price[counter], subTotal[counter], discount[counter], tax[counter], total[counter], cash[counter], change[counter]);
        System.out.println();
    }



}


