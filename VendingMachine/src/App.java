import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.Product;
import Services.CoinDispencer;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        // полиморфизм
        Product item3 = new Bottle("Mineral water", 101, (float) 1.5);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder(10, 10);
        CoinDispencer disp = new CoinDispencer(120);

        VendingMachine vendMach1 = new VendingMachine(hold1, disp, assort);

        for (Product prod : vendMach1.getProductList()) {
            System.out.println(prod);
        }
    }
}
