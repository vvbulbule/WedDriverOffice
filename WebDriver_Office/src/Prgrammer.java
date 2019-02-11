class Employee{
	float salary=40000;
}
public class Prgrammer extends Employee {
	int bonus=10000;
	public static void main(String[] args) {
		Prgrammer obj= new Prgrammer();
		System.out.println("My salary is:"+obj.salary);
		System.out.println("My bonus is:"+obj.bonus);
	}

}
