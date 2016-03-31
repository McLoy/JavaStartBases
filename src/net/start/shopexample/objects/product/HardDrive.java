package net.start.shopexample.objects.product;

/**
 * Created by McLoy on 31.03.2016.
 */
public class HardDrive extends ElectronicDevice{

    private int volume;

    public void format(){}

    public void copy(){}

    public void delete(){}

    @Override
    public void on(){
        //специфичное включение жесткого диска
    }

    @Override
    public void off(){
        //специфичное выключение жесткого диска
    }
}
