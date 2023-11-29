package com.senac.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.senac.model.Carrinho;
import com.senac.model.Produto;
import com.senac.model.ProdutoEletronico;
import com.senac.model.ProdutoLivro;
import com.senac.model.ProdutoRoupa;

public class Menu {

	private static final Scanner scanner = new Scanner(System.in);

	public static void exibirMenu() {
	    limparConsole();
	    System.out.println("==================================================");
	    System.out.println("                       LOJA                       ");
	    System.out.println("==================================================");
	    System.out.println("Menu de Opções:");
	    System.out.println("1 - Lista de Eletrônicos");
	    System.out.println("2 - Lista de Livros");
	    System.out.println("3 - Lista de Roupas");
	    System.out.println("4 - Carrinho");
		System.out.println("5 - Gerenciador");
	    System.out.println("6 - Sair");
	    System.out.println("--------------------------------------------------");
	    System.out.print("Escolha uma opção: ");
	}


	public static void aguardarContinuacao() {
		System.out.println("\nPressione Enter para voltar ao menu principal...");
		scanner.nextLine();
		limparConsole();
	}

	public void exibirListaEletronicos(List<Produto> produtos, Carrinho carrinho) {
	    List<Produto> eletronicosFiltrados = new ArrayList<>();

	    limparConsole();
	    System.out.println("==================================================");
	    System.out.println("                 Lista de Eletrônicos             ");
	    System.out.println("==================================================");
	    int index = 1;
	    for (Produto produto : produtos) {
	        if (produto instanceof ProdutoEletronico) {
	            eletronicosFiltrados.add(produto);
	            System.out.print(index++ + " - ");
	            produto.exibirDetalhes();
	        }
	    }

	    if (eletronicosFiltrados.isEmpty()) {
	        System.out.println("Não há produtos eletrônicos disponíveis.");
	        return;
	    }

	    System.out.print("Escolha um produto para adicionar ao carrinho (0 para sair): ");
	    int escolha = scanner.nextInt();
	    scanner.nextLine(); 
	    if (escolha > 0 && escolha <= eletronicosFiltrados.size()) {
	        Produto produtoSelecionado = eletronicosFiltrados.get(escolha - 1);
	        carrinho.adicionarProduto(produtoSelecionado);
	        System.out.println("\nProduto adicionado ao carrinho: " + produtoSelecionado.getNome());
	    }
	}


	public void exibirListaLivros(List<Produto> produtos, Carrinho carrinho) {
	    List<Produto> livrosFiltrados = new ArrayList<>();

	    System.out.println("==================================================");
	    System.out.println("                 Lista de Livros            ");
	    System.out.println("==================================================");
	    int index = 1;
	    for (Produto produto : produtos) {
	        if (produto instanceof ProdutoLivro) {
	            livrosFiltrados.add(produto);
	            System.out.print(index++ + " - ");
	            produto.exibirDetalhes();
	        }
	    }

	    if (livrosFiltrados.isEmpty()) {
	        System.out.println("Não há livros disponíveis.");
	        return;
	    }

	    System.out.print("Escolha um livro para adicionar ao carrinho (0 para sair): ");
	    int escolha = scanner.nextInt();
	    scanner.nextLine(); 
	    if (escolha > 0 && escolha <= livrosFiltrados.size()) {
	        Produto produtoSelecionado = livrosFiltrados.get(escolha - 1);
	        carrinho.adicionarProduto(produtoSelecionado);
	        System.out.println("\nProduto adicionado ao carrinho: " + produtoSelecionado.getNome());
	    }
	}

	
	public void exibirListaRoupas(List<Produto> produtos, Carrinho carrinho) {
	    List<Produto> roupasFiltradas = new ArrayList<>();

	    System.out.println("==================================================");
	    System.out.println("                 Lista de Roupas            ");
	    System.out.println("==================================================");
	    int index = 1;
	    for (Produto produto : produtos) {
	        if (produto instanceof ProdutoRoupa) {
	            roupasFiltradas.add(produto);
	            System.out.print(index++ + " - ");
	            produto.exibirDetalhes();
	        }
	    }

	    if (roupasFiltradas.isEmpty()) {
	        System.out.println("Não há roupas disponíveis.");
	        return;
	    }

	    System.out.print("Escolha uma roupa para adicionar ao carrinho (0 para sair): ");
	    int escolha = scanner.nextInt();
	    scanner.nextLine(); 
	    if (escolha > 0 && escolha <= roupasFiltradas.size()) {
	        Produto produtoSelecionado = roupasFiltradas.get(escolha - 1);
	        carrinho.adicionarProduto(produtoSelecionado);
	        System.out.println("\nProduto adicionado ao carrinho: " + produtoSelecionado.getNome());
	    }
	}
	
	public static void exibirExtratoCompra(Carrinho carrinho) {
	    limparConsole();
	    System.out.println("==================================================");
	    System.out.println("                     EXTRATO DA COMPRA            ");
	    System.out.println("==================================================");
	    carrinho.exibirProdutos();
	    System.out.println("--------------------------------------------------");
	    System.out.printf("Total da Compra: $%.2f\n", carrinho.calcularTotal());
	    System.out.println("==================================================");
	}

	public static void limparConsole() {
	    for (int i = 0; i < 50; ++i) System.out.println();
	}
	
	public static Scanner getScanner() {

		return scanner;
	}

}
