package game;

public class SnakeAndLadderUC2 {

    public static void main(String[] args) {
		System.out.println("**Welcome to the Snake and Ladder Game**");
		
		//Snake and Ladder game played with single player at start position 0	
		int position = 0;
        System.out.println("You are at Starting Position: " + position);

        
        //The player rolls the dice to get a number between 1 to 6 by using RANDOM function
        int rollDice = (int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println("Dice Value: "+ rollDice);
    
    }

}