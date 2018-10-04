import java.util.Scanner;
import java.util.Random;
public class pokebattle
{
    static Scanner reader = new Scanner(System.in);
    public static String pokemon;
    public static void main(String[] args)
{
    BattleStart();
    damage();
    statsTable();
}
    public static void BattleStart()
    {
        //Starts battle and gets users pokemon
        System.out.println("Red is challenging you to a battle!");
        System.out.println("He chooses Pikachu lvl 88.");
        System.out.print("Who do you choose? ");
        pokemon = reader.nextLine();
        System.out.println("You choose "+ pokemon);
        System.out.println("It's a battle between "+ pokemon +" and Pikchu! Go!");
        System.out.println();
    }
    public static void damage()
    {
        //enemy attcks and deals damage
        System.out.println("Pikachu used Irnon Tail!");
        System.out.println();
        System.out.println("Trainer, what are your "+pokemon+"'s stats?");
        System.out.print("Level: ");
        int lvl= reader.nextInt();
        System.out.print("Attack: ");
        int atk= reader.nextInt();
        System.out.print("Defence: ");
        int def= reader.nextInt();
        System.out.print("Base: ");
        int base= reader.nextInt();
        System.out.print("STAB: ");
        int STAB= reader.nextInt();
        System.out.print("HP: ");
        double hp= reader.nextDouble();
        System.out.println("");
        Random rand = new Random();
        int pickedNumber = rand.nextInt(15) + 85;
        double RNG=pickedNumber*0.1;
        double mod=STAB*RNG;
        double dmg=(((2*lvl+10)/250)+(atk/def)*base+2)*mod;
        hp=hp-dmg;
        System.out.println("");
        System.out.println(pokemon+" sustained "+dmg+" points in damage.");
        System.out.println("After the attack "+pokemon+" has "+hp+" hp left.");
    }
    public static void statsTable()
    {
        System.out.println("What is your pokemon's Level?");
        int lvl= reader.nextInt();
        System.out.println("What is your pokemon's HP?");
        int hp= reader.nextInt();
        System.out.println("What is your pokemon's Attack?");
        int atk= reader.nextInt();
        System.out.println("What is your pokemon's Defence?");
        int def= reader.nextInt();
        System.out.println("What is your pokemon's Special Attack?");
        int spatk= reader.nextInt();
        System.out.println("What is your pokemon's Special Defence?");
        int spdef= reader.nextInt();
        System.out.println("What is your pokemon's Speed?");
        int spd= reader.nextInt();
        System.out.print("");
        String blank= reader.nextLine();
        System.out.println("What is your pokemon's First Move?");
        String move1= reader.nextLine();
        System.out.println("What is your pokemon's Second Move?");
        String move2= reader.nextLine();
        System.out.println("What is your pokemon's Third Move?");
        String move3= reader.nextLine();
        System.out.println("What is your pokemon's Fourth Move");
        String move4= reader.nextLine();
        System.out.println("Name        "+pokemon);
        System.out.println("Level       "+lvl);
        System.out.println("------------------------------");
        System.out.println("HP          "+hp);
        System.out.println("Attack      "+atk);
        System.out.println("Defence     "+def);
        System.out.println("SP. Attack  "+spatk);
        System.out.println("SP. Defence "+spdef);
        System.out.println("Speed       "+spd);
        System.out.println("------------------------------");
        System.out.println("Moves Learned: "+move1+", "+move2+", "+move3+", "+move4);
    }

}