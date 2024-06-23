package duke.choice;

public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size;
    // EJ.6.3
    static private double minimumPrice = 10;
    static private double taxRate = 0.2;

    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
        this.size = "M";
        /*
        // SCOPE AND ACCESS DEMO 1
        this.minimumPrice = 10;
        this.taxRate = 0.2;
        */
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

    public static double getMinimumPrice() {
        return minimumPrice;
    }

    public static void setMinimumPrice(double minimumPrice) {
        Clothing.minimumPrice = minimumPrice;
    }

    public static double getTaxRate() {
        return taxRate;
    }

    public static void setTaxRate(double taxRate) {
        Clothing.taxRate = taxRate;
    }

    // EJ.8.1
    @Override
    public String toString() {
        return description + '\'' +
                ", price: $" + price +
                ", size: '" + size + '\'' +
                ", minimum price: $" + minimumPrice +
                ", tax rate: " + taxRate +
                '}';
    }

    // EJ.8.2
    public int compareTo(Clothing c) {
        if (this.getPrice()>c.getPrice()) {

            return -1;
        }else if (this.getPrice()<c.getPrice()) {
            return 1;
        }else {
            return 0;
        }
    }
}
