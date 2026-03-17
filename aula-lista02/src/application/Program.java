package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Usamos a interface List como tipo da variável
		// e ArrayList como implementação.
		// Isso é uma boa prática porque facilita trocar a implementação depois
		// (ex: LinkedList) sem mudar o resto do código.
		List<String> list = new ArrayList<>();

		// add() adiciona elementos no final da lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// add(posição, elemento) insere em uma posição específica
		// Os elementos seguintes são deslocados para a direita
		list.add(2, "Marco");

		// size() retorna a quantidade de elementos da lista
		// Lembre-se: tamanho != maior índice
		// Índices começam em 0
		System.out.println(list.size());

		// for-each percorre todos os elementos da lista
		// Muito usado quando não precisamos do índice
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------");

		// removeIf usa uma expressão lambda
		// Remove todos os elementos que satisfazem a condição
		// Aqui estamos removendo todos que começam com 'M'
		// charAt(0) pega o primeiro caractere da string
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------");

		// indexOf procura um elemento na lista
		// Retorna o índice do elemento encontrado
		// Se NÃO encontrar, retorna -1 (muito importante lembrar!)
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("----------");
		
		// stream() transforma a lista em um fluxo de dados (Stream API)
		// filter aplica um filtro nos elementos
		// collect(Collectors.toList()) converte o resultado novamente em List
		List<String> result = list.stream()
				.filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------");
		
		// findFirst() pega o primeiro elemento que satisfaz o filtro
		// Ele retorna um Optional
		// orElse(null) define que, se não encontrar nada, retorna null
		String name = list.stream()
				.filter(x -> x.charAt(0) == 'J')
				.findFirst()
				.orElse(null);
		
		System.out.println(name);

	}

}

// list.get(i)       // pega elemento
// list.set(i, obj)  // substitui elemento
// list.remove(i)    // remove por índice
// list.remove(obj)  // remove por valor
// list.size()       // tamanho
// list.contains(x)  // verifica se existe