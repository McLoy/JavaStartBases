package net.start.shopexample.objects.product;

import net.start.shopexample.objects.interfaces.ElectronicDeviceInterface;

/**
 * Created by McLoy on 31.03.2016.
 */
public class ElectronicDevice extends BaseProduct implements ElectronicDeviceInterface{

    @Override
    public void on(){
        //Общая реализация
    }

    @Override
    public void off(){
        //Общая реализация
    }
}
