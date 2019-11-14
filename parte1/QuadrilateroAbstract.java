/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  QuadrilateroAbstract, class *
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

public abstract class QuadrilateroAbstract implements FiguraGeometrica{
	public int ladosQuadrilatero[] = new int[4];
	
	public void apresentarDados() {
		JOptionPane.showMessageDialog(null, "Os lados do quadrilatero medem:\n" + ladosQuadrilatero[0] + ", " + ladosQuadrilatero[1] + ", " + ladosQuadrilatero[2] + ", " + ladosQuadrilatero[3]);
//		for(int i  = 0; i < 4; i++) {
//			System.out.println(this.ladosQuadrilatero[i]);
//		}
	}
	
	public int calcularArea(int lados[]) {
		int area = 0;
		area = lados[0] * lados[1];
		return area;
	}
	
	public int calcularPerimetro(int lados[]) {
		int som = 0;
		for(int i = 0; i < 4; i++) {
			som+=lados[i];
		}
		return som;
	}
}