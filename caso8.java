import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		int lado = 0;
		
		System.out.print("Ingese Lado: ");
		lado = Mark1.nextInt();
		
		System.out.println("***********");
		System.out.println("****RESULTADOS****");
		System.out.println("******************");
		System.out.println("Area del cuadrado: " + lado * lado);
		System.out.println("Perimetro: " + lado * 4);
		
	}

}
