package duke.choice;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String size;
    private ArrayList<Clothing> items = new ArrayList<>();

    public Customer() {
        this.name = "Juan";
        this.size = "M";
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int size){
        // SCOPE AND ACCESS DEMO 2
        switch (size){
            case 1:
                this.size = "S";
                break;
            case 2:
                this.size = "M";
                break;
            case 3:
                this.size = "L";
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
    }
    // OBJECTS DEMO
    public void addItems(Clothing item){
        this.items.add(item);
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }

    public double getTotalClothingCost (){
        double total = 0;
        for (Clothing item : this.items) {
            total += item.getPrice();
        }
        return total;
    }
}
