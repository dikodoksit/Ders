import java.util.Scanner; // taray�c� programa tan�mland�.

public class patates {
	public static void main(String Args[])
	{
		Scanner tarayici1 = new Scanner(System.in);
		System.out.println("Say�lar� toplama ve �arpma program�na ho�geldiniz.");
		double x, y, toplam, carpim; // birden �ok de�i�ken tek sat�rda tan�mland�.
		System.out.println("�lk say�y� giriniz.");
		x = tarayici1.nextDouble(); // x'e kullan�c�dan al�nan de�er atand�.
		System.out.println("�kinci say�y� giriniz.");
		y = tarayici1.nextDouble(); // y'ye kullan�c�dan al�nan de�er atand�.
		toplam = x+y; // x ve y toplanarak toplam de�i�kenine atand�.
		carpim = x*y; // x ve y �arp�larak carpim de�i�kenine atand�.
		System.out.println("Girdi�iniz say�lar�n toplam�: " + toplam);
		System.out.println("Girdi�iniz say�lar�n �arp�m�: " + carpim);
	}
}