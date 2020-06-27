package E200627;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		int intArray[] = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		Cookie.solution(intArray);*/
		
		int intArray[] = new int[5];
		int intArray2[] = new int[5];
		int nodeArray[][] = new int[5][5];
		for (int i = 0; i < intArray.length; i++) 
			intArray[i] = scanner.nextInt();
		for (int j = 0; j < intArray2.length; j++) 
			intArray2[j] = scanner.nextInt();
		BinaryTree.solution(nodeArray);
		
		/*
		String str = scanner.next();
		JadenCase.solution(str); */
		
		/*
		int n = scanner.nextInt();
		int o = scanner.nextInt();
		int t = scanner.nextInt();
		int m = scanner.nextInt();
		Notation.solution(n, t, m, w); 
		//Notation, turn, member, order
		*/
		
		/*
		int intArray[] = new int[5];
		int n = scanner.nextInt();
		int w = scanner.nextInt();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		Station.solution(n, intArray, w); 
		//APTlength, station, width
		*/
	}

}
