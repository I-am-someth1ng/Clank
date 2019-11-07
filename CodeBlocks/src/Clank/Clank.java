import java.util.Scanner;

public class PointsProgram {
    
    public static void main(String[] args) throws Exception {
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
        while(currentMealPoints<0)
        {
            System.out.println("invalid number of days, please input a number greater than 0 (if you are an international student, I am sorry.)");
            scnr.nextDouble();
        }
        System.out.println("Please enter the amount of weeks left in the semester (default is 16 weeks). ");
        weeksLeft = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter how many days a week do you intend to use meal points to eat on campus");
        daysForMealPlan = scnr.nextInt();
        while(daysForMealPlan > 7 || daysForMealPlan<=0)
        {
            System.out.println("invalid number of days, please input a number between 1 and 7 (inclusive.)");
            daysForMealPlan = scnr.nextInt();
        }
        // math time
        endingPoints = currentMealPoints / weeksLeft;
        endingPoints = (int)(endingPoints * 100);
        endingPoints = (double)(endingPoints / 100);
        System.out.print("You can spend " + endingPoints + " points a week on meals and ");
        endingPoints /= daysForMealPlan; 
        endingPoints = (int)(endingPoints * 100);
        endingPoints = (double)(endingPoints / 100);
        System.out.print(endingPoints + " points a day if you intend on using points " + daysForMealPlan + " days a week");

    }
}
