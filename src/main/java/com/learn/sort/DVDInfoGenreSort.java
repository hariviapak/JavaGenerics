package com.learn.sort;

import com.learn.beans.DVDInfo;

import java.util.Comparator;

public class DVDInfoGenreSort implements Comparator<DVDInfo> {
    public int compare(DVDInfo one, DVDInfo two) {
        return one.getGenre().compareTo(two.getGenre());
    }
}
