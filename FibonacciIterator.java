public class FibonacciIterator implements Iterable<Integer>{
    private int n = 0;
	private int index = -1;
	// n-1 e n-2 iniciais
	private int n_1 = 1;
	private int n_2 = 0;
	
	
	public FibonacciIterator(int n){
		this.n = n;
	}

	private int fibonacciDe(int n){

		if(n <= 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		
		int result = n_1 + n_2;
		n_2= n_1;
		n_1 = result;
		
		return result;
	}

	public Iterator<Integer> iterator(){
		return new FibIterator();
	}
	public static void main(String[] args){
	
		int value = Integer.parseInt(args[0]);
		FibonacciIterator fib = new FibonacciIterator(value);
		
		Iterator iter = fib.iterator();
		System.out.print("Fibonacci de " + value + ":");
		
		while(iter.hasNext()){
			System.out.print(" " + iter.next());
		}
	}
	
	class FibIterator implements Iterator<Integer>{
		
		public boolean hasNext(){
		
		return index < n;
		}
		
		public Integer next(){
		
			if(!hasNext()){
				return null;
			}
						
			return fibonacciDe(++index);
		}
			
		public void remove(){
			throw new RuntimeException("Do nothing");
		}	
	}
}

