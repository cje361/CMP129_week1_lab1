import java.util.Scanner;
 

public class InterestEarned {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the interest Rate: ");
        double interestrate =input.nextDouble();
        double interestT=interestrate/100;

        System.out.println("What is the number of times interest is compounded: ");
        int compound =input.nextInt();

        System.out.println("What is the Principal: ");
        int principal =input.nextInt();


        double interest= (1 + (interestT/compound));
        interest= Math.pow(interest, compound);
        double amount = principal * interest;
        

        System.out.println("Interest Rate: " + interestrate + "%");
        System.out.println("Times Compounded: " + compound);
        System.out.println("Principal: $ " + principal);
        System.out.println("Interest: $ " + (amount - principal));
        System.out.println("Amount in Savings: $ " + amount);

    }
}
