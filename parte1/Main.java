/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Main, class                 *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 09/11/2019      		      *
 * Data da ultima modificacao: 	  09/11/2019				  *
 * Dias de desenvolvimento:       4                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 11 Development Kit  *
 *************************************************************/


package trabalho2POO;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int choose, l1;
		int lados[] = new int[4];
		String escolha, valor;
		Main m = new Main();
		
//		System.out.println("Escolha dentre as opcoes do menu o tipo de quadrilatero de entrada: ");

//		choose = teclado.nextInt();
		escolha = JOptionPane.showInputDialog(null, "===== QUADRILATEROS =====\n"
													+ " 1 - Quadrilatero Normal\n"
													+ " 2 - Quadrado\n"
													+ " 3 - Retangulo\n"
													+ " 4 - Sobre\n"
													+ "\nEscolha dentre as opcoes do menu o tipo de quadrilatero de entrada\n\n"
													+ "Escolha", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		choose = Integer.parseInt(escolha);
//		System.out.println(choose);
		
		
		if(choose == 1) {
//			System.out.println("Digite o tamanho do lado do QUADRILATERO");
			JOptionPane.showMessageDialog(null, "Digite o tamanho do lado do QUADRILATERO NORMAL\n");
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 1: ");
			lados[0] = Integer.parseInt(valor);
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 2: ");
			lados[1] = Integer.parseInt(valor);
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 3: ");
			lados[2] = Integer.parseInt(valor);
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 4: ");
			lados[3] = Integer.parseInt(valor);

//			for(int i = 0; i < 4; i++) {
//				System.out.print("Tamanho: ");
//				lados[i] = teclado.nextInt();
//			}
			Quadrilatero quadrilatero = new Quadrilatero(lados);
			quadrilatero.apresentarDados();
			int area = quadrilatero.calcularArea(lados);
			int per = quadrilatero.calcularPerimetro(lados);
			JOptionPane.showMessageDialog(null, "Area do QUADRILATERO: " + area + "\nPerimetro do QUADRILATERO: " + per);

		}else if(choose == 2) {
			valor = JOptionPane.showInputDialog(null, "Digite o tamanho do lado do QUADRADO\n" + "Tamanho");
			lados[0] = Integer.parseInt(valor);
//			System.out.println("Digite o tamanho do lado do QUADRADO");
//			System.out.print("Tamanho: ");
//			lados[0] = teclado.nextInt();
			
			Quadrado quadrado = new Quadrado(lados);
			
			quadrado.apresentarDados();
			int area = quadrado.calcularArea(lados);
			int per = quadrado.calcularPerimetro(lados);
//			System.out.println(area);
//			System.out.println(per);
			JOptionPane.showMessageDialog(null, "Area do QUADRADO: " + area + "\nPerimetro do QUADRADO: " + per);
			
		}else if(choose == 3) {
			JOptionPane.showMessageDialog(null, "Digite o tamanho do lado do QUADRADO\n");
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 1: ");
			lados[0] = Integer.parseInt(valor);
			valor = JOptionPane.showInputDialog(null, "Tamanho lado 2: ");
			lados[1] = Integer.parseInt(valor);
//			System.out.println("Digite o tamanho do lado do RETANGULO");
//			System.out.print("Tamanho: ");
//			for(int i = 0; i < 2; i++) {
//				lados[i] = teclado.nextInt();
//			}
			Retangulo retangulo = new Retangulo(lados);
			retangulo.apresentarDados();
			int area = retangulo.calcularArea(lados);
			int per = retangulo.calcularPerimetro(lados);
			JOptionPane.showMessageDialog(null, "Area do RETANGULO: " + area + "\nPerimetro do RETANGULO: " + per);
//			System.out.println(area);
//			System.out.println(per);
		}else if(choose == 4) {
			JOptionPane.showMessageDialog(null,   "Data inicial de desenvolvimento: 06/11/2019\n"
												+ "Data final do desenvolvimento: 09/11/2019\n"
												+ "Versao do programa: 1.4\n"
												+ "Linguagem utilizada: Java\n"
												+ "Plataforma Java utilizada: Java SE 11 Development Kit");
		}
		teclado.close();
		System.exit(0);
	}
	
	public void imprimeMenu() {
		System.out.println("===== QUADRILATEROS =====");
		System.out.println(" 1 - Quadrilatero Normal");
		System.out.println(" 2 - Quadrado");
		System.out.println(" 3 - Retangulo");
		System.out.println(" 4 - Sobre");
//		System.out.println(" 999 - Exit");
		System.out.println("=========================");
	}
}