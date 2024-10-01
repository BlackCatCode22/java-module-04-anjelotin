// Angelo Andrade
// 10/1/2024
// Main.java

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n Welcome to our warm up with the Class Date");

        // The current date
        Date today = new Date();
        // Format for today date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM=dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");
        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("\n today's date is: " + strTodaysDate);


        // Calculate birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for animal and then crete a method that returns a string
        // for the animals birthdate

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season
        //              and then use decision control structures to
        //              calculate the date.

        // parse the sting
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // split the string on ", "
        String[] arrOfStrPatternOnComma = strStarting.split(", ");
        // output for the array element
        // this is a for : each loop - very handy when examining array elements.
        int elementNum;
        for (String thePart : arrOfStrPatternOnComma) {
            System.out.println("element of string: " + thePart);
            elementNum++;
        }
        System.out.println();
        String[] arrOfStrPartsOnSpace = arrOfStrPatternOnComma[0].split(" ");
        for( String thePart : arrOfStrPartsOnSpace) {
            System.out.println("element of string:" + thePart);
        }
        System.out.println();
        String[] arrOfStrPartsOnSpace02 = arrOfStrPatternOnComma[1].split(" ");
        elementNum = 0;
        for( String thePart : arrOfStrPartsOnSpace02) {
            System.out.println("element of string:" + thePart);
        }
        System.out.println();
        String ageInYears = arrOfStrPartsOnSpace[0];
        String animalBirthSeason = arrOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);


        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }

        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
        }

        if ( animalBirthSeason.contains("summer")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
        }
        if ( animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
        }

        System.out.println("\n animalBirthdate = " + animalBirthdate);


    }
}