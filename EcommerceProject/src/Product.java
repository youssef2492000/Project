public class Product {
    protected int productId;
    protected String name;
    protected float price;

    public Product() {
    }

    public Product(int productId, String name, float price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = Math.abs(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public void setproductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getproductId() {
        return productId;
    }
    
}

