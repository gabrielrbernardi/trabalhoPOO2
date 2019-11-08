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
