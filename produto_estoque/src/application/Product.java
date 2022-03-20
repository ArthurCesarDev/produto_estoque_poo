package application;

import java.util.Locale;
import java.util.Scanner;

import entities_resolv.*;

public class Product {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Estoque Estoque = new Estoque();
		
		System.out.println("Entre com Produto: ");
		System.out.print("Nome: ");
		Estoque.name = sc.nextLine();
		System.out.print("Preço: ");
		Estoque.price = sc.nextDouble();
		System.out.print("Quantidade de Estoque: ");
		Estoque.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Informação do Produto: " + Estoque);
		System.out.println();
		System.out.print("Deseja Adicionar mais produto no estoque ");
		int quantity = sc.nextInt();
		Estoque.addProducts(quantity);
		System.out.println();
		System.out.println("Produto Adicionado: " + Estoque);
		System.out.println();
		System.out.print("Deseja Remover produto: ");
		quantity = sc.nextInt();
		Estoque.removeProducts(quantity);
		System.out.println();
		System.out.println("Produto Removido: " + Estoque);
		sc.close();
		}
}
