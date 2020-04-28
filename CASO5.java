import java.util.Scanner;

public class CASO5 {

	public static void main(String[] args) {
		Scanner Mark1 = new Scanner(System.in);
		
		float NUM1 = 0, NUM2 = 0;
		
		System.out.print("Primer Número: ");
		NUM1 = Mark1.nextFloat();
		
		System.out.print("Segundo Número: ");
		NUM2 = Mark1.nextFloat();
		
		float promedio, aumento, disminuido;
		promedio = (NUM1 + NUM2) / 2;
		aumento = (float) (NUM1 *1.2); //APLICAR cAST
		disminuido = (float) (NUM2 * 0.7);
		
		System.out.println("***********");
		System.out.println("Promedio: " + promedio);
		System.out.println("Aumento: " + aumento);
		System.out.println("Disminuido: " + disminuido);
		
		
	}

}
