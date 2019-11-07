package trabalho2POO_2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(100.0f, 50.0f);		//Colocando valor da conta com 100 e cheque especial com 50
		int choose;
		float val;
		while(true) {
			Main m = new Main();
			m.imprimeMenu();
			System.out.print("Escolha: ");
			choose = teclado.nextInt();
			if(choose == 1) {
				System.out.print("Digite o valor que deseja sacar: ");
				val = teclado.nextFloat();
				cce.sacar(val);
			}else if(choose == 2) {
				System.out.println("Digite o valor que deseja depositar");
				val = teclado.nextFloat();
				cce.depositar(val);
			}else if(choose == 3) {
				cce.obterSaldoGeral();
			}else if(choose == 4) {
				System.out.println("Termino solicitado pelo usuario");
				System.out.println("Tenha um Bom Dia");
				teclado.close();
				return;
			}
		}
	}
	public void imprimeMenu() {
		System.out.println("|===== BANCO P&A (PUJANTE E ACACHAPANTE) =====|");
		System.out.println("| #   DESCRICAO                               |");
		System.out.println("| 1 - Sacar                                   |");
		System.out.println("| 2 - Despositar                              |");
		System.out.println("| 3 - Obter Saldo Geral                       |");
		System.out.println("| 4 - Sair                                    |");
		System.out.println("|=============================================|");
	}

}
