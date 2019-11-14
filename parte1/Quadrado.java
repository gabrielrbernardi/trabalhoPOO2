/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Quadrado, class             *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 12/11/2019      		      *
 * Data da ultima modificacao: 	  12/11/2019				  *
 * Dias de desenvolvimento:       6                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 12 Development Kit  *
 *************************************************************/


package trabalho2POO;
import javax.swing.JOptionPane;
public class Quadrado extends QuadrilateroAbstract {
	String teste;
	public Quadrado(int lados[]) {
		if(lados[0] <= 0) {
			JOptionPane.showMessageDialog(null, new IllegalArgumentException("\nValor inválido, o valor esperado é maior que 0 (zero)"), "Error", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		this.ladosQuadrilatero[0] = lados[0];
	}
	
	@Override
	public void apresentarDados() {
		JOptionPane.showMessageDialog(null, "Os 4 lados possuem valor " + this.ladosQuadrilatero[0]);
//		System.out.println("Os 4 lados possuem valor: " + this.ladosQuadrilatero[0]);
	}
	
	@Override
	public int calcularArea(int lados[]) {
		int area = lados[0]*lados[0];
		return area; 
	}

	public int calcularPerimetro(int lados[]) {
		int per = lados[0]*4;
		return per;
	}
}