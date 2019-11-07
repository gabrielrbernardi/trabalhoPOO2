package trabalho2POO_2;
public abstract class ContaCorrente {
	private float saldoTotal;
	
	public float getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
	public void sacar(float val) {
		
	}
	public void depositar(float val) {
		this.setSaldoTotal(this.getSaldoTotal() + val);
	}
	public float obterSaldo() {
		return this.getSaldoTotal();
	}
}
