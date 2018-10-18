import java.util.Scanner;

import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("This program will tell you your letter grade");
        System.out.println("Enter your grade as a percent");
        int grade = console.nextInt();
        //Instead of if statement inside you could just 
        //use if else starting with 90 as if everthing 
        //else as an else if other than the last is just
        //else
        if (grade >=90){
            System.out.println("You got an A");
        }
        if (grade >=80){
            if(grade < 90)
            System.out.println("You got a B");
        }
        if (grade >=70){
            if(grade < 80)
            System.out.println("You got a C");
        }
        else {
            System.out.println("You got a D");
        }
    }
}