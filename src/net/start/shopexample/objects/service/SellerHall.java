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

}
