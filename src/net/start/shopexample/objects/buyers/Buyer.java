package net.start.shopexample.objects.buyers;

/**
 * Created by McLoy on 29.03.2016.
 */
public class Buyer {
    String name;

    public Buyer(String name) {
        this.name = name;
        System.out.println("Buyer " + name + " enter shop");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy(){
        System.out.println("Buying product");
    }

    public void returnProduct(){}

}
