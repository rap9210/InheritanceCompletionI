import java.text.NumberFormat;
import java.util.Locale;

public abstract class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    //equals() now returns true when false and vice versa
    @Override
    public boolean equals(Object obj) {
        return !super.equals(obj);
    }

    public String  getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        String formatPrice = NumberFormat.getCurrencyInstance().format(price);

    return formatPrice;}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
