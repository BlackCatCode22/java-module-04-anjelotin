package angelo.zoo.com;
import java.util.Date;

public class Animal {
    // Create a static int that keep track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects
    public Animal() {
        numOfAnimals++;
    }

    public Animal(String aName){
        this.animalName = aName;
        numOfAnimals++;
    }


    // Create all attributes (fields) that we need.
    // Sex will be 'male' or 'female'
    private String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // a unique ID for each animal
    private String animalID;
    // animal names come from a text file called animalsNames.txt
    private String animalName;
    // animal birthdate.
    private Date animalBirthdate;
    // color of animal
    private String animalColor;
    // animal origin
    private String animalOrigin;
    // Create a getter and setters


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID(){return animalID; }
    public void setAnimalID(String animalID) {this.animalID = animalID; }

    public String getAnimalName(){return animalName;}
    public void setAnimalName(String animalName){this.animalName = animalName; }

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void setAnimalBirthdate(Date animalBirthdate){this.animalBirthdate = animalBirthdate; }

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor(String animalColor){this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin) {this.animalOrigin = animalOrigin;}
}
