package com.example.set;

import java.util.*;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;
 
public class UseOfEnumSet {
 
    public static void main(String[] args)
    {
        // Creating a set
        Set<Gfg> set1;
 
        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,
                          Gfg.LEARN, Gfg.CODE);
 
        System.out.println("Set 1: " + set1);
    }
}
