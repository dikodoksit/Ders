public class patates {
	public static void main(String Args[])
	{
		String unvan = "kasap"; // unvan diye bir deðiþken tanýmlandý.
		
		 // switch anahtar kelimesi, parantez içindeki deðiþkenin olasý deðerine göre tanýmlanan bir sonuç verir.
		switch(unvan)
		{
			case "tornavida": // eðer unvan deðiþkeni tornavida ise bu blok çalýþacaktýr.
				System.out.println("Girebilirsiniz tornavida bey.");
				break; // break komutu, kod çalýþtýktan sonra programýn diðer durumlarý atlamasý içindir.
			case "kasap":
				System.out.println("Giremezsin kasap!"); // eðer unvan deðiþkeni kasap ise bu blok çalýþacaktýr.
				break;
			case "satýr":
				System.out.println("Hoþgeldin patron!"); // eðer unvan deðiþkeni satýr ise bu blok çalýþacaktýr.
			default:
				// eðer unvan deðiþkeni yukaridakilerden hiçbiri deðilse bu blok çalýþacaktýr.
				System.out.println("Hop! Sen de kimsin, giremezsin?!");
				break;
		}
	}
}