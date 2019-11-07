package trabalho2POO_2;
public class ContaCorrenteEspecial extends ContaCorrente{
	private static float limiteEspecialCC;												//Limite especial conta corrente
	private float saldoLimiteEspecial;
	
	public ContaCorrenteEspecial(float saldoTotal,float saldoLimiteEspecial) {
		this.setSaldoTotal(saldoTotal);
		this.saldoLimiteEspecial = saldoLimiteEspecial;
		limiteEspecialCC = saldoLimiteEspecial;
	}
	
	public float getLimiteEspecialCC() {
		return limiteEspecialCC;
	}
	public float getSaldoLimiteEspecial() {
		return saldoLimiteEspecial;
	}
	public void setSaldoLimiteEspecial(float saldoLimiteEspecial) {
		this.saldoLimiteEspecial = saldoLimiteEspecial;
	}

	public void sacar(float val) {
		System.out.println("Tentativa de saque de " + val);
		if(this.getSaldoTotal() > 0) {
			float dif = this.getSaldoLimiteEspecial() - val;
			dif = Math.abs(dif);
			this.setSaldoTotal(this.getSaldoTotal() - dif);
			float dif1 = dif - val;
			dif1 = Math.abs(dif1);
			if(dif > 0) {
				verificaLimite();
				this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() - dif1);
			}
		}else {
			verificaLimite();
			this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() - val);
		}
	}
	public void depositar(float val) {
		System.out.println("Tentativa de deposito de " + val);
		if(this.getSaldoLimiteEspecial() == limiteEspecialCC) {
			float dif = limiteEspecialCC - this.getSaldoLimiteEspecial();
			this.setSaldoLimiteEspecial(this.getSaldoLimiteEspecial() + dif);
			val -= dif;
			this.setSaldoTotal(this.getSaldoTotal() + val);
		}else {
			this.setSaldoTotal(this.getSaldoTotal() + val);
		}
	}
	
	public void verificaLimite() {
		if(this.getSaldoLimiteEspecial() <= 0 || this.getSaldoTotal() < 0) {
			throw new LimiteException("Limite especial execido");
		}
	}
	
	public void obterSaldoGeral() {
		System.out.println("Saldo Atual: " + this.obterSaldo());
		System.out.println("Limite especial atual: " + this.getSaldoLimiteEspecial());
		System.out.println("Limite especial original: " + limiteEspecialCC);
		System.out.println();
	}
}
