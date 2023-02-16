
import java.util.Scanner;

public class Stacks {
char stack[];
int top;
int MAX;

//constructor
public Stacks(int max)
{
	this.MAX = max;
	this.stack = new char[max];
	this.top = 0;
	for(int i = 0; i < max; i++)
	{
		this.stack[i] = ' ';
	}
}

public Stacks(String sentence)
{
	stack = sentence.toCharArray();
	MAX = stack.length;
	top = MAX;
}
	
//método push
public void push(char data) 
{ 
if(top == MAX)
	{
	System.out.println("Stack is full");
	}
else 
	{ 
	stack[top] = data; /* adds element*/
	top++; /* increases top */ 
	} 
}

//Método pop
public char pop() 
{ 
char data;
	if(top == 0) 
	{
		System.out.println("Stack is empty"); 
		return stack[top]; 
	}
	else 
	{ 
		data = stack[top-1];
		stack[top-1] = ' ';
		top-- ; /* decreases top */ 
		return data; /*retuns eliminated element*/ 
	} 
}

//método para invertir cadena
public String invertirCadena(Stacks object) 
{
	String sentenceNew = "";
	for( int i = 0; i < MAX ; i++)
	{
		char POPchar = object.pop();
		sentenceNew = sentenceNew + POPchar;
	}
	return sentenceNew;
}

//método palíndromo
public void checarPalindromo(Stacks object)
{
	 String sentenceReversed = object.invertirCadena(object);
	 String sentenceOriginal = "";
	 for(int i = 0; i < MAX; i++)
	 {
		 sentenceOriginal = sentenceOriginal + stack[i];
	 }
	 
	 if(sentenceOriginal == sentenceReversed)
	 {
		 System.out.println("Sí es palíndromo");
	 }
	 else
	 {
		 System.out.println("No es palíndromo");
	 }
}

}//fin Clase Stacks
