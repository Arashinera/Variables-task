package Variables;

//Добавимо нову бібліотеку Scanner у наш клас. Вона надає можливість використовувати сканер для вводу даних :

import java.util.Scanner;
import java.util.Locale;

public class MainClass {

    //Створюємо константи :
    private static final double SMARTPHONE_PRICE = 305.99;
    private static final double LAPTOP_PRICE = 570.95;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        //Налаштовуємо сканер та локейл :
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        String userName, productName, street;
        int houseNumber;

        System.out.println("Order №1\nPlease, tell me your name :");
        userName = input.nextLine();
        System.out.println("What type of product do you want to buy?  :");
        productName = input.nextLine();
        System.out.println("What's your address street?");
        street = input.nextLine();
        System.out.println("What's your house number?");
        houseNumber = input.nextInt();

        System.out.println("\nOrder №1\nClient : " + userName + ".\nProduct : " + productName + ", price " + CURRENCY + SMARTPHONE_PRICE + ".\nAddress : " + street + ", " + houseNumber + ".\n");

        //Очищуємо наш сканер аби після int не було перешкод :
        input.nextLine();

        System.out.println("Order №2\nPlease, tell me your name :");
        userName = input.nextLine();
        System.out.println("What type of product do you want to buy? :");
        productName = input.nextLine();
        System.out.println("What's your address street?");
        street = input.nextLine();
        System.out.println("What's your house number?");
        houseNumber = input.nextInt();

        System.out.println("\nOrder №2\nClient : " + userName + ".\nProduct : " + productName + ", price " + CURRENCY + LAPTOP_PRICE + ".\nAddress : " + street + ", " + houseNumber + ".");

    }
}
