import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {


        System.out.println("Choose category.");
        System.out.println("1.Science");
        System.out.println("2.Math");
        System.out.println("3.English");
        System.out.println("Enter the number of the category:");
        Scanner scan = new Scanner (System.in);
        String num = scan.nextLine();
        switch(num){
            case "1":
                System.out.println("How many moons does the Earth have?");
                String answer = scan.nextLine();
                if(answer.equals("1"))
                {
                    System.out.println("Correct! You earned 1 point.");
                    break;
                }
                else{
                    System.out.println("Wrong! You earned 0 points :(");
                    break;
                }
            case "2":
                System.out.println("What is 2^3?");
                String answer2 = scan.nextLine();
                if(answer2.equals("8")){
                    System.out.println("Correct! You earned 1 point.");
                    break;
                }
                else{
                    System.out.println("Wrong! You earned 0 points :(");
                    break;
                }
            case "3":
                System.out.println("Who wrote Les Miserables");
                String answer3 = scan.nextLine();
                if(answer3.equals("Victor Hugo"))
                {
                    System.out.println("Correct! You earned 1 point.");
                    break;
                }
                else{
                    System.out.println("Wrong! You earned 0 points :(");
                    break;
                }
            default:
            {
                System.out.println("Please enter a valid number.");
                break;
            }
        }
    }
}
