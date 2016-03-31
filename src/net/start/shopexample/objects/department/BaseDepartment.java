package net.start.shopexample.objects.department;


import net.start.shopexample.objects.interfaces.DepartmentInterface;
import net.start.shopexample.objects.interfaces.EmployeeInterface;
import net.start.shopexample.objects.interfaces.ProductsInteface;

import java.util.ArrayList;

/**
 * Created by McLoy on 29.03.2016.
 */
public class BaseDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<ProductsInteface> productList;
    private ArrayList<EmployeeInterface> employeeList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<ProductsInteface> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<ProductsInteface> productList) {
        this.productList = productList;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }
}
