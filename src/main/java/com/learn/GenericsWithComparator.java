package com.learn;

import com.learn.beans.DVDInfo;
import com.learn.sort.DVDInfoGenreSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsWithComparator {
    public static void main(String[] args) {
        List<DVDInfo> dvdInfo=new ArrayList<>();
        dvdInfo.add(new DVDInfo("Donnie Darko","sci-fi", "Gyllenhall"));
        dvdInfo.add(new DVDInfo("jake", "", ""));
        dvdInfo.add(new DVDInfo("Raiders of the Lost Ark", "action", "Ford, Harrison"));
        dvdInfo.add(new DVDInfo("2001", "sci-fi", "??"));
        dvdInfo.add(new DVDInfo("Lost in Translation", "comedy", "Murray, Bill"));
        System.out.println(dvdInfo);

        DVDInfoGenreSort gs = new DVDInfoGenreSort();
        Collections.sort(dvdInfo,gs);
        System.out.println(dvdInfo);




    }


}


