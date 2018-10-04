/*
Create a program that calculates the expierence for different situations
Requirments:
stats a re private(hidden from player)
if you want to know expierence you have to calculate it
formula found on Bulbipedia
must get hp input
*/
import java.util.*;
public class parameter2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This system calculates user EV.");
        System.out.println("Input your pokemon satts below:");
        System.out.println("Enter Hp");
        int hp = userInput.nextInt();
        System.out.println("Enter level");
        int lvl = userInput.nextInt();
        System.out.println("Enter initial value");
        int IV = userInput.nextInt();
        System.out.println("Enter base hp");
        int basehp = userInput.nextInt();
        int ev = ((hp-10)*100 / lvl-2*basehp-IV-100)*4;
    }
}