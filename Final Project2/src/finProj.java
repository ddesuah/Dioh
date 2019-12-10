import java.util.Scanner;
import java.io.*;
public class finProj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fw = new File("/Users/diohdesuah/Desktop/sales.txt");
		Scanner inputFile = new Scanner(fw);

		try {
		
		FileWriter tempFile = new FileWriter ("/Users/diohdesuah/Desktop/salesTotal.txt", true);
		PrintWriter outputFile = new PrintWriter(tempFile);
		
		int berries=100;
		String name;
		double price=2;
		int workers [][] = new int [2][1]; 
		workers[0][0]=0;
		workers[1][0]=0;
		
		double change;
		int strikes=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("Hey "+ name + " welcome to Jess's Juice Berry Stand\nYou are the worker! You have to settle the dispute when you are on shift.");
		System.out.println("There are " +berries+ " berries!\n\n");
		  while (berries>0) {
			  int moneyOwn = (int)(Math.random()*10+1);
			  int berriesBuy=(int)(moneyOwn/price);
			  for (int i = 0; i< workers.length;i++) {
				  if (i==1) {
					  System.out.println("You are on shift!\nThe berries cost $2" );
					  System.out.println("Someone buys "+berriesBuy+ " berries\nIt costs "+price*berriesBuy+" dollars");
					  System.out.println("They paid " +moneyOwn+" dollars! Give them their exact change");
					  change = keyboard.nextDouble();
					  berries -=berriesBuy;
					  System.out.println("\n");
					  if (change==((double)moneyOwn-(price*berriesBuy))){
						  System.out.println("Good Job!");
						  }
					  else {
						  strikes++;
						  System.out.println("That's a Strike");
					  }
					  workers[i][0]+=berriesBuy;
				  }
				  else  {
					  System.out.println("You are not on Shift");
					  System.out.println("Someone bought "+berriesBuy+" berries");
					  System.out.println("\n\n");
					  berries-=berriesBuy;
					  workers[i][0]+=berriesBuy;
				  }
				  
			  }
			  System.out.println("There are "+berries+" berries left.\n\n");
			  if (strikes==3) {
				  System.out.println("You are FIRED!");
				  berries=-1;
			  }
		  }
		  System.out.println("You sold " +workers[1][0]+" berries.");
		  System.out.println("Your partner sold "+ workers[0][0]+ " berries.");
		  if (workers[1][0]>workers[0][0]) {
			  System.out.println("You've earned Employee Of The Month");
		  }
		  if (workers[1][0]<workers[0][0]) {
			  System.out.println("You Suck!");
		  }
		  else {
			  System.out.println("You Suck! .... even though you guys tied!");
		  }
		
		  outputFile.close();
			inputFile.close();
			}
			catch (EOFException error) {
				System.out.println("Sorry we have reached the dnd of the file.");
				System.out.println("Error Message: "+ error.getMessage());
			}
			catch ( FileNotFoundException error) {
				System.out.println("Sorry we seem to have reached the end of the file");
				System.out.println("ERROR Message: " + error.getMessage());
			}
		
		


}
}