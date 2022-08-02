package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog() {
        super();
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color,numberOfPaws,hasFur);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly brown. It has 4 paws and a fur.";
    }

    public static void main(String[] args) {
        Animal dog =  new Dog("brown",4,true);
        dog.getDescription();
    }
}
