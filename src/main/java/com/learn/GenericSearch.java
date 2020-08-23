package com.learn;

import java.util.*;

public class GenericSearch {
    public static void main(String[] args) {
        String[] sa ={"two","three","one","four","five"};
        // before sorting
        Integer ind=Arrays.binarySearch(sa,"two");
        for(String s : sa)
            System.out.print(s + " ");
        System.out.println("before sorting "+ind);
        Arrays.sort(sa);
        ind=Arrays.binarySearch(sa,"five");
        for(String s : sa)
            System.out.print(s + " ");
        System.out.println("after sorting "+ind);

        Arrays.sort(sa,new ReSortComparator());
        for(String s : sa)
            System.out.print(s + " ");

        ind=Arrays.binarySearch(sa,"five",new ReSortComparator());
        System.out.println("after reverse sorting "+ind);


        List<Integer> iL = new ArrayList<Integer>();
        for(int x=0; x<3; x++)
            iL.add(x);
        Object[] oa = iL.toArray();         // create an Object array
        Integer[] ia2 = new Integer[3];
        ia2 = iL.toArray(ia2);              // create an Integer array

    }

    static class ReSortComparator
            implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }

}
