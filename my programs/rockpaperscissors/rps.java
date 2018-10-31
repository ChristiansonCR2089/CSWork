import java.util.Scanner;
import java.util.Random;
public class rps{
    public static void main(String[] args)
    {
        rockpaperscissors();
    }
    public static void rockpaperscissors()
    {
        String player = "";
        String computer = "";
        int quit = 1;
        int wins=0;
        int losses=0;
        double winloss;
        Scanner reader = new Scanner(System.in);
        while (quit !=0){
            System.out.println("Do you want to play Rock Paper Scissors? If yes enter 1, but if not enter 0");
            quit = reader.nextInt();
            if (quit !=0){
                System.out.println("Please choose R for Rock,P for Paper, or S for Scissors");
                player = reader.next();
                player=player.toUpperCase();
                Random rand = new Random();
                int pickedNumber = rand.nextInt(3)+1;
                if (pickedNumber==1){
                    computer="R";
                }
                else if (pickedNumber==2){
                    computer="P";
                }
                else{
                    computer="S";
                }
                if (player.equals(computer)){
                    System.out.println("It was a Tie");
                }
                else if(player.equals("R")){
                    if (computer.equals("P")){
                        System.out.println("You choose Rock and the computer choose Paper");
                        System.out.println("You lost");
                        losses=losses+1;
                    }
                    else{
                        System.out.println("You choose Rock and the computer choose Scissors");
                        System.out.println("You won!");
                        wins=wins+1;
                    }
                }
                else if(player.equals("P")){
                    if (computer.equals("S")){
                        System.out.println("You choose Paper and the computer choose Scissors");
                        System.out.println("You lost");
                        losses=losses+1;
                    }
                    else{
                        System.out.println("You choose Paper and the computer choose Rock");
                        System.out.println("You won!");
                        wins=wins+1;
                    }
                }
                    else if(player.equals("S")){
                        if (computer.equals("R")){
                            System.out.println("You choose Scissors and the computer choose Rock");
                            System.out.println("You lost");
                            losses=losses+1;
                        }
                        else{
                            System.out.println("You choose Scissors and the computer choose Paper");
                            System.out.println("You won!");
                            wins=wins+1;
                       }
                    }
                    else{
                        System.out.println("You didn't enter Rock, Paper, or Scissors");
                    }
                }
            System.out.println("You won "+wins+" games and lost "+losses);
            if (wins>1&&losses>1){
                winloss=wins/losses;
                System.out.println("Your wins to losses ratio was "+winloss);
            }
        }
    }  
}
