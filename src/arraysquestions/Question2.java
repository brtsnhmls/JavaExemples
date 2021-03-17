package arraysquestions;

public class Question2 {

	public static void main(String[] args) {
		//Asagidaki multi dimentional array'in ic arraylerindeki son elemanlarin carpimini ekrana yazdiran bir program yazin
		
		int arr[][]= {{1,2,4},{4,5},{6}};
		int count=1;
		for(int i=0; i<arr.length;i++) {
			for(int j=arr[i].length-1;j<arr[i].length;j++) {
				count*=arr[i][j];
			}
		}
System.out.println(count);
	}

}
