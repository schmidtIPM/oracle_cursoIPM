package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size;

    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
        this.size = "M";
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
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
