/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Retangulo, class            *
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
public class Retangulo extends QuadrilateroAbstract {
	public Retangulo(int lados[]) {
		for(int i = 0; i < 2; i++) {
			if(lados[i] <= 0) {
				JOptionPane.showMessageDialog(null, String.format("Valor inválido, o valor do lado %d\ndeve ser maior que 0 (zero)", i+1), "Error", JOptionPane.WARNING_MESSAGE);
				System.exit(1);
			}
		}
		if(lados[0] == lados[1]) {
			JOptionPane.showMessageDialog(null, "Valor inválido, modifique um dos valores a fim de torná-los diferentes", "Error", JOptionPane.WARNING_MESSAGE);
			System.exit(1);
		}
		
		for(int i = 0; i < 2; i++) {
			this.ladosQuadrilatero[i] = lados[i];
		}
	}
	
	@Override
	public void apresentarDados() {
		JOptionPane.showMessageDialog(null, "Os lados possuem tamanho: " + this.ladosQuadrilatero[0] + " e " + this.ladosQuadrilatero[1]);
//		System.out.println("Os lados possuem tamanho: " + this.ladosQuadrilatero[0] + " e " + this.ladosQuadrilatero[1]);
	}
	
	@Override
	public int calcularArea(int lados[]) {
		int area = lados[0]*lados[1];
		return area;
	}
	@Override
	public int calcularPerimetro(int lados[]) {
		int per = lados[0]*2 + lados[1]*2;
		return per;
	}
}
