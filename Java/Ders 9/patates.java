public class patates {
	public static void main(String Args[])
	{
		int x = 5;
		String isim = "Fatih";
		int y = 7;
		
		/* || Matematikteki 'veya' operatörünü temsil eder. Verilen 2 durumdan herhangi birinin doðru olmasý
		 * sonucu doðru yapacaktýr. && matematikteki 've' operatörünü temsil eder. Verilen 2 durumdan herhangi
		 * birinin yanlýþ olmasý, sonucu yanlýþ yapacaktýr.
		 */
		 
		// aþaðýda mantýksal operatörlerle ilgili örnekler verilmiþtir.
		
		if((x == 5) && isim != "Mustafa") || y == 7)
		{
			System.out.println("x 5'e eþit, isim Mustafa deðil veya y 7'ye eþit.")
		}
		else if(y != 7 && isim == "Sabri")
		{
			System.out.println("y 7'ye eþit deðil veya isim Sabri'ye eþit.");
		}
		// aþaðýdaki blok, verilerin bozuk ya da yanlýþ girildiði durumda, hata vermemek adýna yazýlmýþtýr.
		else 
		{
			System.out.println("OK");
		}
	}
}