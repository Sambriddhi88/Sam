package Week7.Workshop8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
 {
    // Private attributes
    private String itemName;
    private double itemPrice;
    private int quantity;

    // Constructor to initialize all attributes
    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total price
    public double calculateTotal() {
        return itemPrice * quantity;
    }

    // Method to calculate total price after discount
    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    // Method to display cart details
    public void displayCart() {
        System.out.println("Cart Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: Rs." + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rs." + calculateTotal());
    }
}
