package game;

public class SnakeAndLadderUC4 {

    public static void main(String[] args) {
	
				//Snake and Ladder game played with single player at start position 0	
                int position = 0;
                System.out.println("position is " + position);


                //The player rolls the dice to get a number between 1 to 6 by using RANDOM function
                int rollDice = (int) (Math.random() * 10) % 6 + 1;
                System.out.println("dice value is " + rollDice);

                //Taking value variable by using random to compare with cases
                int value = (int) (Math.random() * 10) % 3 + 1;
                System.out.println("case number is " + value);

                //computation
                while (position <= 99) {

                    int optionValue = (int) (Math.random() * 10) % 3 + 1;

                   switch (optionValue) {
                        case 1:
                            System.out.println("No Play You are in the same position");
                            break;
                    case 2:
                        position = (position + rollDice);
                        System.out.println("your position after ladder is: " + position);
                        break;

                    case 3:
                        position = (position - rollDice);
                        if (position < 0) {
                            position = 0;
                        }
                        System.out.println("Your Position after snake is: " + position);
                        break;
                   }     
             }

    }
 }

