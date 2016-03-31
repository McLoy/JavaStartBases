package net.start.shopexample.objects.bank;

import net.start.shopexample.objects.interfaces.BankInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class BaseBank  implements BankInterface {
    private String name, creditDescription;

    @Override
    public void checkInfo(){
        //Доработанная Реализация
    }

    @Override
    public void giveCredit(){
        //Доработанная Реализация
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
