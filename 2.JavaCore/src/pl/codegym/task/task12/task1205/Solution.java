package pl.codegym.task.task12.task1205;

/* 
Identyfikacja zwierząt
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //tutaj wpisz swój kod

        if(o instanceof Cow)
            return "Cow";
        else if(o instanceof Dog)
            return "Dog";
        else  if (o instanceof Whale)
            return "Whale";
        else
        return "Unknown Animal";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
