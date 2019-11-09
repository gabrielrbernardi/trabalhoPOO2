/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  Quadrilatero, class         *
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
public class Quadrilatero extends QuadrilateroAbstract{
	public Quadrilatero(int lados[]){
		for(int i = 0; i < 4; i++) {
			this.ladosQuadrilatero[i] = lados[i];
		}
	}
	//Se for um quadrilatero comum, os metodos serao os padroes adotados pela classe abstrata
}