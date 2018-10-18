import java.util.Scanner;
public class Collab
{
    public static void main(String[] args)
{
    calc();
}
public static void calc()
{
    //set up needed variables
    double High=-1999999999;
    double EvenHigh=-1999999999;
    double Low=1999999999;
    int count=-1;
    double sum=0;
    int hold=1;
    Scanner reader = new Scanner(System.in);
    {
        while (hold != 0){
            //if they entered a number ecept zero(zero is quit)
            System.out.println("Please type in a number. type 0 to quit");
            hold =reader.nextInt();
            if (hold !=0){
                //sets new highs and lows
                if (hold>High) High=hold;
                if (hold<Low) Low= hold;
            }
            if (hold%2==0){
                sum=sum+hold;
                if (EvenHigh<hold){
                    EvenHigh=hold;
                }
            }
            count++;
        }
        if (hold==0){
            if (count >=1){
                //Prints sum, high, and low
                System.out.println("The sum of your even inputs is: "+sum);
                System.out.println("the highest number you input was: "+High);
                System.out.println("the highest even number you input was: "+EvenHigh);
                System.out.println("the Lowest number you input was: "+Low);
            }
            // if they didn't enter a number before quiting
            else if (count <=0){
                System.out.println("You didn't type anything");
            }
        }
    }
    }
}