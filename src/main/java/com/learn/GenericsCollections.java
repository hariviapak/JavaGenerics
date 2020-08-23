package com.learn;

import java.util.*;

public class GenericsCollections {

    public static void main(String[] args) {

        List<String> list1=new ArrayList<String>();
        List<String> list3=new LinkedList<String>();
        List<Integer> test=new  ArrayList<Integer>(1);
        List<String> list2 = Arrays.asList("hari", "viapak","garg","jelly","ok","not ok");
        System.out.println("add time start in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        list1.addAll(list2);
        System.out.println("add time end in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("remove time start in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        list1.remove("viapak");
        System.out.println("remove time end in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("add time start in LinkedList"+ Calendar.getInstance().getTimeInMillis());
        list3.addAll(list2);
        System.out.println("add time end in LinkedList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("get time end in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println(list1.get(3));
        System.out.println("get time end in ArrayList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("remove time start in LinkedList "+ Calendar.getInstance().getTimeInMillis());
        list3.remove("viapak");
        System.out.println("remove time end in LinkedList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("get time start in LinkedList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println(list3.get(3));
        System.out.println("get time end in LinkedList"+ Calendar.getInstance().getTimeInMillis());
        System.out.println("=========== HashSet =========== ");
        Set<String> hashSet=new HashSet<>();
        hashSet.add("test1");
        hashSet.add("test2");
        hashSet.add("test2");
        hashSet.add("test3");
        hashSet.add("test4");
        System.out.println("Size of Set when two same strings were added in HashSet "+hashSet.size());
        Iterator<String> hashSetItr=hashSet.iterator();
       while(hashSetItr.hasNext()){
           System.out.println(hashSetItr.next());
       }
       System.out.println("=========== LinkedHashSet =========== ");
        Set<String> linkHashSet=new LinkedHashSet<>();
        linkHashSet.add("test1");
        linkHashSet.add("test2");
        linkHashSet.add("test2");
        linkHashSet.add("test3");
        linkHashSet.add("test4");
        System.out.println("Size of Set when two same strings were added in LinkedHashSet "+hashSet.size());
        Iterator<String> linkSetItr=linkHashSet.iterator();
        while(linkSetItr.hasNext()){
            System.out.println(linkSetItr.next());
        }
        System.out.println("=========== TreeSet =========== ");
        Set<Integer> treeSet=new TreeSet<>();
        List<Integer> addList=Arrays.asList(2,5,3,1,56,7,7,8,6,5);
        treeSet.addAll(addList);
        Iterator<Integer> treeSetItr=treeSet.iterator();
        while(treeSetItr.hasNext()){
            System.out.println(treeSetItr.next());
        }

        System.out.println("=========== HashMap =========== ");
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"1");
        hashMap.put(5,"5");
        hashMap.put(2,"2");
        hashMap.put(3,"3");
        hashMap.put(4,"4");
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());

        System.out.println("=========== LinkedHashMap =========== ");
        Map<Integer,String> linkHashMap=new LinkedHashMap<>();
        linkHashMap.put(1,"1");
        linkHashMap.put(5,"5");
        linkHashMap.put(2,"2");
        linkHashMap.put(3,"3");
        linkHashMap.put(4,"4");
        linkHashMap.put(4,"4");
        System.out.println(linkHashMap);
        System.out.println(linkHashMap.keySet());
        System.out.println(linkHashMap.values());
        System.out.println(linkHashMap.entrySet());

        System.out.println("=========== TreeHashMap =========== ");
        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"1");
        treeMap.put(5,"5");
        treeMap.put(2,"2");
        treeMap.put(3,"3");
        treeMap.put(4,"4");
        treeMap.put(4,"4");
        System.out.println(treeMap);
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        System.out.println(treeMap.entrySet());





    }
}
