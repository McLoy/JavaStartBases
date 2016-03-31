package net.start.shopexample.objects;

import net.start.shopexample.objects.buyers.Buyer;
import net.start.shopexample.objects.buyers.VIPBuyer;
import net.start.shopexample.objects.shopEmployeer.Seller;

/**
 * Created by McLoy on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Shop");
        Seller seller = new Seller();
        Buyer buyer = new Buyer("Matvey");
        seller.Consultation(buyer);
        buyer.buy();
        VIPBuyer vipbuyer = new VIPBuyer("Tamara", 15);
        seller.Consultation();
        vipbuyer.buy();
        System.out.println("Finish");
    }
}
