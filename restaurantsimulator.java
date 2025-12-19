import java.util.ArrayList;
import java.util.Scanner;
public class restaurantsimulator {
    static class MenuItem {
        String name;
        double price;

        MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();   
        menu.add(new MenuItem("idly", 30));
        menu.add(new MenuItem("dosa", 35));
        menu.add(new MenuItem("vada", 40));
        menu.add(new MenuItem("puri", 45));
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem> order = new ArrayList<>();  
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.println((i + 1) + ". " + item.name + " - Rs" + item.price);
        }
        String choice;
        do {
            System.out.println("Enter the item number to order (or 'done' to finish):");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("done")) {
                try {
                    int itemNumber = Integer.parseInt(choice);
                    if (itemNumber >= 1 && itemNumber <= menu.size()) {
                        order.add(menu.get(itemNumber - 1));
                        System.out.println(menu.get(itemNumber - 1).name + " added to your order.");
                    } else {
                        System.out.println("Invalid item number. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid item number or 'done'.");
                }
            }
        } while (!choice.equalsIgnoreCase("done"));
        double total = 0;
        System.out.println("Your order:");
        for (MenuItem item : order) {
            System.out.println("- " + item.name + " - Rs " + item.price);
            total += item.price;
        }
        System.out.println("Total: Rs " + total);
        scanner.close();  
    }  
}  

