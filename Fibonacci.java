public class Fibonacci {
    
	public int fibonacciDe(int n){

		if(n <= 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		
		return fibonacciDe(n-1) + fibonacciDe(n-2);
	}

	public static void main(String[] args){
	
		System.out.print("Fib " + new Fibonacci().fibonacciDe(Integer.parseInt(args[0]))); 
	}
}

