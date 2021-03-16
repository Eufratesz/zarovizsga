package kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public Kennel(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }



    public void feedAll() {

    }

    public Dog findByName(String name) {
        for(Dog dog: dogs){
            if(!dog.getName().equals(name)){
                throw new IllegalArgumentException("the dog is not found!");
            }
            if(dog.getName().equals(name)){
                return dog;
            }
        }

        return null;
    }

    public void playWith(String name, int hours) {

    }

    public List<String>getHappyDogNames(int minHappiness){
        List<String>happyDogs = new ArrayList<>();
        for(Dog dog : dogs){
            if(dog.getHappiness() > minHappiness){
                happyDogs.add(dog.getName());
            }
        }
        return happyDogs;
    }

}
