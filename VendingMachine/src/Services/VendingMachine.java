package Services;

import java.util.List;

import Domen.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispencer dispenser;
    private List<Product> productList;

    public VendingMachine(Holder holder, CoinDispencer dispenser, List<Product> productList) {

        this.holder = holder;
        this.dispenser = dispenser;
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return productList.get(index);
    }

    public void release() {

    }

    public List<Product> getProductList() {
        return productList;
    }
}