/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  MainQuadrado, class         *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 12/11/2019      		      *
 * Data da ultima modificacao: 	  12/11/2019				  *
 * Dias de desenvolvimento:       6                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 12 Development Kit  *
 *************************************************************/

//Classe criada como pedida no exercicio 9

package trabalho2POO;
import java.util.Scanner;
public class MainQuadrado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o lado do quadrado: ");
		int lados[] = new int[4];
		lados[0] = teclado.nextInt();
		Quadrado quadrado = new Quadrado(lados);
		System.out.println("Area: " + quadrado.calcularArea(lados));
		System.out.println("Perimetro: " + quadrado.calcularPerimetro(lados));
		teclado.close();
		System.exit(0);
	}

}
