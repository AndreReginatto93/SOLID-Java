package LSP.solution;

public class Test {
    public static void getAnimalName(Animal animal){
        animal.getNome();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        getAnimalName(animal);
        getAnimalName(dog);
    }


}
