import java.util.Random;
import java.util.Scanner;

public class prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totScore1=0;
		int totScore2=0;
		int roScore1=0;
		int roScore2=0;
		int rounds = 0;
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int score= rand.nextInt(5)+1;
			
		System.out.println("Welcome to Lucio Ball, \nHow many rounds will you play?");
		rounds = keyboard.nextInt();
		int [][]game= new int [rounds][2];
		for (int i = 0; i<game.length;i++) {
			for (int x = 0;x<game[0].length;x++) {
				game[i][x]=score;
				score=rand.nextInt(5)+1;
			}
		}
		for (int i=0;i<game.length;i++) {
			for(int x = 0;x<game[0].length;x++) {
				if (x==0) {
					totScore1+=game[i][x];
					roScore1=game[i][x];
					roScore2=game[i][1];
				}
				if (x==1) {
					totScore2+=game[i][x];
					roScore2=game[i][x];
					roScore1=game[i][0];
				}
				
				
			}
			System.out.println("Team 1: "+roScore1+ "\tTeam 2: "+ roScore2);
		}
		
		System.out.println("\n\n\t\tFinal Score \n----------------------------------------------------");
		System.out.println("Team 1 : "+totScore1+"\tTeam 2: "+totScore2);
		if(totScore1>totScore2) {
			System.out.println("Team 1 beat Team 2 by "+(totScore1-totScore2)+"points.");
		}
		else if (totScore2>totScore1) {
			System.out.println("Team 2 beat Team 1 by "+(totScore2-totScore1)+" points.");
		}
		else {
			System.out.println("There was a tie!");
		}
		
	

	}

}
