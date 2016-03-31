package net.start.shopexample.objects.bank;

import net.start.shopexample.objects.interfaces.BankInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public abstract class BaseBank  implements BankInterface {

    public BaseBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name, creditDescription;

//    public abstract String getInfo();

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
