package arraysquestions;

import java.util.Arrays;

public class Question03 {

	public static void main(String[] args) {
		// Asagidaki multi dimentional arraylerin ayni index'e sahip elemanlarinin toplamini
		//ekrana yazdiran bir program yazin
		
		int arr1[][]= {{1,2},{3,4,5},{6}};
		int arr2[][]= {{7,8},{9,10,11},{12}};
		int arr3[][]={{0,0},{0,0,0},{0}};
		int count1=0;
		int count2=0;
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
				count2=arr1[i][j]+arr2[i][j];
				arr3[i][j]=count2;
			}
					
		}
		System.out.println(Arrays.deepToString(arr3));
	
	}

}
