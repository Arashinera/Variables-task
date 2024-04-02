package Variables;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class MainClass {

    public static void main(String[] args) {

        int choice = 0;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            do {
                System.out.println("""
                    Welcome to NAVI shop!
                    Choose the option:
                    1) Create orders
                    0) Exit
                    """);

                choice = input.nextInt();

            } while (choice < 0 || choice > 1);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }


        if (choice == 1) {
            List<Order> orderList = OrderList.newOrderList();
            OrderList.showOrderList(orderList);
        } else {
            System.exit(0);
        }
    }
}
