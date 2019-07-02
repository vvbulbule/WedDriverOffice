//import java.util.Scanner;


public class NoRetured_With_WithoutObj {
	
	public static void studentRank(int marks){
		/*Scanner scan= new Scanner(System.in);
		
		System.out.println("Eneter marks");
		int num=scan.nextInt();*/
		
		if(marks>=1000){
			System.out.println("Numbr is big");
		}else{
			System.out.println("Not Big");
		}//scan.close();
		
	}
	
	public static void main(String[] args) {
		studentRank(1000000);
		
	}

}
