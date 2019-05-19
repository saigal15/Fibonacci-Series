package mommsen.fibonacci.com;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<=20;i++){
			c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
