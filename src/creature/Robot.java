package creature;

import interfaces.LivingBeing;

public class Robot implements LivingBeing {

    private String name;
    private int legs;
    private int arms;
    private int tail;
    private int wings;
    private boolean think;
    private boolean isAlive;


    public Robot(String name){
        this.name = name;
    }

    public Robot(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public Robot(String name, int legs, int arms){
        this.name = name;
        this.legs = legs;
        this.arms = arms;
    }

    public Robot(String name, int legs, int arms, int tail){
        this.name = name;
        this.legs = legs;
        this.arms = arms;
        this.tail = tail;
    }


    public Robot(String name, int legs, int arms, int tail, int wings) {
        this.name = name;
        this.legs = legs;
        this.arms = arms;
        this.tail = tail;
        this.wings = wings;

    }

    public Robot(String name, int legs, int arms, int tail, int wings, boolean think) {
        this.name = name;
        this.legs = legs;
        this.arms = arms;
        this.tail = tail;
        this.wings = wings;
        this.think = think;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public boolean isThink() {
        return think;
    }

    public void setThink(boolean think) {
        this.think = think;
    }

    @Override
    public boolean breath() {
        return false;
    }

    @Override
    public String eat() {
        return "Energy";
    }


    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}
