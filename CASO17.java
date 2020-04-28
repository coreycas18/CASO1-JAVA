import java.util.Scanner;

public class CASO17 {

	public static void main(String[] args) {
		Scanner Mark2 = new Scanner(System.in);
		
		System.out.print("APROBADOS:");
		int A = Mark2.nextInt();
		System.out.print("DESAPROBADOS:");
		int D = Mark2.nextInt();
		System.out.print("RETIRADOS:");
		int R = Mark2.nextInt();
		
		float TODO = A + D + R;
		float APROBA = (A / TODO) * 100;
		float DESAPRO = (D / TODO) * 100;
		float RETIRA = (R / TODO) * 100;
		
		System.out.println("APROBADOS: "+ APROBA);
		System.out.println("DESAPROBADOS:  "+ DESAPRO);
		System.out.println("RETIRADOS:  " + RETIRA);
		
		
	}

}
