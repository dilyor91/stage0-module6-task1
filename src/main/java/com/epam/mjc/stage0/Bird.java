package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    public Bird() {
      super();
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }

    public static void main(String[] args) {
        Bird bird = new Bird("blue",2,false);
        bird.getDescription();
    }
}
