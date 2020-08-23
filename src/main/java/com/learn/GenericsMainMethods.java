package com.learn;


import com.learn.beans.*;

import java.util.HashMap;


public class GenericsMainMethods {

    public static void main(String[] args) {
        GenericsMainMethods gen=new GenericsMainMethods();
        System.out.println(gen);
        Bob bob=new Bob("Bobby",25);
        Bob bob1=new Bob("Bobby",25);
        Bob bob2=bob;
        System.out.println(bob.toString());
        //objects referring to different objects with same attributes
        System.out.println(bob1==bob);//false
        System.out.println(bob1.equals(bob));//false
        //objects referring to same objects
        System.out.println(bob2==bob);//false
        System.out.println(bob2.equals(bob));//false
        String hari=new String("hari");
        String hari1=new String("hari");
        System.out.println("Two different String objects with same content using == operator " + (hari==hari1));
        System.out.println("Two different String objects with same content using equals operator "+ hari.equals(hari1));

        String hariStr="hari";
        String hariStr1="hari";
        System.out.println("Two different String references with same content using == operator "+(hariStr==hariStr1));
        System.out.println("Two different String references with same content using equals operator "+hariStr.equals(hariStr1));

        //why we need to override equals()

        Car car=new Car("red","bmw 720",7535);
        Person person=new Person("Hari",25);
        HashMap map=new HashMap<Car,Person>();
        Object put = map.put(car, person);
        System.out.println("Map values after put "+ map.values());
        System.out.println("Map values for same key used to insert value "+ map.containsKey(car));
        System.out.println("Map values for different key but same content  "+ map.containsKey(new Car("red","bmw 720",7535)));

        Car1 car1=new Car1("red","bmw 720",7535);
        HashMap map1=new HashMap<Car,Person>();
        Object put1 = map1.put(car1, person);
        System.out.println("Map values after put "+ map1.values());
        System.out.println("Map values for same key used to insert value "+ map1.get(car1));
        System.out.println("Map values for different key but same content and overridden equals() "+ map1.get(new Car1("red","bmw 720",7535)));
        // override equals method will help us in case of data structures that use equivalenc
        // y for searching for—and/or retrieving—an object but in above example
        // it will return false because hash values are different as hashmap
        // check the hashvalue of the key to locate it and then runs the equals method
        System.out.println(" equals test on car1 "+car1.equals(null));


        Car2 car2=new Car2("red","bmw 720",7535);
        HashMap map2=new HashMap<Car,Person>();
        Object put2 = map2.put(car2, person);
        System.out.println("Map values after put "+ map2.values());
        System.out.println("Map values for same key used to insert value "+ map2.get(car2));
        System.out.println("Map values for different key but same content and overridden equals() and hashcode "+ map2.get(new Car2("red","bmw 720",7535)));



    }

}
