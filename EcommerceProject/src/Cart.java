public class Cart {

    private int customerId;
    private int nProduct;
    private Product[] products;

    public Cart() {
    }

    public Cart(int customerId, int nProduct) {
        this.customerId = Math.abs(customerId);
        this.nProduct = Math.abs(nProduct);
        this.products = new Product[nProduct];
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setnProduct(int nProduct) {
        this.nProduct = Math.abs(nProduct);
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getnProduct() {
        return nProduct;
    }

    public Product[] getProducts() {

        return products;
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
        }

        return totalPrice;
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                this.nProduct++;
                break;
            }
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                products[i] = null;
                this.nProduct--;
                break;
            }

        }
    }

    public void placeOrder(int a) {
        Order order = new Order(customerId, 1, products, calculatePrice());
        switch (a) {
            case 1:
                System.out.println("here's your order's summary");
                order.printOrderInfo();
                break;
            case 2:
                System.out.println("okay you will buy next time :)");
            default:
                System.out.println("invalid value ");
                break;
        }
    }
}