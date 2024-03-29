/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Quadrilatero, class         *
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
public class Quadrilatero extends QuadrilateroAbstract{
	public Quadrilatero(int lados[]){
		for(int i = 0; i < 4; i++) {
			if(lados[i] <= 0) {
				JOptionPane.showMessageDialog(null, String.format("O valor do lado %d deve ser maior que 0", i+i));
				System.exit(1);
			}
			this.ladosQuadrilatero[i] = lados[i];
		}
	}
	//Se for um quadrilatero comum, os metodos serao os padroes adotados pela classe abstrata
}