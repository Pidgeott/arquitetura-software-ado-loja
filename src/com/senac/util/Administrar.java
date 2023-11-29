package com.senac.util;

import com.senac.factory.FabricaEletronico;
import com.senac.factory.FabricaLivros;
import com.senac.factory.FabricaRoupa;
import com.senac.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrar {
        Scanner scan = new Scanner(System.in);

        public Administrar() {
        }

        public boolean autenticarAdministrador() {
            System.out.println("Digite o usuário adminitrador");
            String usuarioAdm = scan.nextLine();
            if (usuarioAdm.equals("admin")) {
                System.out.println("Usuário correto!");
                System.out.println("Digite a senha do administrador");
                String senhaAdm = scan.nextLine();
                if (senhaAdm.equals("1234")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public void exibirMenuAdministrador(List<Produto> produtos) {
            int opcaoAdd = 0;
            do {
                System.out.println("Qual produto deseja adicionar: " +
                        "\n1 - Eletrônicos" +
                        "\n2 - Livros" +
                        "\n3 - Roupas" +
                        "\n4 - Sair" +
                        "\nEscolha uma opção: ");
                opcaoAdd = scan.nextInt();
                switch (opcaoAdd) {
                    case 1:
                        addProdutoEletronico(produtos);
                        break;
                    case 2:
                        addProdutoLivro(produtos);
                        break;
                    case 3:
                        addProdutoRoupa(produtos);
                        break;
                    case 4:
                        System.out.println("Saindo do administrador!!");
                        break;
                }
            } while (opcaoAdd != 4);
        }

        private void addProdutoEletronico(List<Produto> produtos) {
            FabricaEletronico fabricaEletronico = new FabricaEletronico();
            System.out.print("Digite o nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = scan.nextDouble();
            produtos.add(fabricaEletronico.criarProduto(nomeProduto, precoProduto));
        }

        private void addProdutoLivro(List<Produto> produtos) {
            FabricaLivros fabricaLivros = new FabricaLivros();
            System.out.print("Digite o nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = scan.nextDouble();
            produtos.add(fabricaLivros.criarProduto(nomeProduto, precoProduto));
        }

        private void addProdutoRoupa(List<Produto> produtos) {
            FabricaRoupa fabricaRoupa = new FabricaRoupa();
            System.out.print("Digite o nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = scan.nextDouble();
            produtos.add(fabricaRoupa.criarProduto(nomeProduto, precoProduto));
        }

}
