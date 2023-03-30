package com.example.effective_java.chapter_12_serialization.enum_over_readResolve;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    private final String[] favoriteSongs = {"Hello", "World"};
    private Elvis() {
    }

    public void printFavoriteSongs(){
        System.out.println(Arrays.toString(favoriteSongs));
    }
}
