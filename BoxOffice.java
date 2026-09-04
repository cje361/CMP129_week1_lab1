import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Movie Name: ");
       String MovieName =input.nextLine();

       System.out.println("Adult tickets Sold: ");
       int AdultSold =input.nextInt();

       System.out.println("Child Tickets Sold: ");
       int ChildSold =input.nextInt();

      double profit = (AdultSold * 10.00) + (ChildSold * 6.00);
      double netprofit = profit * 0.20;
      double distributor = profit - netprofit;

      System.out.println("Movie Name: " + MovieName);
      System.out.println("Adult Tickets Sold: " + AdultSold);
      System.out.println("Children Tickets Sold: " + ChildSold);
      System.out.println("Gross Box Office Profit: $ " + profit);
      System.out.println("Net Box Office Profit: $ " + netprofit);
      System.out.println("Amount Paid to Distributor: $ " + distributor);

    }
    
}
