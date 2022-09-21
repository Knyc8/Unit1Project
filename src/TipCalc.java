import java.util.Scanner;

public class TipCalc {
    static public void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Input the total bill: ");
        double totBill = s.nextDouble();
        System.out.print("Input the tip percentage (without percent symbol): ");
        int tipPer = s.nextInt();
        System.out.print("Input the number of people: ");
        int numPpl = s.nextInt();

        System.out.println(totBill);
        System.out.println(tipPer);
        System.out.println(numPpl);
    }
}
