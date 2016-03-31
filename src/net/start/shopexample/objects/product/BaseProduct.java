package net.start.shopexample.objects.product;

import net.start.shopexample.objects.department.BaseDepartment;
import net.start.shopexample.objects.interfaces.ProductsInteface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class BaseProduct implements ProductsInteface{

    private String name;

    private double price;

    private boolean hasGuarantee;

    private BaseDepartment department;

    private String Firm;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean HasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    @Override
    public String getFirm() {
        return Firm;
    }

    public void setFirm(String firm) {
        Firm = firm;
    }
}
