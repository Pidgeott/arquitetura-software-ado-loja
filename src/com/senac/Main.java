package com.senac;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.senac.factory.FabricaEletronico;
import com.senac.factory.FabricaLivros;
import com.senac.factory.FabricaProduto;
import com.senac.factory.FabricaRoupa;
import com.senac.model.Carrinho;
import com.senac.model.Produto;
import com.senac.util.InicializadorLoja;
import com.senac.util.Menu;

public class Main {

	public static void main(String[] args) {
	    int opcao = 0;
	    Scanner scanner = Menu.getScanner();
	    Menu menu = new Menu();
	    Carrinho carrinho = new Carrinho();

	    InicializadorLoja inicializador = new InicializadorLoja();
	    List<Produto> produtos = inicializador.inicializarProdutos();

	    do {
	        menu.exibirMenu();
	        while (true) {
	            try {
	                opcao = scanner.nextInt();
	                scanner.nextLine();
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Opção inválida. Por favor, insira apenas números de 1 a 6.");
	                scanner.nextLine();
	            }
	        }

	        switch (opcao) {
	            case 1:
	                menu.exibirListaEletronicos(produtos, carrinho);
	                Menu.aguardarContinuacao();
	                break;
	            case 2:
	                menu.exibirListaLivros(produtos, carrinho);
	                Menu.aguardarContinuacao();
	                break;
	            case 3:
	                menu.exibirListaRoupas(produtos, carrinho);
	                Menu.aguardarContinuacao();
	                break;
	            case 4:
	                if (!carrinho.produtos.isEmpty()) {
	                    carrinho.exibirProdutos();
	                    System.out.println("Total: " + carrinho.calcularTotal());
	                    System.out.print("Deseja finalizar a compra? (S/N): ");
	                    String confirmacao = scanner.nextLine();
	                    if (confirmacao.equalsIgnoreCase("S")) {
	                        Menu.exibirExtratoCompra(carrinho);
	                        System.out.println("Compra finalizada com sucesso.");
	                        carrinho.limparCarrinho(); 
	                    } else {
	                        System.out.println("Compra não finalizada.");
	                    }
	                } else {
	                    System.out.println("Seu carrinho está vazio.");
	                }
	                Menu.aguardarContinuacao();
	                break;
				case 5:
					System.out.println("Digite o usuário adminitrador");
					Scanner scan = new Scanner(System.in);
					String usuarioAdm = scan.nextLine();
					if (usuarioAdm.equals("admin")) {
						System.out.println("Usuário correto!");
						System.out.println("Digite a senha do administrador");
						String senhaAdm = scan.nextLine();
						if (senhaAdm.equals("1234")){
							System.out.println("Senha correta!");
							int opcaoAdd = 0;
							do {
								System.out.println("Qual produto deseja adicionar: " +
										"\n1 - Eletrônicos" +
										"\n2 - Livros" +
										"\n3 - Roupas" +
										"\n4 - Sair" +
										"\nEscolha uma opção: ");
								opcaoAdd = scan.nextInt();
								switch (opcaoAdd){
									case 1:
										FabricaEletronico fabricaEletronico = new FabricaEletronico();
										System.out.print("Digite o nome do produto: ");
										scan.nextLine();
										String nomeProduto = scan.nextLine();
										System.out.print("Digite o preço do produto: ");
										double precoProduto = scan.nextDouble();
										produtos.add(fabricaEletronico.criarProduto(nomeProduto, precoProduto));
										break;
									case 2:
										FabricaLivros fabricaLivros = new FabricaLivros();
										System.out.print("Digite o nome do produto: ");
										scan.nextLine();
										String nomeProdutoLivros = scan.nextLine();
										System.out.print("Digite o preço do produto: ");
										double precoProdutoLivros = scan.nextDouble();
										produtos.add(fabricaLivros.criarProduto(nomeProdutoLivros, precoProdutoLivros));
										break;
									case 3:
										FabricaRoupa fabricaRoupa = new FabricaRoupa();
										System.out.print("Digite o nome do produto: ");
										scan.nextLine();
										String nomeProdutoRoupa = scan.nextLine();
										System.out.print("Digite o preço do produto: ");
										double precoProdutoRoupa = scan.nextDouble();
										produtos.add(fabricaRoupa.criarProduto(nomeProdutoRoupa, precoProdutoRoupa));
										break;
									case 4:
										System.out.println("Saindo do administrador!!");
										break;
								}
							}while (opcaoAdd != 4);
							break;
						} else {
							System.out.println("Senha incorreta");
							break;
						}
					} else {
						System.out.println("Usuário incorreto");
						break;
					}
	            case 6:
	                System.out.println("Encerrando o sistema. Obrigado por usar nosso programa!");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Opção inválida.");
	        }
	    } while (opcao != 6);
	}
}