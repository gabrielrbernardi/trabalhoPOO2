/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Quadrado, class             *
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
import javax.swing.JOptionPane;
public class Quadrado extends QuadrilateroAbstract {
	public Quadrado(int lados[]) {
		if(lados[0] <= 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido, o valor esperado é maior que 0 (zero)", "Error", JOptionPane.WARNING_MESSAGE);
			throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
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