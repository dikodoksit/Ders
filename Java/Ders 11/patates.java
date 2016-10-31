import java.util.Scanner; // programa tarayýcý tanýmlandý.

public class patates {
	public static void main(String Args[])
	{
		// 1'den kullanýcýdan alýnan pozitif n deðerine kadar olan, 3'e bölünebilen sayýlarýn toplamý
		int n;
		int a = 0;
		int toplam = 0;
		
		Scanner tarayici1 = new Scanner(System.in); // tarayýcý deðiþkeni tanýmlandý.	
		System.out.println("Bir n deðeri giriniz.");
		n = tarayici1.nextInt(); // n deðiþkenine, kullanýcýnýn girdiði deðer atandý.
		
		// while deðiþkeni, parantezdeki durum true deðerini verdikçe, içerisindeki kod bloðunu tekrarlar.
		while(n <= 0) // kullanýcý eðer pozitif sayý girmezse, girene kadar bu blok çalýþacaktýr.
		{
			System.out.println("Lütfen pozitif bir n deðeri giriniz.");
			n = tarayici1.nextInt();
		}
		
		while(a <= n) // yukarýda tanýmladýðýmzý a deðeri, n'den küçük olduðu sürece aþaðýdaki kod bloðu tekrarlanýr.
		{
			if(a%3 == 0) // a 3'e bölünebiliyorsa, program aþaðýdaki kod bloðunu çalýþtýracaktýr.
			{
				toplam = toplam + a; // toplam deðiþkenine a eklendi.
			}
			a++; // a n'e eþit oluncaya kadar a 1 arttýrýlýr.
		}
		
		System.out.println("1 ile n deðeri arasýndaki 3'e bölünebilen tam sayýlarýn toplamý: " + toplam);
		
		// 1 ile n deðeri arasýndaki 3'e bölünebilen sayýlarýn toplamý ekrana verildi.
	}
}