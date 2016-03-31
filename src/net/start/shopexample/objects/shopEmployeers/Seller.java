package net.start.shopexample.objects.shopEmployeers;

import net.start.shopexample.objects.buyers.Buyer;

/**
 * Created by McLoy on 29.03.2016.
 */
public class Seller {
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

    public void Consultation(){
        System.out.println("Seller made consultation");
    }

    public void Consultation(Buyer BB){
        System.out.println("Seller made consultation for:" + BB.getName());
    }

    public void setStampOnWarranty(){}

    public void transportationOfProductToCashier(){}
}
