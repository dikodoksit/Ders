import java.util.Scanner; // tarayýcý programa tanýmlandý.

public class patates {
	public static void main(String Args[])
	{
		Scanner tarayici1 = new Scanner(System.in);
		System.out.println("Sayýlarý toplama ve çarpma programýna hoþgeldiniz.");
		double x, y, toplam, carpim; // birden çok deðiþken tek satýrda tanýmlandý.
		System.out.println("Ýlk sayýyý giriniz.");
		x = tarayici1.nextDouble(); // x'e kullanýcýdan alýnan deðer atandý.
		System.out.println("Ýkinci sayýyý giriniz.");
		y = tarayici1.nextDouble(); // y'ye kullanýcýdan alýnan deðer atandý.
		toplam = x+y; // x ve y toplanarak toplam deðiþkenine atandý.
		carpim = x*y; // x ve y çarpýlarak carpim deðiþkenine atandý.
		System.out.println("Girdiðiniz sayýlarýn toplamý: " + toplam);
		System.out.println("Girdiðiniz sayýlarýn çarpýmý: " + carpim);
	}
}