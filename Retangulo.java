package trabalho2POO;

public class Retangulo extends QuadrilateroAbstract {
	public Retangulo(int lados[]) {
		for(int i = 0; i < 2; i++) {
			this.ladosQuadrilatero[i] = lados[i];
		}
	}
	
	@Override
	public void apresentarDados() {
		System.out.println("Os lados possuem tamanho: " + this.ladosQuadrilatero[0] + " e " + this.ladosQuadrilatero[1]);
	}
	
	@Override
	public int calcularArea(int lados[]) {
		int area = lados[0]*lados[1];
		return area;
	}
	@Override
	public int calcularPerimetro(int lados[]) {
		int per = lados[0]*2 + lados[1]*2;
		return per;
	}
}
