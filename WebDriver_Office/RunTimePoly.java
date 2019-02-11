
	 class classNew1 {
	
	 void myMethod(){
		System.out.println("Selenium for test Automation");
	}}
	
	 class classNew2 extends classNew1{
		public void myMethod(){
			System.out.println("QTP");
		}
	}
	
	 class RunTimePoly{
		public static void main(String[] args) {
			classNew2 obj= new classNew2();
			obj.myMethod();
			/*classNew1 obj1= new classNew1();
			obj1.myMethod();*/
		}
	}


