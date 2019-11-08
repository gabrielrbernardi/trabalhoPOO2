package trabalho2POO_2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(100.0f, 50.0f);	//Colocando valor da conta com 100 e cheque especial com 50
		int choose = 0;
		float val;
		while(true) {
			Main m = new Main();												//Instanciando objeto Main para que possa fazer o uso do metodo imprime menu
			try {
				m.imprimeMenu();
				choose = teclado.nextInt();										//Faz a tentativa de ler um valor inteiro, se nao satisfazer gera uma excecao
				if(choose <= 0 || choose > 4) {
					System.out.println("Entrada Invalida");
				}
			} catch (Exception e) {												//Excecao criada para que impeca o usuario de digitar um tipo de valor diferente de inteiro
				System.out.println("O valor de entrada tem que ser um numero inteiro!");
				System.out.println("Finalizando o programa....");
				teclado.close();												//Encerrando o objeto teclado instanciado anteriormente
				return;															//Retorno para encerrar a aplicacao
			}
			if(choose == 1) {													//Escolha para que efetue o saque
				System.out.print("Digite o valor que deseja sacar: ");
				val = teclado.nextFloat();
				cce.sacar(val);
			}else if(choose == 2) {
				System.out.print("Digite o valor que deseja depositar: ");		//Escolha para que efetue o deposito
				val = teclado.nextFloat();
				cce.depositar(val);
			}else if(choose == 3) {												//Escolha para que possa alterar o limite do saldo especial
				System.out.print("Digite o novo valor limite: ");
				val = teclado.nextFloat();
				cce.alterarLimiteEspecial(val);
			}else if(choose == 4) {												//Escolha para que gere o saldo geral
				cce.obterSaldoGeral();
			}else if(choose == 5) {												//Escolha para encerrar o programa por conta do proprio usuario da aplicacao
				System.out.println("Termino solicitado pelo usuario");
				System.out.println("Tenha um Bom Dia");
				teclado.close();												//Encerrando o objeto teclado instanciado anteriormente
				return;															//Retorno para encerrar a aplicacao
			}
		}
	}
	public void imprimeMenu() {
		System.out.println();
		System.out.println("|===== BANCO P&A (PUJANTE E ACACHAPANTE) =====|");
		System.out.println("| #   DESCRICAO                               |");
		System.out.println("| 1 - Sacar                                   |");
		System.out.println("| 2 - Despositar                              |");
		System.out.println("| 3 - Alterar Limite Especial                 |");
		System.out.println("| 4 - Obter Saldo Geral                       |");
		System.out.println("| 5 - Sair                                    |");
		System.out.println("|=============================================|");
		System.out.print("Escolha: ");

	}

}
