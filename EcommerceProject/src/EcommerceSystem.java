import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the E-Commerce System!");

        // Customer details
        System.out.println("Please enter your id:");
        int customerId = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.println("Please enter your name:");
        String customerName = input.nextLine();
        System.out.println("Please enter your address:");
        String customerAddress = input.nextLine();
// like the project told me :(
        Customer customer = new Customer(customerId, customerName, customerAddress);

        // Number of products to add to cart
        System.out.println("How many products you want to add to your cart?");
        int nProducts = input.nextInt();
        input.nextLine(); // Consume newline

        Cart cart = new Cart(customerId, nProducts);

        // Adding products to cart
        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    cart.addProduct(new ElectronicProduct(1, "Smartphone", 1299.99f, "Apple", 1));
                    break;
                case 2:
                    cart.addProduct(new ClothingProduct(2, "T-Shirt", 19.99f, "Medium", "Cotton"));
                    break;
                case 3:
                    cart.addProduct(new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications"));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Calculate total price
        double totalPrice = cart.calculatePrice();
        System.out.println("Your total is $" + totalPrice + ". Would you like to place the order? 1- Yes 2- No");
        int placeOrderChoice = input.nextInt();
        System.out.println("********************************");
        cart.placeOrder(placeOrderChoice);
        input.close();
    }
}