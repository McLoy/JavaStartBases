package net.start.shopexample.objects.service;

import net.start.shopexample.objects.products.Computer;
import net.start.shopexample.objects.products.TV;
import net.start.shopexample.objects.shopEmployeers.Seller;

/**
 * Created by McLoy on 29.03.2016.
 */
public class Department {
    String name;
    Seller Consultant1;
    Computer Comp1;
    Computer Comp2;
    TV tv1;
    TV tv2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
