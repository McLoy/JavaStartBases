package net.start.shopexample.objects.buyers;

/**
 * Created by McLoy on 29.03.2016.
 */
public class VIPBuyer extends BaseBuyer{

    private float discount;

    @Override
    public void buy(){
        if(!checkDiscount()){
            super.buy();
         } else {
         //buying with discount
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }

}
