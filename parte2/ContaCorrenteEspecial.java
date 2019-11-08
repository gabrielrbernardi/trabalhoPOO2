package trabalho2POO_2;
public class ContaCorrenteEspecial extends ContaCorrente{
	private float limiteEspecialCC;												//Limite especial conta corrente
	private float saldoLimiteEspecial;
	private static int numConta = 0;
	
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
		System.out.println("Tentativa de saque de " + val);
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
	public void depositar(float val) {
		System.out.println("Tentativa de deposito de " + val);
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
			throw new LimiteException("Limite especial execido");
		}
		
//		if(this.getSaldoLimiteEspecial() <= 0 || this.getSaldoTotal() < 0) {
//			throw new LimiteException("Limite especial execido");
//		}
	}
	
	public void alterarLimiteEspecial(float val) {
		this.setLimiteEspecialCC(val);
	}
	
	public void obterSaldoGeral() {
		//De acordo com a numeracao da conta bancaria, imprime o valor na tela formatado, com padrao de 4 digitos
		if(ContaCorrenteEspecial.getNumConta() > 0 && ContaCorrenteEspecial.getNumConta() < 10) {
			System.out.println("Saldo da conta 000" + ContaCorrenteEspecial.getNumConta());			
		}else if(ContaCorrenteEspecial.getNumConta() >= 10 && ContaCorrenteEspecial.getNumConta() < 100) {
			System.out.println("Saldo da conta 00" + ContaCorrenteEspecial.getNumConta());
		}else if(ContaCorrenteEspecial.getNumConta() >= 100 && ContaCorrenteEspecial.getNumConta() < 1000) {
			System.out.println("Saldo da conta 0" + ContaCorrenteEspecial.getNumConta());
		}else {
			System.out.println("Saldo da conta " + ContaCorrenteEspecial.getNumConta());
		}
		System.out.println("Saldo Geral atual: " + this.obterSaldo());
		System.out.println("Saldo Especial atual: " + this.getSaldoLimiteEspecial());
		System.out.println("Limite Especial original: " + limiteEspecialCC);
		System.out.println();
	}
}
