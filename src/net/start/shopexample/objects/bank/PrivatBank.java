package net.start.shopexample.objects.bank;

import net.start.shopexample.objects.interfaces.BankInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class PrivatBank extends BaseBank {

    public PrivatBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo(){
       //Доработанная Реализация
    }

    @Override
    public void giveCredit(){
        //Доработанная Реализация
    }
}
