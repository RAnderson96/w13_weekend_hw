package goods;

import behaviours.ISell;

public class Product {
    private ISell product;
    private double priceBought;
    private double priceSold;

    public Product(ISell product, double priceBought) {
        this.product = product;
        this.priceBought = priceBought;
        this.priceSold = product.calculateMarkup() * this.priceBought;
    }

    public ISell getProduct() {
        return product;
    }

    public void setProduct(ISell product) {
        this.product = product;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public void setPriceSold(double priceSold) {
        this.priceSold = priceSold;
    }



}
