package trabalho2POO;
public abstract class QuadrilateroAbstract implements FiguraGeometrica{
	public int ladosQuadrilatero[] = new int[4];
	
	public void apresentarDados() {
		for(int i  = 0; i < 4; i++) {
			System.out.println(this.ladosQuadrilatero[i]);
		}
	}
	
	public int calcularArea(int lados[]) {
		int area = 0;
		area = lados[0] * lados[1];
		return area;
	}
	
	public int calcularPerimetro(int lados[]) {
		int som = 0;
		for(int i = 0; i < 4; i++) {
			som+=lados[i];
		}
		return som;
	}
}