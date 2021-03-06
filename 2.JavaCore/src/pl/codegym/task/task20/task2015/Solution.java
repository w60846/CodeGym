package pl.codegym.task.task20.task2015;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 
Nadpisywanie serializacji
*/

public class Solution implements Serializable, Runnable {

  transient   private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread( this);
        runner.start();
    }

    public void run() {
        // Zrób tutaj coś, nieważne co.
        System.out.println("Dsada");
    }

    /**
     Nadpisz serializację.
     Aby to zrobić, musisz zadeklarować następujące metody:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Teraz serializacja/deserializacja będzie realizowała nasz scenariusz :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread( this);
        runner.start();
    }

    public static void main(String[] args) {
        Solution s = new Solution(12);


    }
}
