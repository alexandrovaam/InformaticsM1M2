import java.util.Scanner;
public class GuessingGame {
        public static void main(String[] args) {


            System.out.println("Enter a secret number between 1 and 10(You have 3 attempts to guess):");
            System.out.println("Attempt 1");
            Scanner scan = new Scanner (System.in);
            int guess = scan.nextInt();
            int num = 3;
            int attempt = 3;


            if(attempt>0){
                if(num > guess) {
                    System.out.println("try higher");
                    attempt--;
                }
            }
            if(num < guess)
            {
                System.out.println("try lower");
                attempt--;
            }
            if(num==guess)
            {
                System.out.println("correct");
                System.exit(0);
            }


            System.out.println("Attempt 2");


            if(attempt>0){
                guess=scan.nextInt();
                if(num > guess) {
                    System.out.println("try higher");
                    attempt--;
                }
            }
            if(num < guess)
            {
                System.out.println("try lower");
                attempt--;
            }
            if(num==guess)
            {
                System.out.println("correct");
                System.exit(0);
            }


            System.out.println("Attempt 3");


            if(attempt>0){
                guess=scan.nextInt();
                if(num > guess) {
                    System.out.println("try higher");
                    attempt--;
                }
            }
            if(num < guess)
            {
                System.out.println("try lower");
                attempt--;
            }
            if(num==guess)
            {
                System.out.println("correct");
                System.exit(0);
            }
        }
    }
