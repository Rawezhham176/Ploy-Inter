package creature;

import interfaces.LivingBeing;

public class Human implements LivingBeing {

    private boolean breath;
    private boolean think;
    private boolean isAlive;
    private String Name;

    public Human() {
    }

    public Human(boolean breath) {
        this.breath = breath;
    }

    public Human(boolean breath, boolean think) {
        this.breath = breath;
        this.think = think;
    }

    public Human(boolean breath, boolean think, boolean isAlive) {
        this.breath = breath;
        this.think = think;
        this.isAlive = isAlive;
    }

    public Human(boolean breath, boolean think, boolean isAlive, String Name) {
        this.breath = breath;
        this.think = think;
        this.isAlive = isAlive;
        this.Name = Name;
    }


    public boolean isBreath() {
        return breath;
    }

    public void setBreath(boolean breath) {
        this.breath = breath;
    }

    public boolean isThink() {
        return think;
    }

    public void setThink(boolean think) {
        this.think = think;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean breath() {
        return this.breath;
    }

    @Override
    public String eat() {
        return "Everything";
    }


    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}
