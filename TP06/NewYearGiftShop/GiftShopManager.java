package NewYearGiftShop;
import java.util.ArrayList;
import java.util.Scanner;

public class GiftShopManager {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. List all products");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product by index");
            System.out.println("4. Update product");
            System.out.println("5. Exit program");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllProducts(productList);
                    break;
                case 2:
                    addNewProduct(productList, scanner);
                    break;
                case 3:
                    removeProduct(productList, scanner);
                    break;
                case 4:
                    updateProduct(productList, scanner);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void listAllProducts(ArrayList<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("List of all products:");
            System.out.printf("%-10s%-20s%-10s%-15s\n", "Product #", "Name", "Price", "Stock");
            for (int i = 0; i < products.size(); i++) {
                System.out.printf("%-10d%-20s%-10.2f%-15d\n", i + 1, products.get(i).getName(),
                        products.get(i).getPrice(), products.get(i).getStock());
            }
        }
    }

    private static void addNewProduct(ArrayList<Product> products, Scanner scanner) {
        System.out.print("Enter the name of the new product: ");
        String productName = scanner.next();

        System.out.print("Enter the price of the new product: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter the stock of the new product: ");
        int productStock = scanner.nextInt();

        Product newProduct = new Product(productName, productPrice, productStock);
        products.add(newProduct);

        System.out.println("New product added: " + newProduct);
    }

    private static void removeProduct(ArrayList<Product> products, Scanner scanner) {
        listAllProducts(products);

        System.out.print("Enter the index of the product to remove: ");
        int indexToRemove = scanner.nextInt();

        if (indexToRemove >= 1 && indexToRemove <= products.size()) {
            Product removedProduct = products.remove(indexToRemove - 1);
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Invalid product index.");
        }
    }

    private static void updateProduct(ArrayList<Product> products, Scanner scanner) {
        listAllProducts(products);

        System.out.print("Enter the index of the product to update: ");
        int indexToUpdate = scanner.nextInt();

        if (indexToUpdate >= 1 && indexToUpdate <= products.size()) {
            System.out.print("Enter the new name of the product: ");
            String newName = scanner.next();

            System.out.print("Enter the new price of the product: ");
            double newPrice = scanner.nextDouble();

            System.out.print("Enter the new stock of the product: ");
            int newStock = scanner.nextInt();

            Product updatedProduct = products.get(indexToUpdate - 1);
            updatedProduct.setName(newName);
            updatedProduct.setPrice(newPrice);
            updatedProduct.setStock(newStock);

            System.out.println("Product updated: " + updatedProduct);
        } else {
            System.out.println("Invalid product index.");
        }
    }
}

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", stock=" + stock + '}';
    }
}
