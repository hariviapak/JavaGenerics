package com.learn;

import com.learn.beans.DVDInfo;

import com.learn.beans.DVDInfoWithComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsComparableExample {
    public static void main(String[] args) {

        List<DVDInfo> dvdInfo=new ArrayList<>();
        dvdInfo.add(new DVDInfo("Donnie Darko","sci-fi", "Gyllenhall"));
        dvdInfo.add(new DVDInfo("jake", "", ""));
        dvdInfo.add(new DVDInfo("Raiders of the Lost Ark", "action", "Ford, Harrison"));
        dvdInfo.add(new DVDInfo("2001", "sci-fi", "??"));
        dvdInfo.add(new DVDInfo("Lost in Translation", "comedy", "Murray, Bill"));

        System.out.println(dvdInfo);
       // Collections.sort(dvdInfo);
        //compilation error as  sort() method
        // takes a List argument, and that the objects in the List
        // must implement an interface called Comparable

        List<DVDInfoWithComparable> dvdInfoWithComparable=new ArrayList<>();
        dvdInfoWithComparable.add(new DVDInfoWithComparable("Donnie Darko","sci-fi", "Gyllenhall"));
        dvdInfoWithComparable.add(new DVDInfoWithComparable("jake", "", ""));
        dvdInfoWithComparable.add(new DVDInfoWithComparable("Raiders of the Lost Ark", "action", "Ford, Harrison"));
        dvdInfoWithComparable.add(new DVDInfoWithComparable("2001", "sci-fi", "??"));
        dvdInfoWithComparable.add(new DVDInfoWithComparable("Lost in Translation", "comedy", "Murray, Bill"));
        Collections.sort(dvdInfoWithComparable);
        System.out.println( dvdInfoWithComparable);




    }
}
