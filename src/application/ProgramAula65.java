package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramAula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println("");
		System.out.println("Dados do produto: \n" + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos que serão adicionados ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Dados atualizados: \n" + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Dados atualizados: \n" + product);
		
		sc.close();
	}

}




