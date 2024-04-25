import java.util.Scanner;

public class FurnitureStore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Furniture chair = new Chair();
        Furniture sofa = new Sofa();
        Furniture table = new Table();

        ShippingCost visitor = new StandardShippingCost();

        System.out.print("Enter the distance in kilometer/s:");
        double distance = input.nextInt(); 

        System.out.println("Shipping cost for Chair: " + chair.accept(visitor, distance));
        System.out.println("Shipping cost for Sofa: " + sofa.accept(visitor, distance));
        System.out.println("Shipping cost for Table: " + table.accept(visitor, distance));
    }
}
