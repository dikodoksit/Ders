public class patates {
	public static void main(String Args[])
	{
		int x = 5;
		String isim = "Fatih";
		int y = 7;
		
		/* || Matematikteki 'veya' operat�r�n� temsil eder. Verilen 2 durumdan herhangi birinin do�ru olmas�
		 * sonucu do�ru yapacakt�r. && matematikteki 've' operat�r�n� temsil eder. Verilen 2 durumdan herhangi
		 * birinin yanl�� olmas�, sonucu yanl�� yapacakt�r.
		 */
		 
		// a�a��da mant�ksal operat�rlerle ilgili �rnekler verilmi�tir.
		
		if((x == 5) && isim != "Mustafa") || y == 7)
		{
			System.out.println("x 5'e e�it, isim Mustafa de�il veya y 7'ye e�it.")
		}
		else if(y != 7 && isim == "Sabri")
		{
			System.out.println("y 7'ye e�it de�il veya isim Sabri'ye e�it.");
		}
		// a�a��daki blok, verilerin bozuk ya da yanl�� girildi�i durumda, hata vermemek ad�na yaz�lm��t�r.
		else 
		{
			System.out.println("OK");
		}
	}
}