package com.course.ch11.holdsobject;

import java.util.ArrayList;

/**
 * Created by silver on 2017/4/24.
 */

class GrannySmith extends Apple{

}

class Gala extends Apple{}

class Fuji extends Apple{}

class Braeburn extends Apple{}
public class GenericsAndUpcasting {

    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c:apples){
            System.out.println(c);
        }
    }



}
