package net.start.shopexample.objects.service;

import net.start.shopexample.objects.shopEmployeers.Administrator;
import net.start.shopexample.objects.shopEmployeers.Cashier;
import net.start.shopexample.objects.shopEmployeers.Security;

/**
 * Created by McLoy on 29.03.2016.
 */
public class SellerHall {
    int section;
    Department dep;
    Cashier Cash1;
    Security Sec;
    Administrator Admin;


    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
