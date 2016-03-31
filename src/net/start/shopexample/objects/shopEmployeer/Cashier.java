package net.start.shopexample.objects.shopEmployeer;

/**
 * Created by McLoy on 29.03.2016.
 */
public class Cashier extends BaseEmployee{
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void takeMoney(){}

    public void tookMoneyIn(){}

    public void giveDelivery(){}

    public void giveCheck(){}

    public void giveMoneyForReturn(){}
}
