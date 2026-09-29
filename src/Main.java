
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int quantity =3;
        double unitPrice = 24.99;
        String name = "Wireless Mouse";
        boolean inStock = true;

        double total = quantity * unitPrice;
        System.out.println( "Total price : " + total);
        System.out.println("Mouse x 3 : " + total);

        // --- Activity 3: arrays and control flow ---
        String[] names  = { "Wireless Mouse", "27-inch Monitor",
                "USB-C Cable", "Mechanical Keyboard" };
        double[] prices = { 24.99, 249.99, 8.50, 119.00 };

        double catalogueTotal = 0;
        for (int i = 0; i < names.length; i++) {
            catalogueTotal = catalogueTotal + prices[i];
            if (prices[i] > 100) {
                System.out.println(names[i] + " - " + prices[i] + " - premium");
            } else {
                System.out.println(names[i] + " - " + prices[i] + " - standard");
            }
        }
        System.out.println("Catalogue total: " + catalogueTotal);
    }




}