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

       int AdultTicket = 10;
       int ChildTicket = 6;
       double interest = 0.2;
       int AdultPrice = 0;
       int ChildPrice = 0;

       AdultTicket x AdultSold=AdultPrice;

       System.out.println(AdultPrice);

    }
    
}
