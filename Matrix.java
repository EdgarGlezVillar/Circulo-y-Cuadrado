package MATRIX_PCKG;

public class Matrix 
{
public int filas;
public int columnas;
public int[][] matrix;

//Constructor de matrices
public Matrix(int filas, int columnas)
{
	this.filas = filas;
	this.columnas = columnas;
	this.matrix = new int[filas][columnas];
}

public Matrix()
{
	this.filas = 0;
	this.columnas = 0;
	this.matrix = new int[filas][columnas];
}

	
public int[][] MatrixProduct(Matrix A, Matrix B)
{
	//verificar dimensiones
	if(A.columnas == B.filas)
	{
		int[][] AB = new int[A.filas][ B.columnas];
	
	for(int j = 1-1; j < AB[0].length; j++)
	{
		for(int i = 1-1 ; i < AB.length; i++)
		{
			for(int x = 1; x < A.columnas ; x++)
			{
				AB[i][j] = AB[i][j] + A.matrix[i][x]*B.matrix[x][j];
			}
		}
	}
		return AB;
	}
	else
	{
		System.out.println("La matriz no puede ser multiplicada");
		int[][] empty = new int[0][0];
		return empty;
	}
}

public int[][] TransposeMatrix(Matrix A)
{
	int[][] AT = new int[A.columnas][A.filas];
	
	for(int j = 1-1; j < AT[0].length; j++)
	{
		for(int i = 1-1; i < AT.length; i++)
		{
			AT[i][j] =  A.matrix[j][i];
		}
	}
	
	return AT;
}

public int SumaDeDiagPrincipal(Matrix A)
{
	if(A.filas == A.columnas)
	{
		int suma = 0;
		for(int i = 0; i<A.filas; i++)
		{
			suma = suma + A.matrix[i][i];
		}
		return suma;
	}
	else
	{
		System.out.println("La matriz no es cuadrada");
		int empty = 0;
		return empty;
	}
}

public int MAXdeLaMatrix(Matrix A)
{
	int MAX = A.matrix[0][0];
	for(int j = 0; j < A.columnas; j++)
	{
		for(int i = 0; i < A.filas; i++)
		{
			if(A.matrix[i][j]>MAX)
			{
				MAX = A.matrix[i][j];
			}
		}
	}
	return MAX;
}

public int[][] MatrixAddition(Matrix A, Matrix B)
{
	if(A.filas == B.columnas)
	{
		int[][] AplusB = new int[A.filas][B.columnas];
		for(int j = 1-1; j < AplusB[0].length; j++)
		{
			for(int i = 1-1; i < AplusB.length; i++)
			{
				AplusB[i][j] =  A.matrix[j][i] + B.matrix[i][j];
			}
		}
		return AplusB;
	}
	else
	{
		int[][] empty = new int[0][0];
		return empty;
	}
}


public int[][] MatrixEscalar(Matrix A, int k)
{
	int[][] kA = new int[A.filas][A.columnas];
	for(int j = 1-1; j < kA[0].length; j++)
	{
		for(int i = 1-1; i < kA.length; i++)
		{
			kA[i][j] =  k*A.matrix[j][i];
		}
	}
	return kA;
}

}//fin clase
