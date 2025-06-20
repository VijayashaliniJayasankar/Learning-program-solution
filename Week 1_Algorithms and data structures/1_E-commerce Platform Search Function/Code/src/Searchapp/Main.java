package Searchapp;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(201, "Laptop", "Electronics"),
            new Product(301, "Saree", "Clothing"),
            new Product(401, "Phone", "Electronics"),
            new Product(150, "Watch", "Accessories")
        };

        int searchId = 301;

      
        System.out.println("\n Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, searchId);
        System.out.println(result1 != null ? result1 : "Product not found");

   
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

      
        System.out.println("\n Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, searchId);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
