package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog() {

    }
    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("brown",4,true);
        dog.getDescription();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
