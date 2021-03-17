package stringquestion;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		/*
		 Bir sayının mükemmel olup olmadığını bulan bir program yazınız.
         Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayı mükemmeldir.
         ORNEK:
          INPUT     : 6
          OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir sayi girin");
	int num=scan.nextInt();
	
	System.out.println(checkperfect(num)?"Sayi Mukemmel sayi":"Sayi Mukemmel sayi degil");
	scan.close();
	}

	private static boolean checkperfect(int num) {
		int toplam=0;
		boolean flag=false;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				toplam=toplam+i;
				
			}
		
		}
		if(toplam==num) {
			flag=true;
		}
		return flag;
	}

}
