package Clank;

import java.util.Scanner;

public class Clank
{
    
    public static void main(String[] args) throws Exception 
    {
        Scanner scnr = new Scanner(System.in);
        // all default values intended to be changed
        double currentMealPoints = 700;
        //double mealPointsSpentAWeek = 0;
        //int swipesAWeek = 6;
        int weeksLeft = 16;
        double endingPoints = 0;
        int daysForMealPlan = 0;
        System.out.println("Thank you for using the meal point calculator.  Please enter how many points you want to calculate for");    
        currentMealPoints = scnr.nextDouble();
        scnr.nextLine();
        System.out.println("Please enter the amount of weeks left in the semester (default=16 weeks ) ");
        weeksLeft = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter how many days you intend to use meal points to eat on campus");
        daysForMealPlan  = scnr.nextInt();
        if(daysForMealPlan >7)
        {

        }
        // math time
        endingPoints = currentMealPoints / weeksLeft;
        System.out.print("You can spend " + endingPoints + " a week on meals and ");
        endingPoints /= daysForMealPlan; 
        System.out.print(endingPoints + " a day if you intend on using points " + daysForMealPlan + " days a week");





    }
}
/*
What it should do:
How many points to spend on a meal
How many to spend a week
Take in how many meals a person plans on eating at on campus restaurants
(optional) give a response to what a person says is their favorite restaurant on campus
Take in how many weeks into the semester they are
Take in how many meal points they started with and how many they have now
provide meal plan options and let them choose one or choose a custom meal plan
*/
