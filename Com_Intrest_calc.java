import java.util.Scanner;

public class Com_Intrest_calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double princable,rate,amount;
        int timesComponded,years;

        System.out.print("Enter the princable amount: ");
        princable = input.nextDouble();
        System.out.print("Enter the intrest rate (in %):  ");
        rate = input.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year:  ");
        timesComponded = input.nextInt();
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        
        amount = princable * Math.pow(1 + (rate/timesComponded),timesComponded*years);

        System.out.printf("Final amountafter %d years is R%,.2f \n",years,amount);

        input.close();
    }
}
