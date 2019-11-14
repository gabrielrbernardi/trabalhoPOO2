/**************************************************************
 * Nome do projeto: 			  Trabalho2POO_2              *
 * Nome, tipo de aquivo:		  Main, class                 *
 * Autor: 						  Gabriel Ribeiro Bernardi	  *
 * Matricula: 					  11821BCC036		    	  *
 * Data de inicio: 				  06/11/2019				  *
 * Data final de desenvolvimento: 13/11/2019      		      *
 * Data da ultima modificacao: 	  13/11/2019				  *
 * Dias de desenvolvimento:       7                           *
 * Linguagem utilizada:			  Java						  *
 * Plataforma Java utilizada:     Java SE 12 Development Kit  *
 *************************************************************/


package trabalho2POO_2;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(100.0f, 50.0f);	//Colocando valor da conta com 100 e cheque especial com 50
		int choose = 0;
		String escolha, valor;
		float val;
		while(true) {
//			Main m = new Main();												//Instanciando objeto Main para que possa fazer o uso do metodo imprime menu
			try {
				escolha = JOptionPane.showInputDialog(null, "BANCO P&A (PUJANTE E ACACHAPANTE)\n" + 
						"#   DESCRICAO\n" + 
						"1 - Sacar\n" + 
						"2 - Depositar\n" +
						"3 - Alterar Limite Especial\n" + 
						"4 - Obter Saldo Geral\n" + 
						"5 - Sobre\n" + 
						"6 - Sair\n");
				choose = Integer.parseInt(escolha);
//				m.imprimeMenu();
//				choose = teclado.nextInt();										//Faz a tentativa de ler um valor inteiro, se nao satisfazer gera uma excecao
				if(choose <= 0 || choose > 6) {
					JOptionPane.showMessageDialog(null, "Entrada Invalida");
				}
			} catch (Exception e) {												//Excecao criada para que impeca o usuario de digitar um tipo de valor diferente de inteiro
				JOptionPane.showMessageDialog(null, "O valor de entrada tem que ser um numero inteiro!\n" + 
													"Finalizando o programa....");
				return;															//Retorno para encerrar a aplicacao
			}
			if(choose == 1) {													//Escolha para que efetue o saque
				valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja SACAR");
				val = Float.parseFloat(valor);
				cce.sacar(val);
			}else if(choose == 2) {
				valor = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar: ");		//Escolha para que efetue o deposito
				val = Float.parseFloat(valor);
				cce.depositar(val);
			}else if(choose == 3) {												//Escolha para que possa alterar o limite do saldo especial
				valor = JOptionPane.showInputDialog(null, "Digite o novo valor limite: ");
				val = Float.parseFloat(valor);
				cce.alterarLimiteEspecial(val);
			}else if(choose == 4) {												//Escolha para que gere o saldo geral
				cce.obterSaldoGeral();
			}else if(choose == 5) {
				JOptionPane.showMessageDialog(null,   "Data inicial de desenvolvimento: 06/11/2019\n"
													+ "Data final do desenvolvimento: 13/11/2019\n"
													+ "Versao do programa: 1.7\n"
													+ "Linguagem utilizada: Java\n"
													+ "Plataforma Java utilizada: Java SE 12 Development Kit");
			}else if(choose == 6) {												//Escolha para encerrar o programa por conta do proprio usuario da aplicacao
				JOptionPane.showMessageDialog(null, "Termino solicitado pelo usuario\n" +
													"Tenha um Bom Dia", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
				return;															//Retorno para encerrar a aplicacao
			}
		}
	}
	public void imprimeMenu() { //Nao sera usado a implementacao via console
		System.out.println();
		System.out.println("|===== BANCO P&A (PUJANTE E ACACHAPANTE) =====|");
		System.out.println("| #   DESCRICAO                               |");
		System.out.println("| 1 - Sacar                                   |");
		System.out.println("| 2 - Despositar                              |");
		System.out.println("| 3 - Alterar Limite Especial                 |");
		System.out.println("| 4 - Obter Saldo Geral                       |");
		System.out.println("| 5 - Sobre                                   |");
		System.out.println("| 6 - Sair                                    |");
		System.out.println("|=============================================|");
		System.out.print("Escolha: ");
	}

}
