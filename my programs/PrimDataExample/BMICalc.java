import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args)
    {
        //declare variable
        double height;
        double weight;
        double bmi;
        Scanner reader = new Scanner(System.in);

        //compute bmi
        for(;;) {
        System.out.println("What is your height (In Inches): ");
        height=reader.nextDouble();
        System.out.println("What is your weight in ounces: ");
        weight=reader.nextDouble();
        //height = 70;
        //weight = 195;
        bmi = weight/(height*height)+703;

        //Print reseults
        System.out.println("Body Mass Index:");
        System.out.println(bmi);
        System.out.println("Do you want to calculate another BMI? (y/n)");
        boolean KeepGoing = true;
        if (KeepGoing) {
            String input = reader.next();
           if (input.equals("n")) break;
           else if (input.equals("y")) KeepGoing = false;
           else System.out.println("Type y for yes or n for no:");
            }
        }
    }
}