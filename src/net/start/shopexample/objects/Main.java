package net.start.shopexample.objects;

import net.start.shopexample.objects.bank.PrivatBank;
import net.start.shopexample.objects.buyers.Buyer;
import net.start.shopexample.objects.department.BaseDepartment;
import net.start.shopexample.objects.department.PCDepartment;
import net.start.shopexample.objects.department.TVDepartment;
import net.start.shopexample.objects.interfaces.DepartmentInterface;
import net.start.shopexample.objects.interfaces.ProductsInteface;
import net.start.shopexample.objects.product.Computer;
import net.start.shopexample.objects.product.Subwoofer;
import net.start.shopexample.objects.product.TV;
import net.start.shopexample.objects.service.SellerHall;
import net.start.shopexample.objects.shopEmployeer.Administrator;

import java.util.ArrayList;

/**
 * Created by McLoy on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        TV tv = new TV("Samsung");
//        Computer computer = new Computer("Apple");
//        Subwoofer subwoofer = new Subwoofer("Microlab");
//
//        Buyer buyer = new Buyer();
//
//        buyer.buy(tv);
//        buyer.buy(computer);
//        buyer.buy(subwoofer);

//        PrivatBank privat = new PrivatBank("Pr", "test desc");
//        privat.checkInfo(true);
//        privat.checkInfo();

//        TV tv = new TV("Samsung");
//        tv.selectChannel(5);
//        tv.selectChannel("Sports");

        ArrayList<DepartmentInterface>  deps = new ArrayList<DepartmentInterface>();
        PCDepartment pcDep = new PCDepartment();
        pcDep.setName("Отдел компьютеров");
        deps.add(pcDep);
        TVDepartment tvDep = new TVDepartment();
        tvDep.setName("Отдел телевизоров");
        deps.add(tvDep);

        ArrayList<ProductsInteface>  goods = new ArrayList<ProductsInteface>();
        for (int i = 0; i < 3; i++) {
            Computer PC = new Computer("Comp " + Integer.toString(i+1));
            goods.add(PC);
        }

        Administrator admin = new Administrator("Матвей");

        SellerHall sh = new SellerHall(deps, "Торговый зал", goods, admin);
        System.out.println("Created shop with hall " + sh.getName());
        System.out.println("Administrator for today: " + sh.getAdministrator().getName());
        if (!goods.isEmpty()){
        System.out.println("Such products are here: ");
        for (int k = 0; k < goods.size(); k++)
            System.out.println(goods.get(k).getName());
        } else {
            System.out.println("There are no products! Sorry!");
        }
//        System.out.println("Such departments are available: " + sh.getDepartmentList());
        if (!deps.isEmpty()){
            System.out.println("Such departments are available: ");
            for (int k = 0; k < deps.size(); k++)
                System.out.println(deps.get(k).getName());
        } else {
            System.out.println("There are no departments!");
        }

        System.out.println("Have a nice day!");



    }
}
