
public class testcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot =0;
		int [] gradeSheet = new int [15];
		for (int i = 0; i<15;i++) {
				gradeSheet[i]=(int)(Math.random()*100+1);
				tot+=gradeSheet[i];
			}
int avg = tot/15;


System.out.println("Grade Statistics \n==================================");
System.out.println("Total: "+ tot);
System.out.println("Number of Grades: 15");
System.out.println("Average: "+ avg);
	}

}
