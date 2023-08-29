public class FibonacciCache {
    ivate int[] cache = new int[1000];
	
	public FibonacciCache(){
		// n de 1 = 1;
		cache[1] = 1;
	}

	public int fibonacciDe(int n){
				
		if(cache[n] != 0){
			return cache[n];
		}
	
		// n de 0 = 0
		if(n <= 0){
			return 0;
		}
						
		int result = fibonacciDe(n-1) + fibonacciDe(n-2);
		cache[n] = result;
		return result;
	}

	public static void main(String[] args) throws Exception{
	
		String inputLine = "";   
		
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		FibonacciCache fib = new FibonacciCache();
		
		while (!(inputLine.equals("sair"))){
			System.out.println("Informe o valor de n para obter o seu Fibonacci ou \"sair\" para finalizar: ");
			inputLine = in.readLine();
			
			if (!(inputLine.equals("sair"))){
				int value = Integer.parseInt(inputLine);
				long begin = System.currentTimeMillis();
				System.out.print("Fibonacci de "+ inputLine + " é: " + fib.fibonacciDe(value) +"\n"); 
				long end = System.currentTimeMillis();
				System.out.print("Tempo " + (end - begin) + "\n");
			}
		}
	}
}

