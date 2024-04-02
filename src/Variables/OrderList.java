package Variables;

import java.util.*;

public class OrderList {

    public static List<Order> newOrderList() {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        String userName, productName = null, street;
        int houseNumber = 0, counter = 0, ordersLength, choice = 0;
        double productPrice = 0;

        List<Order> orders = new ArrayList<>();
        System.out.print("Please, choose the number of orders do you want to create: ");
        ordersLength = input.nextInt();

        for (int i = 0; i < ordersLength; i++) {

            input.nextLine();
            counter++;
            System.out.printf("Order №%d)%nPlease, tell me your name: ", counter);
            userName = input.nextLine();

            try {
                do {
                    System.out.println("""
                        What type of product do you want to buy?:
                        1) Smartphone
                        2) Laptop
                        3) Tv""");
                    choice = input.nextInt();
                } while (choice < 1 || choice > 3);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }


            switch (choice) {
                case 1:
                    productName = "Smartphone";
                    productPrice = Constants.SMARTPHONE_PRICE;
                    break;
                case 2:
                    productName = "Laptop";
                    productPrice = Constants.LAPTOP_PRICE;
                    break;
                case 3:
                    productName = "TV";
                    productPrice = Constants.TV_PRICE;
                    break;
            }

            input.nextLine();
            System.out.println("What's your address street?");
            street = input.nextLine();

            try {
                System.out.println("What's your house number?");
                houseNumber = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }


            orders.add(new Order(counter, userName, productName, productPrice, street, houseNumber));
        }

        return orders;
    }

    public static void showOrderList(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
