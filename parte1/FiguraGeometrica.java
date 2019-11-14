/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_1              *
 * Tipo aquivo:					  FiguraGeometrica, interface *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 09/11/2019      		      *
 * Data da ultima modificacao: 	  09/11/2019				  *
 * Dias de desenvolvimento:       4                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 12 Development Kit  *
 *************************************************************/


package trabalho2POO;
public interface FiguraGeometrica {
	public void apresentarDados();
	public int calcularArea(int lados[]);
	public int calcularPerimetro(int lados[]);
}
