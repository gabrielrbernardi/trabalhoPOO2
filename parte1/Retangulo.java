/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Retangulo, class            *
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
public class Retangulo extends QuadrilateroAbstract {
	public Retangulo(int lados[]) {
		for(int i = 0; i < 2; i++) {
			if(lados [0] <= 0) {
				JOptionPane.showMessageDialog(null, "Valor inválido, o valor esperado é maior que 0 (zero)", "Error", JOptionPane.WARNING_MESSAGE);
				throw new IllegalArgumentException("Valor inválido, os valores esperados são maior que 0 (zero)");
			}
		}
		if(lados[0] == lados[1]) {
			JOptionPane.showMessageDialog(null, "Valor inválido, modifique um dos valores a fim de torná-los diferentes", "Error", JOptionPane.WARNING_MESSAGE);
			throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
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
