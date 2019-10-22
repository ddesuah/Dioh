package programoct1;
import java.util.Scanner;
import java.util.Random;

public class Program5 {
	static boolean full;
	static boolean ready = true;
	static int washers = 5;
	static int dryers = 3;
	static int wshTime = 35;
	static int dryTime = 60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);
		int money=15;
		int choice2;
		int machW;
		int machD = 0;
		boolean good = true;
		int chances = randomNumber.nextInt(10)+1;
		int scenario = randomNumber.nextInt(4)+1;
		System.out.println("Welcome to Joe's Laundromat");
		System.out.println("You have $15");
		if (scenario==1) {
			machW=5;
			System.out.println("You have " +machW+ " machines of clothes");
		}
		else if(scenario==2) {
			machW=3;
			System.out.println("You have " +machW+ " machines of clothes");
		}
		else if(scenario==3) {
			machW=1;
			System.out.println("You have " +machW+ " machines of clothes");
		}
		else {
			machW=2;
			System.out.println("You have " +machW+ " machines of clothes");
		}
		while (good) {			
			
			System.out.println("\n\n1. Wash your clothes ~ $5 per machine\n");
			System.out.println("2. Dry your clothes ~ $2 per machine\n");
			System.out.println("3. Wait for the clothes (you'll have a chance of finding money)\n");
			System.out.println("4. Ask your parents for money\n");
			System.out.println("5. Leave\n");
			int choice = keyboard.nextInt();
			if (choice ==1) {
				System.out.println("How many machines will you use?");
				choice2 = keyboard.nextInt();
				wash(choice2);
				money-=(choice2*5);
				machW-=choice2;
				machD+=choice2;
				System.out.println("\n\n");
			}
			if (choice ==2) {
				System.out.println("How many machines will you use?");
				choice2 = keyboard.nextInt();
				dry(choice2);
				money-=(choice2*2);
				machD-=choice2;
				System.out.println("\n\n");
			}
			if (choice==3) {
				if (chances==4) {
					System.out.println("Someone stole from your wallet!");
					money-=chances;
					if(money<0) {
						money=0;
					}
				}
				else {
					System.out.println("You rested easy for your clothes");
				}
				System.out.println("\n\n");
			}
			if (choice ==4) {
				if (chances==4) {
					System.out.println("They agreed!");
					money+=15;
				}
					else {
					System.out.println("They told your butt to get a job!");
					}	
				System.out.println("\n");
			}
			if (choice ==5) {
				System.out.println("Thank You, Have a beautiful time.");
				good=false;
			}
			System.out.println("$"+money+" left");
			if (money<=0) {
				good = false;
				System.out.println("Get out of here, broke boy!");
			}
		}
		
		
		
		
	}
	public static boolean beReady() {
		return ready = true;
	}
	
	public static void wash (int machUsed) {
		if (washers>0) {
			 washers = washers -machUsed;
		}
		else {
			System.out.println("There are no open washing machines left.\n\n");
			}
		ready = false;
		}
	
	public static void dry (int dryUsed) {
		if (dryers >0) {
			dryers = dryers - dryUsed;
		}
		else {
			System.out.println("There are no open drying machines left.\n\n");
		}
		ready = false;	
	}
	
	public static void takeOutD (int machUsed) {
		if(ready) {
		dryers += machUsed;
		}
	}
	
	public static void takeOutW (int machUsed) {
		if (ready) {
		washers += machUsed;
		}
	}	
	
	public static void washTime() {
		while (wshTime>0) {
			wshTime--;
			System.out.println(wshTime+" minutes remaining");
		}
		beReady();
	}
	public static void dryerTime() {
		while (dryTime>0) {
			dryTime--;
			System.out.println(dryTime+" minutes remaining");
		}
		beReady();
	}
		
}
		




