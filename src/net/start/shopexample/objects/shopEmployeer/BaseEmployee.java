package net.start.shopexample.objects.shopEmployeer;

import net.start.shopexample.objects.department.BaseDepartment;
import net.start.shopexample.objects.interfaces.DepartmentInterface;
import net.start.shopexample.objects.interfaces.EmployeeInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public abstract class BaseEmployee implements EmployeeInterface{

    private String name;

    private DepartmentInterface department;

    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
