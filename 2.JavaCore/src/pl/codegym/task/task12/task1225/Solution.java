package pl.codegym.task.task12.task1225;

/* 
Goście
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //tutaj wpisz swój kod

         if(o instanceof Tiger)
            return "Tiger";
         else if(o instanceof Lion)
             return "Lion";
        else if(o instanceof Cat)
            return "Cat";
        else if(o instanceof Bull)
            return "Bull";
        else if(o instanceof Cow)
            return "Cow";
        else
            return "Animal";
    }

    public static class Cat extends Animal   // <-- Dziedziczenie klasy!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
