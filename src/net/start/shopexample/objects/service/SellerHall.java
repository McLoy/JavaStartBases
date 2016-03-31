package net.start.shopexample.objects.service;

import net.start.shopexample.objects.department.BaseDepartment;
import net.start.shopexample.objects.shopEmployeer.Administrator;
import net.start.shopexample.objects.shopEmployeer.Cashier;
import net.start.shopexample.objects.shopEmployeer.Security;

/**
 * Created by McLoy on 29.03.2016.
 */
public class SellerHall {
    int section;
    BaseDepartment dep;
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
