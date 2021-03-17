package arraysquestions;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		/*TODO Auto-generated method stub
Écrivez une méthode qui imprime tous les éléments du tableau multidimensionnel ci-dessous.

		*/
		
		int arr[][]= {{1,2,3},{4,5,6}};
		int[] arr2=new int[3];
		int temp=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp*=arr[i][j];
			
			}
		}
		System.out.println(temp);
	}

}
