package net.start.shopexample.objects.interfaces;

import net.start.shopexample.objects.product.BaseProduct;
import net.start.shopexample.objects.shopEmployeer.BaseEmployee;

import java.util.ArrayList;

/**
 * Created by McLoy on 31.03.2016.
 */
public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<ProductsInteface> getProductList();
}
