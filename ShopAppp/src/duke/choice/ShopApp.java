import duke.choice.Clothing;
import duke.choice.Customer;

import java.util.Scanner;

public class ShopApp {
}

public static void main(String[] args) {
    double tax = 0.2;
    double total = 0;
    // EJ.1
    // System.out.println("Welcome to Duke Choice Shop!");

    //EJ.2
    Customer c1 = new Customer();
    c1.setName("Pinky");
    System.out.println("Welcome to Duke Choice Shop, " + c1.getName() + "!");

    // EJ.3
    Clothing item1 = new Clothing("Blue Jacket", 20.9);
    Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

    System.out.println("We have available: ");
    System.out.println("1. " + item1.getDescription() + " at $" + item1.getPrice());
    System.out.println("2. " + item2.getDescription() + " at $" + item2.getPrice());
    System.out.println("How many items do you want to buy?");
    Scanner scanner = new Scanner(System.in);
    int decision = scanner.nextInt();
    for (int i = 0; i < decision; i++) {
        System.out.println("What item do you buy?");
        Scanner scanner2 = new Scanner(System.in);
        int buyItem = scanner.nextInt();
        switch (buyItem){
            case 1:
                total += item1.getPrice();
                break;
            case 2:
                total += item2.getPrice();
                break;
            default:
                System.out.println("Invalid number of item");
        }
        System.out.println("Total: $" + total);
    }
    total += total+tax;
    System.out.println("Your total would be: $" + total);
}
