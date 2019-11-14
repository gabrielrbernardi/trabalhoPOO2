/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_2              *
 * Nome, tipo de aquivo:		  ContaCorrenteEspecial, class*
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
import javax.swing.JOptionPane;
public class ContaCorrenteEspecial extends ContaCorrente{
	private float limiteEspecialCC;												//Limite especial conta corrente
	private float saldoLimiteEspecial;
	private static int numConta = 0;
	private String msg;
	/**************
	 * CONSTRUTOR *
	 **************/
	public ContaCorrenteEspecial(float saldoTotal, float saldoLimiteEspecial) {	//Parametros: saldo total inicial da conta e saldo limite especial inicial
		ContaCorrenteEspecial.numConta+=1;										//Adicionando valor no numero de Conta Corrente Especial, unico para cada conta criada
		this.setSaldoTotal(saldoTotal);											//Definindo valor de saldo total
		this.saldoLimiteEspecial = saldoLimiteEspecial;							//Definindo valor de saldo limite
		this.limiteEspecialCC = saldoLimiteEspecial;							//Definindo limite especial
	}
	/*********************
	 * GETTERS E SETTERS *
	 *********************/
	public static int getNumConta() {
		return numConta;
	}
	public float getLimiteEspecialCC() {
		return limiteEspecialCC;
	}
	public void setLimiteEspecialCC(float limiteEspecialCC) {
		this.limiteEspecialCC = limiteEspecialCC;
	}
	public float getSaldoLimiteEspecial() {
		return saldoLimiteEspecial;
	}
	public void setSaldoLimiteEspecial(float saldoLimiteEspecial) {
		this.saldoLimiteEspecial = saldoLimiteEspecial;
	}
	/***********************
	 * METODOS ESPECIFICOS *
	 ***********************/
	public void sacar(float val) {
		JOptionPane.showMessageDialog(null, "Tentativa de saque de " + val);
		if(val > this.getSaldoTotal()) {
			this.setSaldoTotal(this.getSaldoTotal() - val);						//Se valor desejado para saque for maior que o saldoTotal, desconta o valor 'val' do saldoTotal, porem o saldoTotal ficara negativo
			float dif = Math.abs(this.getSaldoTotal());							//Com o saldo atual negativo, dif recebe o valor absoluto de saldo atual, para que seja possivel descontar esse valor do saldoLimiteEspecial
			this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() - dif);	//Descontando dif em saldoLimiteEspecial
			this.setSaldoTotal(0.0f);											//Como foi retirado valor em saldoLimiteEspecial, saldoTotal passa a valer 0, pois a conta ficara "zerada"
			verificaLimite();													//Se valor de saldoLimiteEspecial for menor que 0, retornara excecao
		}else if(val <= this.getSaldoTotal()){
			this.setSaldoTotal(this.getSaldoTotal() - val);						//Se valor desejado para saque for menor que o saldoTotal, desconta-se esse valor do saldoTotal sem que seja alterado o saldoLimiteEspecial 
		}
	}
	@Override
	public void depositar(float val) {
		JOptionPane.showMessageDialog(null, "Tentativa de deposito de " + val);
		if(this.getSaldoLimiteEspecial() == this.getLimiteEspecialCC()){
			this.setSaldoTotal(this.getSaldoTotal() + val);						//Se o valor de saldoLimiteEspecial for igual a limiteEspecialCC, deposita o valor diretamente em saldoTotal
		}else {
			float dif = this.getLimiteEspecialCC() - this.getSaldoLimiteEspecial();	//Se valor de saldoLimiteEspecial for diferente que limiteEspecialCC, dif recebe a diferenca entre os dois atributos que e a quantidade necessaria para que o usuario nao fique "devendo" ao banco
			this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() + dif);	//Deposita-se dif em saldoLimiteEspecial
			float dif1 = val - dif;												//Apos feito o deposito em saldoLimiteEspecial, calcula-se em dif1 quanto falta, do valor que deseja-se depositar, para que deposite em saldoTotal
			this.setSaldoTotal(this.getSaldoTotal() + dif1);					//Adicionando dif1 em saldoTotal
		}
	}
	
	public void verificaLimite() {
		if(this.getSaldoLimiteEspecial() < 0) {
			JOptionPane.showMessageDialog(null, new LimiteException("Limite especial execido"));
			System.exit(0);
		}
		
//		if(this.getSaldoLimiteEspecial() <= 0 || this.getSaldoTotal() < 0) {
//			throw new LimiteException("Limite especial execido");
//		}
	}
	
	public void alterarLimiteEspecial(float val) {
		this.setLimiteEspecialCC(val);
		if(this.getSaldoLimiteEspecial() > this.getLimiteEspecialCC()) {
			float var = this.getSaldoLimiteEspecial() - this.getLimiteEspecialCC();
			this.setSaldoTotal(this.getSaldoTotal() + var);
			this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() - var);
		}
	}
	
	public void obterSaldoGeral() {
		//De acordo com a numeracao da conta bancaria, imprime o valor na tela formatado, com padrao de 4 digitos
		if(ContaCorrenteEspecial.getNumConta() > 0 && ContaCorrenteEspecial.getNumConta() < 10) {
			msg = "Saldo da conta 000" + ContaCorrenteEspecial.getNumConta();
		}else if(ContaCorrenteEspecial.getNumConta() >= 10 && ContaCorrenteEspecial.getNumConta() < 100) {
			msg = "Saldo da conta 00" + ContaCorrenteEspecial.getNumConta();
		}else if(ContaCorrenteEspecial.getNumConta() >= 100 && ContaCorrenteEspecial.getNumConta() < 1000) {
			msg = "Saldo da conta 0" + ContaCorrenteEspecial.getNumConta();
		}else {
			msg = "Saldo da conta " + ContaCorrenteEspecial.getNumConta();
		}
		JOptionPane.showMessageDialog(null, String.format(msg + "\n\n" + 
											"Saldo Geral atual: R$%.2f\n" + 
											"Saldo Especial atual: R$ %.2f\n" + 
											"Limite Especial original: R$%.2f", this.obterSaldo(), this.getSaldoLimiteEspecial(), limiteEspecialCC));
	}
}
