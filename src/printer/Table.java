package printer;
import input.FirstTable;
import input.GetInput;
import input.Calculation;


public class Table {

    public static void main(String[] args) { // main method
        GetInput input = new GetInput(); // declare GetInput and initiate it in your program
        IntroEnd begin = new IntroEnd(); // declare introEnd and initiate it in your program
        FirstTable receipt = new FirstTable(); // declare  and initiate it in your program
        Calculation cal = new Calculation(); // declare GetInput and initiate it in your program
        int counter = 0;

        begin.IntroEnd();

        do {
            input.getInput(counter);
            cal.process(counter);
            receipt.title();
            receipt.finalReceipt(counter);
            counter++;
            for(int i=0; i<counter; i++) {
                receipt.fullTable(i);
            }
        }
        while (true);
    }

}


