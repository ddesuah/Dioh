
public class program1 {
/* Project Name : Program 1 
 * Author: Dioh Desuah
 * Last Modified: Sept 10, 2019
 *  Version: 1.1 
*/
	public static void main(String[] args) {
		String name = "Dioh"; // stores my name
		byte age = 18; //stores my age
		String favMovie = "Avengers: Endgame"; //stores my favorite movie
		boolean tired = true;
		
		//
		System.out.println("Hello Brad, the programmer of this code is " + name + "."); // prints out the sentence
		System.out.println("His favorite movie is " + favMovie + ".");
		System.out.print("He is " + age + " years old");
		if(tired) {// I wanted to show off where I am in Java, so i used if statement
			System.out.print(" and he is tired.");
		}
		else {
			System.out.print(" and he is energized.");
		}
	}

}
