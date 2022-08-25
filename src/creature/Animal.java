package creature;

import interfaces.LivingBeing;

public class Animal implements LivingBeing {

    private boolean isAlive;
    private int legs;
    private int eyes;
    private boolean wings;
    private int hands;
    private boolean canSwim;
    private boolean canFly;
    private String eat;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public Animal() {
    }

    public Animal(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Animal(boolean isAlive, int legs) {
        this.isAlive = isAlive;
        this.legs = legs;
    }
    public Animal(boolean isAlive, int legs, int eyes) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
    }
    public Animal(boolean isAlive, int legs, int eyes, boolean wings) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
        this.wings = wings;
    }
    public Animal(boolean isAlive, int legs, int eyes, boolean wings, int hands) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
        this.wings = wings;
        this.hands = hands;
    }
    public Animal(boolean isAlive, int legs, int eyes, boolean wings, int hands, boolean canSwim) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
        this.wings = wings;
        this.hands = hands;
        this.canSwim = canSwim;
    }

    public Animal(boolean isAlive, int legs, int eyes, boolean wings, int hands, boolean canSwim, boolean canFly) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
        this.wings = wings;
        this.hands = hands;
        this.canSwim = canSwim;
        this.canFly = canFly;
    }

    public Animal(boolean isAlive, int legs, int eyes, boolean wings, int hands, boolean canSwim, boolean canFly, String eat) {
        this.isAlive = isAlive;
        this.legs = legs;
        this.eyes = eyes;
        this.wings = wings;
        this.hands = hands;
        this.canSwim = canSwim;
        this.canFly = canFly;
        this.eat = eat;
    }


    public void animalSound() {
        System.out.println("This animal makes a nice sound");
    }

    @Override
    public boolean breath() {
        return this.isAlive;
    }

    @Override
    public String eat() {
        return this.eat;
    }


    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}
