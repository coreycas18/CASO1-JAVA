import java.util.Scanner;
public class CASO10 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		System.out.print("Radio: ");
		float radio = Mark1.nextFloat();
		
		float pi = (float) 3.1416;
		float area = (float) (pi*Math.pow(radio, 2));
		float perimetro = 2*pi*radio;
		System.out.println("***********");
		System.out.println("****RESULTADOS****");
		System.out.println("******************");
		System.out.println("El Radio es: "+ area);
		System.out.println("El Perimetro es: "+ perimetro);
		

	}

}
