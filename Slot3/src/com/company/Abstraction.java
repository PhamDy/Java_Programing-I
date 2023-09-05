package com.company;

public abstract class Abstraction {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
    public class Pig extends Abstraction {
        public void animalSound() {

            System.out.println("The pig says: wee wee");
        }
    }
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}



