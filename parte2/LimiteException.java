/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_2              *
 * Nome, tipo de aquivo:		  LimiteException, class      *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 13/11/2019      		      *
 * Data da ultima modificacao: 	  13/11/2019				  *
 * Dias de desenvolvimento:       7                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 12 Development Kit  *
 *************************************************************/


package trabalho2POO_2;
public class LimiteException extends RuntimeException{							// classe para tratamento de excecao, no caso se o limite especial das contas correntes especiais ficar menor que 0
	private static final long serialVersionUID = 1L;
	
	public LimiteException(String msg) {
		super(msg);
	}
}

