import java.util.Scanner;
import java.util.Stack;

public class App {
	public static void main(String[] args) throws Exception {

		Pilha<String> pilha = new Pilha<String>();
		Stack<String> stack = new Stack<String>();
		Pilha<String> pilhaPar = new Pilha<String>();
		Pilha<String> pilhaImpar = new Pilha<String>();
		Pilha<Livros> livros = new Pilha<Livros>(20);
		Scanner scan = new Scanner(System.in);
		// System.out.println(pilha.topo());
		// System.out.println(pilha.desempilha());

		int numero;
		int numero2 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 numeros");
			numero = Integer.parseInt(scan.nextLine());
			if (numero % 2 == 0) {

				String str_x = "" + numero;

				pilha.empilha(str_x);
			} else if (pilha.desempilha() == null) {
				System.out.println("A pilha esta vazia");
			}
			System.out.println(pilha);
			if (pilha.tamanho() > 0) {

				pilha.desempilha();
				System.out.println("lista desempilhada" + pilha);

			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 numeros para a lista Par e Impar");
			numero2 = Integer.parseInt(scan.nextLine());
			if (numero2 % 2 == 0) {
				String str_x = "" + numero2;

				pilhaPar.empilha(str_x);
			} else {
				String str_x = "" + numero2;

				pilhaImpar.empilha(str_x);
			}

			System.out.println(pilhaPar);
			System.out.println(pilhaImpar);

			if (numero2 == 0) {

				if (pilhaPar.desempilha() == null || pilhaImpar.desempilha() == null) {
					System.out.println("Pilha esta vazia ");
				}
			}
		}
		System.out.println(pilhaPar);
		System.out.println(pilhaImpar);
		if (pilhaPar.tamanho() > 0) {
			for (int i = 0; i < pilhaPar.tamanho(); i++) {

				pilhaPar.desempilha();
				System.out.println("lista desempilhada" + pilhaPar);

			}
		}
		if (pilhaImpar.tamanho() > 0) {
			for (int i = 0; i < pilhaImpar.tamanho(); i++) {

				pilhaImpar.desempilha();
				System.out.println("lista desempilhada" + pilhaImpar);

			}
		}

		Livros c1 = new Livros(" Código da Vince", "178-25-15450-89-2", 2003, "Dan Brown");
		Livros c2 = new Livros("O Leão, a Feiticeira e o Guarda-Roupa", "138-44-13450-69-2", 1950, "C.S. Lewis");
		Livros c3 = new Livros("Ela, a Feiticeira ", "178-35-13450-85-2", 1887, " H. Rider Haggard");
		Livros c4 = new Livros("O Sonho da Câmara Vermelha ", "148-35-14450-89-2", 1791, "Cao Xueqin");
		Livros c5 = new Livros("O Caso dos 10 Negrinhos", "376-25-15670-89-2", 1939, "Agatha Christie");
		Livros c6 = new Livros("O Hobbit", "278-25-13450-89-2", 1937, "J. R. R. Tolkien");
		Livros c7 = new Livros("Harry Potter e a Pedra Filosofal", "278-35-14450-85-4", 1997, " J. K. Rowling");
		   
			livros.empilha(c1);
	        livros.empilha(c2);
	        livros.empilha(c3);
	        livros.empilha(c4);
	        livros.empilha(c5);
	        livros.empilha(c6);
		
		System.out.println("estaVazia() " + livros.estaVazia());
		System.out.println("topo() " + livros.topo());
		System.out.println("empilha() " + livros.empilha(c7));
		System.out.println("desempilha() " + livros.desempilha());
		System.out.println("tamanho() " + livros.tamanho());
		System.out.println("toString() " + livros.toString());
		
		 Stack<Livros> livroS = new Stack<Livros>();
	
	
	
			Livros s1 = new Livros(" Código da Vince", "178-25-15450-89-2", 2003, "Dan Brown");
			Livros s2 = new Livros("O Leão, a Feiticeira e o Guarda-Roupa", "138-44-13450-69-2", 1950, "C.S. Lewis");
			Livros s3 = new Livros("Ela, a Feiticeira ", "178-35-13450-85-2", 1887, " H. Rider Haggard");
			Livros s4 = new Livros("O Sonho da Câmara Vermelha ", "148-35-14450-89-2", 1791, "Cao Xueqin");
			Livros s5 = new Livros("O Caso dos 10 Negrinhos", "376-25-15670-89-2", 1939, "Agatha Christie");
			Livros s6 = new Livros("O Hobbit", "278-25-13450-89-2", 1937, "J. R. R. Tolkien");
			Livros s7 = new Livros("Harry Potter e a Pedra Filosofal", "278-35-14450-85-4", 1997, " J. K. Rowling");
			
			    livroS.push(c1);
		        livroS.push(c2);
		        livroS.push(c3);
		        livroS.push(c4);
		        livroS.push(c5);
		        livroS.push(c6);
	
	
		        System.out.println("isEmpty() " +  livroS.isEmpty());
		        System.out.println("peek() " +  livroS.peek());
		        System.out.println( "push() " +  livroS.push(c7));
		        System.out.println("pop() " +  livroS.pop());
		        System.out.println( "size() " +  livroS.size());
		        System.out.println( "toString() " +  livroS.toString());
	
	
	
	
	
	
	
	}
}