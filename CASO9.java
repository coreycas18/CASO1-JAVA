import java.util.Scanner;

public class CASO9 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		int ladoA = 0, ladoB =0;
		
		System.out.print("Ingese primer Lado: ");
		ladoA = Mark1.nextInt();
		
		System.out.print("Ingese segundo Lado: ");
		ladoB = Mark1.nextInt();
		
		System.out.println("***********");
		System.out.println("****RESULTADOS****");
		System.out.println("******************");
		System.out.println("Area del rectangulo: " + ladoA * ladoB);
		System.out.println("Perimetro: " + (ladoA + ladoB) * 2);

}
}
