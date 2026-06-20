package datastructuresandalgorithms;

import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    //override toString method for easy display of product information
    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class Ecommercesearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return products[i];
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(109, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(107, "Bag", "Fashion")
        };
        int targetId = 103;
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, targetId);
        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found");
        // Sort products by productId for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, targetId);
        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found");
    }
}