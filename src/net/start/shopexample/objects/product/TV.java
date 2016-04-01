package net.start.shopexample.objects.product;

/**
 * Created by McLoy on 29.03.2016.
 */
public class TV extends ElectronicDevice{

    public TV(String name) {
        super(name);
    }

    public void selectChannel(int chanelNumber){
        System.out.println("chanel number: " + chanelNumber);
    }

    public void selectChannel(String chanelName){
        System.out.println("chanel name: " + chanelName);

    }
}
