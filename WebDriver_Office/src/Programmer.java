class Employee2{
	float salary=40000;
}
public class Programmer extends Employee2 {
	int bonus=10000;
	public static void main(String[] args) {
		Programmer obj= new Programmer();
		System.out.println("My salary is:"+obj.salary);
		System.out.println("My bonus is:"+obj.bonus);
	}

}
