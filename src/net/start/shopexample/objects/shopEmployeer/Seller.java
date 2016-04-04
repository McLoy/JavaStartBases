package net.start.shopexample.objects.shopEmployeer;

import net.start.shopexample.objects.buyers.Buyer;

/**
 * Created by McLoy on 29.03.2016.
 */
public class Seller extends BaseEmployee{

    public void consult(Buyer buy){
        buy.setConsulted(true);
    }

    public void send(){}

}
