public class Product {
    private String name;
    private double price;
    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Красивый вывод
    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}

