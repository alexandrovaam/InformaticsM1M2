import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("A1 - Soda - Price: $1.50");
        System.out.println("B2 - Chips - Price: $1.25");
        System.out.println("C3 - Candy - Price: $0.75");
        System.out.println("D4 - Water - Price: $1.00");
        System.out.println("Enter the code of the product:");
        Scanner scan = new Scanner (System.in);
        String code = scan.nextLine();
        switch(code){
            case "A1":
                System.out.println("Soda - Price: $1.50");
                break;
            case "B2":
                System.out.println("Chips - Price: $1.25");
                break;
            case "C3":
                System.out.println("Candy - Price: $0.75");
                break;
            case "D4":
                System.out.println("Water - Price: $1.00");
                break;
            default:
                System.out.println("Invalid code");
                break;
        }
    }
}
