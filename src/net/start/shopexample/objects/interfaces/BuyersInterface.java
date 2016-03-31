package net.start.shopexample.objects.interfaces;

/**
 * Created by McLoy on 31.03.2016.
 */
public interface BuyersInterface {

    void buy(ProductsInteface products);

    void returnProduct(ProductsInteface products);

    String getName();
}
