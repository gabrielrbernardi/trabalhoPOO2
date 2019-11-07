package trabalho2POO;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int choose, l1;
		int lados[] = new int[4];
		Main m = new Main();
		
		m.imprimeMenu();
		System.out.println("Escolha detre as opcoes do menu o tipo de quadrilatero de entrada: ");
		System.out.print("Escolha: ");
		choose = teclado.nextInt();
		
		if(choose == 1) {
			System.out.println("Digite o tamanho do lado do QUADRILATERO");
			for(int i = 0; i < 4; i++) {
				System.out.print("Tamanho: ");
				lados[i] = teclado.nextInt();
			}
			Quadrilatero quadrilatero = new Quadrilatero(lados);
			quadrilatero.apresentarDados();			
		}else if(choose == 2) {
			System.out.println("Digite o tamanho do lado do QUADRADO");
			System.out.print("Tamanho: ");
			lados[0] = teclado.nextInt();
			
			Quadrado quadrado = new Quadrado(lados);
			
			quadrado.apresentarDados();
			int area = quadrado.calcularArea(lados);
			System.out.println(area);
			int per = quadrado.calcularPerimetro(lados);
			System.out.println(per);
			
		}else if(choose == 3) {
			System.out.println("Digite o tamanho do lado do QUADRADO");
			System.out.print("Tamanho: ");
			for(int i = 0; i < 2; i++) {
				lados[i] = teclado.nextInt();
			}
			Retangulo retangulo = new Retangulo(lados);
			retangulo.apresentarDados();
			int area = retangulo.calcularArea(lados);
			System.out.println(area);
			int per = retangulo.calcularPerimetro(lados);
			System.out.println(per);
		}
		
		teclado.close();
	}
	
	public void imprimeMenu() {
		System.out.println("===== QUADRILATEROS =====");
		System.out.println(" 1 - Quadrilatero Normal");
		System.out.println(" 2 - Quadrado");
//		System.out.println(" 999 - Exit");
		System.out.println("=========================");
	}
}