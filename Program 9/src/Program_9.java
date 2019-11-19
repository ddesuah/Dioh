import java.io.*;
import java.util.Scanner;
public class Program_9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fw = new File("/Users/diohdesuah/Desktop/grades.txt");
		Scanner inputFile = new Scanner(fw);
		
		try {
		
		FileWriter tempFile = new FileWriter ("/Users/diohdesuah/Desktop/grades.txt", true);
		PrintWriter outputFile = new PrintWriter(tempFile);
		int tot =0;
		int [] gradeSheet = new int [15];
		for (int i = 0; i<15;i++) {
				gradeSheet[i]=(int)(Math.random()*100+1);
				tot+=gradeSheet[i];
			}
int avg = tot/15; //this above code is the code that will be executed to get the numbers


outputFile.println("Grade Statistics \n==================================");
outputFile.println("Total: "+ tot);
outputFile.println("Number of Grades: 15");
outputFile.println("Average: "+ avg);

inputFile.close();
outputFile.close();
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
