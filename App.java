package angelo.zoo.com;


// Angelo Andrade
// 9/26/24
// App.java

//Driver file for the zoo midterm program

public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my Zoo Program");

        System.out.println("\n Number of animals is: " + angelo.zoo.com.Animal.numOfAnimals);

        angelo.zoo.com.Animal myAnimal = new angelo.zoo.com.Animal();
        myAnimal.setAnimalName("my first name");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        angelo.zoo.com.Animal anotherAnimal = new angelo.zoo.com.Animal("Zig");
        System.out.println("\n The name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.println("\n Number of animals is: " + angelo.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        angelo.zoo.com.Hyena aNewHyena = new angelo.zoo.com.Hyena("Kamari");

        System.out.println(" The nw hyena's name is: " + aNewHyena.getAnimalName());
        System.out.println("the number of animals: " + angelo.zoo.com.Animal.numOfAnimals);


    }
}