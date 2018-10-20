package collections;

import generics.Lair;
import generics.Stats;
import generics.dwellers.Orc;
import generics.dwellers.Throll;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList<Customer> customersList = new ArrayList();
//        customersList.add(new Customer("customer1", "Ivanov", "Sidor", new BigDecimal(500)));
//        customersList.add(new Customer("customer2", "Alexander", "Sidorov", new BigDecimal(450)));
//        customersList.add(new Customer("customer3", "Maria", "Ivanova", new BigDecimal(9999)));
//        customersList.add(new Customer("customer4", "Anna", "Petrova", new BigDecimal(100)));
//        printList(customersList);
//        customersList.add(new Customer("customer3", "Maria", "Ivanova", new BigDecimal(9999)));
//        customersList.add(new Customer("customer4", "Anna", "Petrova", new BigDecimal(100)));
//        printList(customersList);
//        customersList.remove(0);
//        customersList.remove(1);
//        customersList.remove(2);
//        printList(customersList);


//        ArrayList<ArrayList<String>>mainList = new ArrayList<ArrayList<String>>();
//        ArrayList<String>names = new ArrayList<String>();
//        ArrayList<String>surnames = new ArrayList<String>();
//        names.add("Petr");
//        names.add("Sidor");
//        surnames.add("Alexandrov");
//        surnames.add("Alexeev");
//        mainList.add(names);
//        mainList.add(surnames);
//
//        for(int i = 0; i < mainList.size(); i++){
//            for(int j = 0; j < mainList.get(i).size(); j++){
//                System.out.print(mainList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

//        Lair<Orc> orcLair = new Lair<Orc>();
//        orcLair.setDweller(new Orc());
//        orcLair.openDoorAll();
//        Lair<Throll> throllLair = new Lair<Throll>();
//        throllLair.setDweller(new Throll());
//        throllLair.openDoorAll();
//
//        List<String> stringList = new ArrayList<String>();
//
//        fill(stringList, "dsadsa");

        Integer[]intNums = {1,2,3,4,5};
        Stats<Integer>intStats = new Stats<Integer>(intNums);
        Double[]doublesNums = {1d,2d,3d,4d,5d};
        Stats<Double>doubleStats = new Stats<Double>(doublesNums);
        System.out.println("int arr average: " + intStats.average());
        System.out.println("double arr average: " + doubleStats.average());

        if(intStats.sameAverage(doubleStats)){
            System.out.println("Average of arrays is equals");
        }else{
            System.out.println("Average of arrays is not equals");
        }

    }

    private static void printList(List<Customer> list){
        for(int i = 0; i < list.size();i++){
            Customer customer = list.get(i);
            System.out.printf("%d)Покупатель:%s%n", i,customer.toString());
        }
    }



    static <T> void fill(List<T> list, T val){
        for(int i = 0; i < list.size();i++){
            list.set(i, val);
        }
    }
}
