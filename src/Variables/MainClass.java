package Variables;

//Добавимо нову бібліотеку Scanner у наш клас. Вона надає можливість використовувати сканер для вводу даних :

import java.util.Scanner;
import java.util.Locale;

public class MainClass {

    //Створюємо постійні ціни на товар
    private static final double SMARTPHONE_PRICE = 305.99;
    private static final double LAPTOP_PRICE = 570.95;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        //Налаштовуємо сканер та локейл :
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Order №1. Please, tell me your name :");
        String name = input.nextLine();
        System.out.println("What type of product do you want to buy?  :");
        String product = input.nextLine();
        System.out.println("What's your address street?");
        String street = input.nextLine();
        System.out.println("What's your house number?");
        int house = input.nextInt();

        System.out.println("\nOrder №1.\nClient : " + name + ".\nProduct : " + product + ", price " + CURRENCY + SMARTPHONE_PRICE + ".\nAddress : " + street + ", " + house + ".\n");

        //Очищуємо наш сканер аби після int не було перешкод :
        input.nextLine();

        System.out.println("Order №2. Please, tell me your name :");
        name = input.nextLine();
        System.out.println("What type of product do you want to buy? :");
        product = input.nextLine();
        System.out.println("What's your address street?");
        street = input.nextLine();
        System.out.println("What's your house number?");
        house = input.nextInt();

        System.out.println("\nOrder №2.\nClient : " + name + ".\nProduct : " + product + ", price " + CURRENCY + LAPTOP_PRICE + ".\nAddress : " + street + ", " + house + ".");

    }
}
