
public class Queues {
char queue[];
int tail;
int MAX;


//constructor
public Queues(int max)
{
	this.MAX = max;
	this.queue = new char[max];
	this.tail = 0;
	for(int i = 0; i < max; i++)
	{
		this.queue[i] = ' ';
	}
}
	
//Método insert
public void insert (char data) 
{
	if(tail == MAX)
	{
		System.out.println("Queue is full"); 
	}
	else 
	{ 
		queue[tail] = data;/* inserts data*/ 
		tail++; /* increases index*/ 
	} 
}

public char eliminate() 
{	
	if(tail == 0)
	{
		System.out.println("La cola está vacía");
		return '#';
	}
	else
	{
		char data = queue[0];
		for(int i = 0; i < MAX-1 ; i++)
		{
			queue[i] = queue[i+1];
		}
		queue[MAX-1] = ' ';
		tail-- ;
		return data;
	}
} 


}
