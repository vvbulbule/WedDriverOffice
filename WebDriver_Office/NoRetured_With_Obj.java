
public class NoRetured_With_Obj {

	public void studentRank(int marks){
		
		if(marks>=600){
			System.out.println("Rank A");
		}else if(marks>=500){
			System.out.println("Rank B");
		}else{
			System.out.println("Rank C");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoRetured_With_Obj obj= new NoRetured_With_Obj();
		
		obj.studentRank(1000);
		
		//System.out.println(obj.studentRank(100));

	}

}
