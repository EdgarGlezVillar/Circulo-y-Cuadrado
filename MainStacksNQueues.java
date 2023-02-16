import java.util.Scanner;

public class MainStacksNQueues {

	public static void main(String[] args)
	{
		//ejercicio3
		Queues queue1 = new Queues(5);
		queue1.insert('a');
		queue1.insert('b');
		System.out.println(queue1.queue);
		queue1.eliminate();
		System.out.println(queue1.queue);
		
		//ejercicio4
		Stacks stack1 = new Stacks(5);
		stack1.push('a');
		stack1.push('b');
		System.out.println(stack1.stack);
		stack1.pop();
		System.out.println(stack1.stack);
		
		//ejercicio 5
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cadena a invertir");
		String sentence = scan.nextLine();
		Stacks stack2 = new Stacks(sentence);
		String sentenceInversed = stack2.invertirCadena(stack2);
		System.out.println(sentenceInversed);
		
		//ejercicio 6
		stack2.checarPalindromo(stack2);
	}
	
}
