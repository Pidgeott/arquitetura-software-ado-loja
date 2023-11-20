package com.senac;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
	                System.out.println("Opção inválida. Por favor, insira apenas números de 1 a 5.");
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
	                System.out.println("Encerrando o sistema. Obrigado por usar nosso programa!");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Opção inválida.");
	        }
	    } while (opcao != 5); 
	}
}