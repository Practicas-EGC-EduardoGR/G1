package demo01;

public class Principal {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int suma = 0;
		
		num1 = 5;
		num2 = 3;
		num3 = 7;
		
		suma = Sum.suma2Nums(num1, num2);
		System.out.println("\nLa suma de 2 números es: " + suma);
		
		suma = Sum.suma3Nums(num1,  num2,  num3);
		System.out.println("\n\nLa suma de 3 números es: " + suma);
	}

}
