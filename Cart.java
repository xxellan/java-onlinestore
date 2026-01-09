import java.util.ArrayList;
public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(name));
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void printCart() {
        System.out.println("=== Корзина ===");
        int i = 1;
        for (Product p : products) {
            System.out.println(i + ". " + p);
            i++;
        }
        System.out.println("Итого: " + getTotal() + " руб.");
    }

}

