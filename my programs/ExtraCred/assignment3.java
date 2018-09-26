import java.util.Scanner;
public class assignment3
{
    public static void main(String[] args)
{
    calc();
}
public static void calc()
{
    double High=-1999999999;
    double Low=1999999999;
    double Avg;
    int count=-1;
    double sum=0;
    int hold=1;
    Scanner reader = new Scanner(System.in);
    {
        while (hold != 0){
            System.out.println("Please type in a number. type 0 to quit");
            hold =reader.nextInt();
            sum=sum+hold;
            if (hold !=0){
                if (hold>High) High=hold;
                if (hold<Low) Low= hold;
            }
            count++;
        }
        if (hold==0){
            if (count >=1){
                Avg=sum/count;
                System.out.println("The sum of your inputs is: "+sum);
                System.out.println("The total number of inputs you provided was: "+count);
                System.out.println("the average of your inputs is: "+Avg);
                System.out.println("the highest number you input was: "+High);
                System.out.println("the Lowest number you input was: "+Low);
            }
            else if (count <=0){
                System.out.println("You didn't type anything");
            }
        }
    }
    }
}
