package net.start.shopexample.objects.buyers;

/**
 * Created by McLoy on 29.03.2016.
 */
public class VIPBuyer extends Buyer{
//    String name;
    int discount;

    public VIPBuyer(String name, int discount) {
        super(name);
        this.discount = discount;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void buyWithDiscount(){}

    public void returnProduct(){}
}
