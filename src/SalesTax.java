import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesTax {


    private static double calculateSalesTax(double tax, double cost) {

        double taxAmount = cost;
        tax /= 100;
        taxAmount *= tax;
        return taxAmount;
    }

    public static void main( String args[]){
        DecimalFormat df = new DecimalFormat("0.##");
        double cost;
        double tax;
        double taxAmount;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in the sales rate for the item purchased");
        tax = scan.nextDouble();
        System.out.println("Please enter the cost of the item purchased");
        cost = scan.nextDouble();
        taxAmount = calculateSalesTax(tax, cost);
        cost += taxAmount;
        System.out.println("Total Sales Tax: " + taxAmount);
        System.out.println("Total Cost with Tax: " + df.format(cost));

    }

}







