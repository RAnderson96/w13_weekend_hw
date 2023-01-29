import behaviours.ISell;
import goods.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicShop {

    private static MusicShop instance = null;

    private ArrayList<Product> stock;

    private MusicShop() {
        this.stock = new ArrayList<>();
    }

    public static MusicShop getInstance( ) {
        if (instance == null) {
            instance = new MusicShop();
        }
        return instance;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }

    public void addToStock(Product product){
        this.stock.add(product);
    }
    public void removeFromStock(Product product){
        if (this.stock.contains(product)){
            this.stock.remove(product);
        }
        noStockOfItem(product);
    }

    public String noStockOfItem(Product product){
        return "There is no stock of " + product.getProduct();
    }

    public double getPotentialProfits() {
        double potentialTotalProfit = 0;
        for (Product item : this.stock){
            potentialTotalProfit +=  item.getPriceSold();
        }
        return potentialTotalProfit;
    }
}
