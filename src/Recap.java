public class Recap {
    // Activity 22: Find the most expensive product
    public static Product findMostExpensive(Product[] catalogue) {

        // Assume the first product is the most expensive
        Product mostExpensive = catalogue[0];

        // Start at index 1
        for (int i = 1; i < catalogue.length; i++) {

            if (catalogue[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = catalogue[i];
            }
        }
        return mostExpensive;
    }
    public static void main (String[] args){
        // Activity 19: Array of Product object
        Product [] catalogue ={
                new Product(1L, "Wireless Mouse", 24.99),
                new Product(2L, "Mechanical Keyboard", 129.99),
                new Product(3L, "Monitor", 199.99),
                new Product(4L, "USB Cable", 47.51)
        };

        // Running total
        double catalogueTotal = 0;

        // Loop through Product objects
        for (int i = 0; i < catalogue.length; i++) {

            Product product = catalogue[i];

            catalogueTotal += product.getPrice();

            // Premium / standard condition
            if (product.getPrice() > 100) {
                System.out.println(product.getName() + " - " + product.getPrice() + " - premium");
            } else {
                System.out.println(product.getName() + " - " + product.getPrice() + " - standard");
            }
        }

        // Print total
        System.out.println("Catalogue total: " + catalogueTotal);

        // Activity 21: Loop is now much simpler
        for (Product product : catalogue) {
            System.out.println(product.describe());
        }

        // Activity 22: Find most expensive product
        Product mostExpensive = findMostExpensive(catalogue);

        System.out.println("Most expensive: " + mostExpensive.getName());
    }
}