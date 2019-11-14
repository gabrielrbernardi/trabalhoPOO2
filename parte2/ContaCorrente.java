/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_2              *
 * Nome, tipo de aquivo:		  ContaCorrente, class        *
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
public abstract class ContaCorrente {
	private float saldoTotal;
	
	/*********************
	 * GETTERS E SETTERS *
	 *********************/
	public float getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	/***********************
	 * METODOS ESPECIFICOS *
	 ***********************/
	public void sacar(float val) {
		
	}
	public void depositar(float val) {
	}
	public float obterSaldo() {
		return this.getSaldoTotal();
	}
}
