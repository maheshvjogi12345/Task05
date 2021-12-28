class Lfff{
	
	static void printFactorial(){
		int fact=1;
		int n=5;
		System.out.println("Factorial of "+n);
		for(int i=1;i<=n;i++){
			fact = fact*i;
	
		}
	System.out.println(fact);
	System.out.println();
	}
	
	static void printFactorialseries(){
		int fact=1;
		long n = 10;
		System.out.println("Factorial Series upto :" +n);
	for(int i=1;i<=n;i++){
		fact=fact*i;
		System.out.println(fact);
		System.out.println();
		}
	}
	
	static void printFibonaccie(){
		
		int a=0;
		int b=1;
		int c = 2;
		System.out.println("Fibonacci series :");
		for(int i=1;i<=10;i++){
			System.out.println(a);
			a = b;
			b = c;
			c = a+b;
			System.out.println();
		}
	}
	
	static void printLeapyear() {
		
		int year=2000;
	boolean leap=false;


	if(year%4==0){
		leap = true;
		}

		if(year%400==0){
			leap = true;
		}

			if(year%100!=0){
			leap = false;
			}
		if(leap){
			System.out.println("year is a leap year");
		}
			else{
			System.out.println("year  is not a leap year");
		}
	}
	
	
	public static void main(String[] args){
		printFactorial();
		printFactorialseries();
		printFibonaccie();
		printLeapyear();
	
	}
	

}