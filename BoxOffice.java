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

      Sy

    }
    
}
