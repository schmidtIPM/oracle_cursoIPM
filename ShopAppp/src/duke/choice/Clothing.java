package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size;
    private double minimumPrice;
    private double taxRate;

    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
        this.size = "M";
        // SCOPE AND ACCESS DEMO 1
        this.minimumPrice = 10;
        this.taxRate = 0.2;
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price+taxRate;
    }

    public String getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if (price >= 10){
            this.price = price;
        }
    }

    public void setSize(String size) {
        this.size = size;
    }
}
