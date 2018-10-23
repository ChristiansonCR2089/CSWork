import java.util.Scanner;
public class Assignment2{
    public static String monthstring;
    public static int month;
    public static int day;
    public static int Last2;
    public static int First2;
    public static int year;
    public static String DayofWeek;
    public static int DayofWeekint;
    public static void main(String[] args)
    {
        dateenter();
        findmonth();
        dayFinder();
        printday();
    }
    public static void dateenter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter the first two digits year of the day you would like to check.(Example for 2018 enter 20)");
        First2 =reader.nextInt();
        System.out.println("Please Enter the last two digits year of the day you would like to check.(Example for 2018 enter 18)");
        Last2 =reader.nextInt();
        System.out.println("Please Enter the  year of the day you would like to check.(Example 2018)");
        year =reader.nextInt();
        System.out.println("Please Enter the month of the day you would like to check.(example october, no capitals)");
        monthstring =reader.next();
        System.out.println("Please Enter the day of the day you would like to check.(example 23)");
        day =reader.nextInt();
        System.out.println(monthstring);
    }
    public static void findmonth(){
        if(monthstring.equals("march")){
            month=1;
        }else if (monthstring.equals("april")){
            month=2;
        }else if (monthstring.equals("may")){
            month=3;
        }else if (monthstring.equals("june")){
            month=4;
        }else if (monthstring.equals("july")){
            month=5;
        }else if (monthstring.equals("august")){
            month=6;
        }else if (monthstring.equals("september")){
            month=7;
        }else if (monthstring.equals("october")){
            month=8;
        }else if (monthstring.equals("november")){
            month=9;
        }else if (monthstring.equals("december")){
            month=10;
        }else if (monthstring.equals("january")){
            month=11;
            Last2=Last2-1;
        }else if (monthstring.equals("febuary")){
            month=12;
            Last2=Last2-1;
        }else{
            System.out.println("No valid month entered");
        }
    }
    public static void dayFinder(){
        DayofWeekint=day+((13*month-1)/5)+Last2+(Last2/4)+(First2/4)-2*First2;
            DayofWeekint=DayofWeekint%7;
        if (DayofWeekint==1){
            DayofWeek="Monday";
        }else if(DayofWeekint==2){
            DayofWeek="Tuesday";
        }else if(DayofWeekint==3){
            DayofWeek="Wednesday";
        }else if(DayofWeekint==4){
            DayofWeek="thursday";
        }else if(DayofWeekint==5){
            DayofWeek="Friday";
        }else if(DayofWeekint==6){
            DayofWeek="Saturday";
        }else{
            DayofWeek="Sunday";
        }
    }
    public static void printday(){
        System.out.println(monthstring+" "+day+" "+year+" was a "+DayofWeek);
    }
}