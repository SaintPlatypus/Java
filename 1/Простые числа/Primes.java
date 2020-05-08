public class Primes{

	public static void main(String[] args) {

		for (int i = 2; i<100 ; i++ ) {
			boolean a=isPrime(i);
			if (a) System.out.println(i); // Вывод на экран
		}
	}
	
	public static boolean isPrime(int n){ 

		for ( int i=2; i<n; i++ ) {

			if ((n%i)==0)
			 	return false;
		}	 	
		return true; 
	}

}