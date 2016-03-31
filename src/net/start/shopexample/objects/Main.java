package net.start.shopexample.objects;

import net.start.shopexample.objects.buyers.Buyer;
import net.start.shopexample.objects.product.Computer;
import net.start.shopexample.objects.product.Subwoofer;
import net.start.shopexample.objects.product.TV;

/**
 * Created by McLoy on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        Computer computer = new Computer("Apple");
        Subwoofer subwoofer = new Subwoofer("Microlab");

        Buyer buyer = new Buyer();

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(subwoofer);
    }
}
