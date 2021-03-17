package stringquestion;

import java.util.Scanner;

public class StringQuestion1 {

	public static void main(String[] args) {
		// prend une phrase de user
		//prend un mot et combien y a-til dans le phrase
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ecris une phrase sil vous plait");
		String phrase=scan.nextLine();
		System.out.println("Ecris un mot");
		char mot=scan.next().charAt(0);
		
		int count=0;
		
		for(int i=0;i<phrase.length()-1;i++) {
			if(phrase.charAt(i)==mot) {
				count++;
			}
		}
System.out.println("Dans la phrase il ya :"+ count+" mot");
	
	scan.close();
	}
	

}
