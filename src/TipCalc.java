import java.util.Scanner;

public class TipCalc {
    static public void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Input the total bill: ");
        double totBill = s.nextDouble();
        System.out.print("Input the tip percentage (without %): ");
        int tipPer = s.nextInt();
        System.out.print("Input the number of people: ");
        int numPpl = s.nextInt();

        double totTip = totBill * ((double) tipPer/100);
        totBill += totTip;
        double tipPerPson = totTip/numPpl;
        double totPerPson = totBill/numPpl;

        System.out.println(totTip);
        System.out.println(totBill);
        System.out.println(tipPerPson);
        System.out.println(totPerPson);
    }
}
