package net.start.shopexample.objects.buyers;

import net.start.shopexample.objects.interfaces.BuyersInterface;
import net.start.shopexample.objects.interfaces.ProductsInteface;

/**
 * Created by McLoy on 31.03.2016.
 */
public abstract class BaseBuyer implements BuyersInterface{

    private String name;

    @Override
    public void buy(ProductsInteface products){
        System.out.println(products.getName());
    }
    @Override
    public void returnProduct(ProductsInteface products){

    }

    @Override
    public String getName(){
        return name;
    }

}
