package module7.practice.stores;

public class Store <T extends SuperProduct> {
    private String name;
    private String address;
    private T products;

    public Store(String name, String address, T products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public T getProducts() {
        return products;
    }

    public void setProducts(T products) {
        this.products = products;
    }
}
