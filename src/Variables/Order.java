package Variables;

public class Order {

    private final int counter;
    private final String userName;
    private final String productName;
    private final double price;
    private final String streetName;
    private final int houseNumber;

    public Order(int counter, String userName, String productName, double price, String streetName, int houseNumber) {
        this.counter = counter;
        this.userName = userName;
        this.productName = productName;
        this.price = price;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Order number " + counter
                + "\nClient: " + userName
                + "\nProduct: " + productName
                + "\nPrice: " + Constants.CURRENCY + "\n" + price
                + "\nAdress: " + streetName
                + "\nHouse: " + houseNumber + "\n";
    }
}
