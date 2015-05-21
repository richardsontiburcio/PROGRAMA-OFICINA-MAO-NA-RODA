package GUI;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;
import Controller.*;
import Model.Carro;
import Model.Cliente;
import Model.Endereco;
import Model.Funcionario;
import Model.Telefone;

public class Principal {

	static boolean te = true;	


	public static void main(String[] args) {

		boolean t = true;
		boolean s = true;
		boolean te = true;
		ListaDuplaFuncionario listaFuncionario = new ListaDuplaFuncionario();
		ListaDuplaCliente listaCliente = new ListaDuplaCliente();
		FilaCarros fila = new FilaCarros();
		Funcionario funcionario = null;
		Endereco endereco = null;
		Telefone telefone = null;
		
		do {
			
				String[] ver = { "Administrativo", "Menu do Cliente","Sair"};

				int op = JOptionPane.showOptionDialog(null, "Bem vindo ao Mão-na-Roda"
						+ "\nQual operação deseja realizar ?",
						"MENU", JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, null, ver, ver[0]);

			if (op == 0) {

				do {

					op = Byte.parseByte(JOptionPane
							.showInputDialog("		Administração		"
									+ "\n1 - Cadastrar Funcionário;"
									+ "\n2 - Exibir Funcionários"
									+ "\n3 - Excluir Funcionário"
									+ "\n4 - Buscar"
									+ "\n5 - Voltar" + "\nDigite a opção:"));

					switch (op) {

					case 1:
						String nome,rua,bairro,casa,cidade,CEP;
						int idade =0,ddd=0,fone=0;
						
						
						nome =JOptionPane.showInputDialog("Digite o nome ");
						idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade:").replace(",", "."));
						rua = JOptionPane.showInputDialog("Digite o nome da rua:");
						bairro = JOptionPane.showInputDialog("Digite o nome do bairro:");
						casa=JOptionPane.showInputDialog("Digite o numero da casa:");
						cidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
						CEP = JOptionPane.showInputDialog("Digite o CEP:");
						ddd = Integer.parseInt(JOptionPane.showInputDialog("Digite o ddd do telefone:"));
						fone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone:"));							te = false;
						endereco = new Endereco(rua,bairro,casa,cidade,CEP);
						telefone = new Telefone(ddd,fone);
						funcionario = new Funcionario(nome,idade,endereco,telefone);
						
						
						listaFuncionario.inserirNoFim(new NoDuploFuncionario(
								funcionario));

						break;

					case 2:

						if (listaFuncionario.isListaVazia() == false) {

							listaFuncionario.exibirLista();
						} else {
							JOptionPane.showMessageDialog(null,
 									"Não existe Funcionario Cadastrado!");
						}

						break;

					case 3:

						if (listaFuncionario.isListaVazia() == true) {

							JOptionPane.showMessageDialog(null,
									"Não existe Funcionario Cadastrado!");
							
							break;
						} else {
							String func = JOptionPane
									.showInputDialog("Digite o nome do funcionario a ser excluido do sistema:");
					
								listaFuncionario.excluirEmQlqPosicao(func);
				
							//}
						}
						 break;
					case 4:
						
						listaFuncionario.buscar(JOptionPane.showInputDialog(null, "Digite o Valor que deseja buscar!"));
						break;
					case 5:

						t = false;
						break;

					default:

						JOptionPane.showMessageDialog(null,
								"Digite a opção correta!");

					}

				} while (t);

			}

			else if (op == 1) {

				do {

					op = Byte.parseByte(JOptionPane
							.showInputDialog("		Cliente		"
									+ "\n1 - Cadastrar Cliente;"
									+ "\n2 - Exibir Cliente"
									+ "\n3 - Excluir Cliente"
									+ "\n4 - Entrada de Veiculo"
									+ "\n5 - Voltar" + "\nDigite a opção:"));

					switch (op) {

					case 1:
						
						String nome,rua,bairro,casa,cidade,CEP,marca,modelo,problema;
						int idade,ddd,fone;
						
						
						nome =JOptionPane.showInputDialog("Digite o nome ");
						idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade:").replace(",", "."));
						rua = JOptionPane.showInputDialog("Digite o nome da rua:");
						bairro = JOptionPane.showInputDialog("Digite o nome do bairro:");
						casa=JOptionPane.showInputDialog("Digite o numero da casa:");
						cidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
						CEP = JOptionPane.showInputDialog("Digite o CEP:");
						ddd = Integer.parseInt(JOptionPane.showInputDialog("Digite o ddd do telefone:"));
						fone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone:"));					
						marca = JOptionPane.showInputDialog("Digite a Marca do veiculo");
						modelo = JOptionPane.showInputDialog("Digite o Modelo");
						problema = JOptionPane.showInputDialog("Digite o Problema");
						
						Cliente cliente = new Cliente(nome,idade,
								new Endereco(rua,bairro,casa,cidade,CEP),
								new Telefone(ddd,fone),
								new Carro(marca,modelo,problema));

						listaCliente.inserirNoFim(new NoDuploCliente(cliente));

						break;

					case 2:
						if (listaCliente.isListaVazia() == false) {
							listaCliente.exibirLista();
						//	break;
						} else {
							listaCliente.exibirLista();
							JOptionPane.showMessageDialog(null,
									"Não existe Cliente Cadastrado!");//aqui
						}
						 break;

					case 3:
						if (listaCliente.isListaVazia() == true) {

							JOptionPane.showMessageDialog(null,
									"Não existe Funcionario Cadastrado!");
							//break;
						} else {
							listaCliente
							
									.excluirEmQlqPosicao(JOptionPane
											.showInputDialog("Digite o nome do cliente a ser excluido do sistema:"));
						}
						 break;

					case 4:

						op = Byte
								.parseByte(JOptionPane
										.showInputDialog("Escolha a Opção"
												+ "\n1 - Entrada de carro."
												+ "\n2 - Saida de Carro."
												+ "\n3 - Voltar"
												+ "\nDigite a opção:"));
					case 5:

						t = false;
						break;

					default:

						JOptionPane.showMessageDialog(null,
								"Digite a opção correta!");

						switch (op) {

						case 1:

							op = Byte
									.parseByte(JOptionPane
											.showInputDialog("O cliente possui cadastro?"
													+ "\n1 - Sim"
													+ "\n2 - Não"
													+ "\n3 - Voltar"
													+ "\nDigite a opção:"));

							if (op == 1) {

								fila.enfileirar(new NoDuploFila(listaCliente.buscar(JOptionPane.showInputDialog("Digite o nome do cliente."))));

							} else if (op == 2) {

								cliente = new Cliente(
										JOptionPane
												.showInputDialog("Digite o nome "),
										Integer.parseInt(JOptionPane
												.showInputDialog("Digite idade:")),
										new Endereco(
												JOptionPane
														.showInputDialog("Digite o nome da rua:"),
												JOptionPane
														.showInputDialog("Digite o nome do bairro:"),
												JOptionPane
														.showInputDialog("Digite o numero da casa:"),
												JOptionPane
														.showInputDialog("Digite o nome da cidade:"),
												JOptionPane
														.showInputDialog("Digite o CEP:")),
										new Telefone(
												Integer.parseInt(JOptionPane
														.showInputDialog("Digite o ddd do telefone:")),
												Integer.parseInt(JOptionPane
														.showInputDialog("Digite o telefone:"))),
										new Carro(
												JOptionPane
														.showInputDialog("Marca do veiculo"),
												JOptionPane
														.showInputDialog("Modelo"),
												JOptionPane
														.showInputDialog("Problema")));

								listaCliente.inserirNoFim(new NoDuploCliente(
										cliente));

							} else {

								break;

							}

						}

						break;

					}

				} while (t);

			}else if (op == 2||op ==-1) {
				JOptionPane.showMessageDialog(null, "Até Logo!");
			s=false;	
				
			}else {
			

				JOptionPane.showMessageDialog(null, "Digite a opção correta!");
				s = true;

			}

		} while (s);
	}

}
