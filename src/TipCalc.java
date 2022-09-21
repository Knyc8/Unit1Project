import java.util.Scanner;

public class TipCalc {
    static public void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Input the total bill: ");
        double totBill = s.nextDouble();                                                    //saves the total bill
        System.out.print("Input the tip percentage (without %): ");
        int tipPer = s.nextInt();                                                           //saves the tip percentage
        System.out.print("Input the number of people: ");
        int numPpl = s.nextInt();                                                           //saves the number of people

        double totTip = totBill * ((double) tipPer/100);                                    //total tip amount
        totBill += totTip;                                                                  //total bill with tip
        double tipPerPson = totTip/numPpl;                                                  //total tip per person
        double totPerPson = totBill/numPpl;                                                 //total cost per person

        System.out.println("-------------------------------------");
        System.out.printf("Total Tip Amount: $%.2f\n", totTip);
        System.out.printf("Total Bill With Tip: $%.2f\n", totBill);
        System.out.printf("Tip Per Person: $%.2f\n", tipPerPson);
        System.out.printf("Total Cost Per Person: $%.2f\n", totPerPson);
    }
}
