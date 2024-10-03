// Angelo Andrade
// App.java
// 10/3/24
package angelo.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Zoo Program!");

        // This is all the date stuff we did last week
        // The current date
        Date today = new Date();
        // Correct format for today's date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("\n today's date is: " + strTodaysDate);

        // Input for the animal
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        String[] arrOfStrPatternOnComma = strStarting.split(", ");

        // Parsing age and birth season
        String[] arrOfStrPartsOnSpace = arrOfStrPatternOnComma[0].split(" ");
        String ageInYears = arrOfStrPartsOnSpace[0];
        String animalBirthSeason = arrOfStrPartsOnSpace[3]; // Corrected index for season
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        // Calculate the birthdate
        String animalBirthdate = calculateBirthdate(ageInYears, animalBirthSeason, strTodaysYear);
        System.out.println("\n animalBirthdate = " + animalBirthdate);

        // Testing the Animal constructor
        Animal myNewAnimal = new Animal("male", 4, 70, "Zig", "Hy01", animalBirthdate, "brown spots", "from San Diego Zoo");

        // Prove it
        System.out.println("\n this is the new animal!");
        System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");
    }

    // Method to calculate the birthdate based on age and season
    private static String calculateBirthdate(String ageInYears, String animalBirthSeason, String strTodaysYear) {
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);
        String birthdate = "";

        switch (animalBirthSeason.toLowerCase()) {
            case "fall":
                birthdate = animalBirthYear + "-09-21";
                break;
            case "spring":
                birthdate = animalBirthYear + "-03-21";
                break;
            case "summer":
                birthdate = animalBirthYear + "-06-21";
                break;
            case "winter":
                birthdate = animalBirthYear + "-12-21";
                break;
            default:
                birthdate = "Season not recognized";
                break;
        }

        return birthdate;
    }
}
