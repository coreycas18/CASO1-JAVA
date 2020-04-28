import java.util.Scanner;

public class CASO18 {

	public static void main(String[] args) {
		Scanner Mark2 = new Scanner(System.in);
		
		System.out.println("INGRESE LA BASE DEL TRIANGULO:  ");
		int b = Mark2.nextInt();
		System.out.println("INGRESE LA ALTURA DEL TRIANGULO:  ");
		int h = Mark2.nextInt();
		
		int area = (b * h) / 2;
		
		System.out.println("***RESULTADO****");
		System.out.println("EL AREA DEL TRIANGULO ES:  " + area);
		
		
		
	}

}
