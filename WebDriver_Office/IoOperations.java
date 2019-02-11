import java.util.Scanner;


public class IoOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name= scan.nextLine();
		System.out.println("Your name: "+name);
		
		System.out.println("Enter city:");
		String city= scan.next();
		System.out.println("Your name: "+city);
		
		System.out.println("Enter number:");
		int num3= scan.nextInt();
		System.out.println("Your number: "+num3);
		
		System.out.println("Enter number:");
		long num4= scan.nextLong();
		System.out.println("Your number: "+num4);
		
		System.out.println("Enter number:");
		double num= scan.nextDouble();
		System.out.println("Your number: "+num);
		
		System.out.println("Enter Character:");
		char num1= scan.next().charAt(6);
		System.out.println("Your number: "+num1);
		
		System.out.println("Enter Character:");
		boolean num2= scan.nextBoolean();
		System.out.println("Your number: "+num2);
		
		scan.close();

	}

}
