package net.start.shopexample.objects.shopEmployeer;

import net.start.shopexample.objects.interfaces.BankInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class Banker extends BaseEmployee {

    private BankInterface bank; //Композиция

    public void sendRequest(){}
}
