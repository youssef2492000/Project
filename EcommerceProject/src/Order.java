public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
    public Order(){}

    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = Math.abs(totalPrice);
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " - " + product.getPrice());
        }
    }
}
