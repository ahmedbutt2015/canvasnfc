package com.example.dev.fyp.Helper;

import java.lang.reflect.Array;
import java.util.HashMap;

/**
 * Created by dev on 9/1/16.
 */
public class TagPosition {

    private static HashMap<String,int[]> tag = new HashMap<>();

    static {

        tag.put("semc://liveware/A1/1/NT1/2/smarttags",new int[] {800,2080});
        tag.put("semc://liveware/A1/1/NT1/3/smarttags",new int[] {600,1000});
    }

    public static int[] getXYAxis(String s){

        return  tag.get(s);
    }
}
