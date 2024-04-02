import duke.choice.Clothing;
import duke.choice.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {
}

public static void main(String[] args) {
    double total = 0;
    // EJ.1
    // System.out.println("Welcome to Duke Choice Shop!");

    //EJ.2
    Customer c1 = new Customer();
    c1.setName("Pinky");
    c1.setSize(3);
    System.out.println("Welcome to Duke Choice Shop, " + c1.getName() + "!");

    // EJ.3
    Clothing item1 = new Clothing("Blue Jacket", 20.9);
    Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
    // LOOPS DEMO 2
    Clothing item3 = new Clothing("Green Scarf", 5, "S");
    Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

    // ARRAYS DEMO
    ArrayList<Clothing> clothings = new ArrayList<>();
    clothings.add(item1);
    clothings.add(item2);
    clothings.add(item3);
    clothings.add(item4);

    System.out.println("We have available: ");
    int j = 1;
    for (Clothing clothing : clothings) {
        System.out.println(j + ". " + clothing.getDescription() + "at $" + clothing.getPrice());
        j++;
    }
    System.out.println("How many items do you want to buy?");
    Scanner scanner = new Scanner(System.in);
    int decision = scanner.nextInt();
    for (int i = 0; i < decision; i++) {
        System.out.println("What item do you buy?");
        Scanner scanner2 = new Scanner(System.in);
        int buyItem = scanner.nextInt();
        switch (buyItem){
            case 1:
                c1.addItems(item1);
            case 2:
                c1.addItems(item2);
                break;
            case 3:
                c1.addItems(item3);
            case 4:
                c1.addItems(item4);
                break;
            default:
                System.out.println("Invalid number of item");
                break;
        }
        System.out.println("Item added to the cart");
    }

    /* for (Clothing clothing : buyClothings) {
        // LOOPS DEMO 2
        if(clothing.getSize() == c1.getSize()) {
            total += clothing.getPrice();
        }
        if (total > 15){
            break;
        }
    } */

    System.out.println("Your total would be: $" + c1.getTotalClothingCost());
}
