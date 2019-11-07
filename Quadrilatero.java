package trabalho2POO;
public class Quadrilatero extends QuadrilateroAbstract{
	public Quadrilatero(int lados[]){
		for(int i = 0; i < 4; i++) {
			this.ladosQuadrilatero[i] = lados[i];
		}
	}
	//Se for um quadrilatero comum, os metodos serao os padroes adotados pela classe abstrata
}