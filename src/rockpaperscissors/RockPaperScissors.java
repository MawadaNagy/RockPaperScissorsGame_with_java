
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Mawada Nagi
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your move. Type in (rock/paper/scissors). If you want to exit, type 'exit': ");

            String myMove = sc.nextLine();

            if(myMove.equals("exit")){
               break;
            }

            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")){
               System.out.println("Invalid Move!, Choose either rock, paper, or scissors: ");
            }else{
                int ran = (int) (Math.random()*3);
                String opponentMove = "";
                if(ran == 0){
                    opponentMove = "rock";
                }else if(ran == 1){
                    opponentMove = "paper";
                }else{
                    opponentMove = "scissors";
                }
                System.out.println("Opponent Move: " + opponentMove);

                if(myMove.equals(opponentMove)){
                    System.out.println("You Tied!");
                }else if((myMove.equals("rock" ) && opponentMove.equals("scissors"))||(myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))){
                    System.out.println("You Won!");
                }else{
                    System.out.println("You Lost!");
                }
            }            
            
        }
        
        System.out.println("Thanks for Playing!");
    }
    
}
