package net.start.shopexample.objects.interfaces;

/**
 * Created by McLoy on 31.03.2016.
 */
public interface ProductsInteface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();

}
