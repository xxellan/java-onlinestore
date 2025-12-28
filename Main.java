public class Main {
  public static void main(String[] args) {
    // Создаем товары
    Product laptop = new Product("Ноутбук", 75000.0);
    Product mouse = new Product("Мышка", 1500.0);
    Product keyboard = new Product("Клавиатура", 3000.0);

    // Создаем корзину
    Cart cart = new Cart();

    // Добавляем товары
    cart.addProduct(laptop);
    cart.addProduct(mouse);
    cart.addProduct(keyboard);

    // Печатаем корзину
    cart.printCart();

    // Удаляем товар
    System.out.println("Удаляем: Мышка");
    cart.removeProduct("Мышка");

    // Печатаем корзину снова
    cart.printCart();
  }
}