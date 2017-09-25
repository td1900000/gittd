package md.tekwill.shoppingcart;

/**
 * Created by User on 25.09.2017.
 */
public class ShoppingCart2 {
    public static void main(String[] args) {
        double price = 9.2;
        double tax = 4.6;
        int quantity = 3;
        int total = (int) (price + tax * quantity);
        double total1 = (double) (price + tax * quantity);
        String customerName = "Mary Smith";
        String whatDid = "wants to purchase a";
        String itemDescription = "Shirt";
        String s1 = customerName + " " + whatDid + " " + 1 + " " + itemDescription;
        String s2 = "Total cost with tax is:";
        System.out.println(s1);
        System.out.println(s2 + total);
        System.out.println(s2 + total1);


    }
}
