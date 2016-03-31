package net.start.shopexample.objects.buyers;

import net.start.shopexample.objects.interfaces.BuyersInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class BaseBuyer implements BuyersInterface{

    private String name;

    @Override
    public void buy(){

    }
    @Override
    public void returnProduct(){

    }

    @Override
    public String getName(){
        return name;
    }

}
