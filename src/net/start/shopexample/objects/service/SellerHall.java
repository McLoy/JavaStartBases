package net.start.shopexample.objects.service;

import net.start.shopexample.objects.department.BaseDepartment;
import net.start.shopexample.objects.interfaces.DepartmentInterface;
import net.start.shopexample.objects.interfaces.ProductsInteface;
import net.start.shopexample.objects.product.BaseProduct;
import net.start.shopexample.objects.shopEmployeer.Administrator;

import java.util.ArrayList;

/**
 * Created by McLoy on 29.03.2016.
 */
public class SellerHall {

    private ArrayList<DepartmentInterface> departmentList;

    private String name;

    private ArrayList<ProductsInteface> productList;

    private Administrator administrator;

    public SellerHall(ArrayList<DepartmentInterface> departmentList, String name, ArrayList<ProductsInteface> productList, Administrator administrator) {
        this.departmentList = departmentList;
        this.name = name;
        this.productList = productList;
        this.administrator = administrator;
    }

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<DepartmentInterface> departmentList) {
        this.departmentList = departmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ProductsInteface> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductsInteface> productList) {
        this.productList = productList;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
