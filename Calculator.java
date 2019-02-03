public class Calculator{

	//main method	
	public static void main(String[] args){

		//i am the calling method

		int c;
		c = add(1, 1);
		System.out.println(c);

		int d;
		d = subtract(8, 5);
		System.out.println(d);

		int e;
		e = divide(6, 3);
		System.out.println(e);

		int f;
		f = multiply(2, 7);
		System.out.println(f);

	}


	//add method
	public static int add(int a, int b){
		int sum = a + b;
		return sum;
	}


	//subtraction method
	public static int subtract(int a, int b){
		int sum = a - b;
		return sum;
	}


	//division method
	public static int divide(int a, int b){
		int sum = a / b;
		return sum;
	}


	//multiplication method
	public static int multiply(int a, int b){
		int sum = a * b;
		return sum;
	}
}