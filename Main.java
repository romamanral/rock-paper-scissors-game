import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\t\tWELCOME TO ROCK PAPER SCISSORS GAME");
        int userwin=0;
        int computerwin=0;
        Random random = new Random();
        for(int round=0;round<5;round++) {
            System.out.println("Following are the Instructions, NOTE:value must be \n\t 0=Rock,\n\t 1=Paper and \n\t 2=Scissors "+"\nEnter your value: ");
            int num = sc.nextInt();
            int randomNumber = random.nextInt(3);
           System.out.println("Value Enter by the user:  " + num);
           System.out.println("Value Enter by the Computer :  " + randomNumber);
            //if-else statement
            if ((num == 0 && randomNumber == 0) || (num == 1 && randomNumber == 1) || (num == 2 && randomNumber == 2)) {
                System.out.println("It's a tie");
            } else if ((num == 1 && randomNumber == 0) || (num == 2 && randomNumber == 0) || (num == 2 && randomNumber == 1)) {
                System.out.println("You Win, Congrats!");
                userwin++;
            } else if ((num == 0 && randomNumber == 1) || (num == 0 && randomNumber == 2) || (num == 1 && randomNumber == 2)) {
                System.out.println("You Lose:(");
                computerwin++;
            } else {
                System.out.println("Enter value between 0,1 and 2");
            }
        }
        System.out.println("THANK YOU FOR PLAYING || GAME ENDS");
        System.out.println("Total wins by you: "+userwin);
        System.out.println("Total wins by Computer: "+computerwin);
        if(userwin>computerwin){
            System.out.println("\t\t\t\t\t\t\tCONGRATULATIONS YOU WIN!!");
        } else if (userwin==computerwin) {
            System.out.println("It's a Tie !!");
        } else{
            System.out.println("\t\t\t\t\t\tYOU LOSE!!, BETTER LUCK NEXT TIME");
        }
    }
    }
