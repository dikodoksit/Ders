import java.util.Scanner; // programa taray�c� tan�mland�.

public class patates {
	public static void main(String Args[])
	{
		// 1'den kullan�c�dan al�nan pozitif n de�erine kadar olan, 3'e b�l�nebilen say�lar�n toplam�
		int n;
		int a = 0;
		int toplam = 0;
		
		Scanner tarayici1 = new Scanner(System.in); // taray�c� de�i�keni tan�mland�.	
		System.out.println("Bir n de�eri giriniz.");
		n = tarayici1.nextInt(); // n de�i�kenine, kullan�c�n�n girdi�i de�er atand�.
		
		// while de�i�keni, parantezdeki durum true de�erini verdik�e, i�erisindeki kod blo�unu tekrarlar.
		while(n <= 0) // kullan�c� e�er pozitif say� girmezse, girene kadar bu blok �al��acakt�r.
		{
			System.out.println("L�tfen pozitif bir n de�eri giriniz.");
			n = tarayici1.nextInt();
		}
		
		while(a <= n) // yukar�da tan�mlad���mz� a de�eri, n'den k���k oldu�u s�rece a�a��daki kod blo�u tekrarlan�r.
		{
			if(a%3 == 0) // a 3'e b�l�nebiliyorsa, program a�a��daki kod blo�unu �al��t�racakt�r.
			{
				toplam = toplam + a; // toplam de�i�kenine a eklendi.
			}
			a++; // a n'e e�it oluncaya kadar a 1 artt�r�l�r.
		}
		
		System.out.println("1 ile n de�eri aras�ndaki 3'e b�l�nebilen tam say�lar�n toplam�: " + toplam);
		
		// 1 ile n de�eri aras�ndaki 3'e b�l�nebilen say�lar�n toplam� ekrana verildi.
	}
}