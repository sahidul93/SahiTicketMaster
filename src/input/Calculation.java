package input;

public class Calculation extends GetInput{

    int ticket = 10;
    double [] subTotal = new double [ticket];
    double [] tax = new double [ticket];
    double [] change = new double [ticket];
    double [] total = new double [ticket];
    double [] discount = new double [ticket];

    public void process(int counter) {
        subTotal[counter] = subTotal(counter);
        tax[counter] = tax(counter);
        change[counter] = change(counter);
        total[counter] = total(counter);
        discount[counter] = discount(counter);
    }

    public double subTotal (int counter) {
        return ticketQuantity[counter]*price[counter];

    }

    public double discount (int counter) {
        if (subTotal[counter] >= 100 && subTotal[counter] <= 200) {
            return subTotal[counter] * .10;
        } else if (subTotal[counter] >= 200 && subTotal[counter] <= 350) {
            return subTotal[counter] * .20;
        } else if (subTotal[counter] >= 350 && subTotal[counter] <= 500) {
            return subTotal[counter] * .25;
        } else if (subTotal[counter] >= 500 && subTotal[counter] <= 750) {
            return subTotal[counter] * .30;
        } else if (subTotal[counter] >= 750 && subTotal[counter] <= 1000) {
            return subTotal[counter] * .35;
        } else if (subTotal[counter] > 1000) {
            return subTotal[counter] * .40;
        }else {
            return 0;
        }
    }

    public double tax (int counter) {
        return subTotal(counter) * .0875;
    }


    public double change (int counter) {
        return total[counter]-cash[counter] ;
    }

    public double total (int counter) {
        return subTotal(counter) + discount(counter) + tax(counter);
    }

}



