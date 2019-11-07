package trabalho2POO;
public class Quadrado extends QuadrilateroAbstract {
	public Quadrado(int lados[]) {
		this.ladosQuadrilatero[0] = lados[0];
	}
	
	@Override
	public void apresentarDados() {
		System.out.println("Os 4 lados possuem valor: " + this.ladosQuadrilatero[0]);
	}
	
	@Override
	public int calcularArea(int lados[]) {
		int area = lados[0]*lados[0];
		return area; 
	}

	public int calcularPerimetro(int lados[]) {
		int per = lados[0]*4;
		return per;
	}
}