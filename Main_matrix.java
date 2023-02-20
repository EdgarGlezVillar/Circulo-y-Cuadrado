package MATRIX_PCKG;

public class Main_matrix 
{
	public static void main(String[] args)
	{
		Matrix A = new Matrix(2,2);
		Matrix B = new Matrix(2,2);
		
		A.matrix[0][0] = 1;
		A.matrix[0][1] = 2;
		A.matrix[1][0] = 3;
		A.matrix[1][1] = 4;
		
		B.matrix[0][0] = 1;
		B.matrix[0][1] = 2;
		B.matrix[1][0] = 3;
		B.matrix[1][1] = 4;
		//ejercicio1
		int[][] AB = A.MatrixProduct(A, B);
		for (int i = 0; i < AB.length; i++) {
			   for (int j = 0; j < AB[i].length; j++) {
			      System.out.print(AB[i][j] + " ");
			   }
			   System.out.println();  // imprime una nueva línea después de cada fila
			}
		System.out.println();
		
		//ejercicio2
		int[][] AT = A.TransposeMatrix(A);
		for (int i = 0; i < AT.length; i++) {
			   for (int j = 0; j < AT[i].length; j++) {
			      System.out.print(AT[i][j] + " ");
			   }
			   System.out.println();  // imprime una nueva línea después de cada fila
			}
		System.out.println();
			
		//ejercicio3
		int ASumaDiag = A.SumaDeDiagPrincipal(A);
		System.out.println(ASumaDiag);
		System.out.println();
		
		//ejercicio4
		int AMAX = A.MAXdeLaMatrix(A);
		System.out.println(AMAX);
		System.out.println();
			
		//ejercicio5
		int[][] AplusB =A.MatrixAddition(A, B);
		for (int i = 0; i < AplusB.length; i++) {
			   for (int j = 0; j < AplusB[i].length; j++) {
			      System.out.print(AplusB[i][j] + " ");
			   }
			   System.out.println();  // imprime una nueva línea después de cada fila
			}
		System.out.println();
			
		//ejercicio6
		int[][] kA = A.MatrixEscalar(A,0);
		for (int i = 0; i < kA.length; i++) {
			   for (int j = 0; j < kA[i].length; j++) {
			      System.out.print(kA[i][j] + " ");
			   }
			   System.out.println();  // imprime una nueva línea después de cada fila
			}
		System.out.println();
	}

}
