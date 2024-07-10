/* 4. Write a class declare 5 static variables and assign values using reference in main method. */

public class Mobile {
    public static String brand;
    public static String model;
    public static int price;
    public static boolean isSmartphone;
    public static String color;

    public static void main(String[] args) {
	
        brand = "Samsung";
        model = "Galaxy S20";
        price = 120000;
        isSmartphone = true;
        color = "Black";

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Smartphone: " + isSmartphone);
        System.out.println("Color: " + color);
    }
}
