import creature.Animal;
import creature.Dog;
import creature.Eagle;

public class Main {
    public static void main(String[] args){
      Animal anim = new Animal();


        Animal dog = new Dog();
        Animal eagle = new Eagle();

        anim.animalSound();
        dog.animalSound();
        eagle.animalSound();

    }
}
