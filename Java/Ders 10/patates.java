public class patates {
	public static void main(String Args[])
	{
		String unvan = "kasap"; // unvan diye bir de�i�ken tan�mland�.
		
		 // switch anahtar kelimesi, parantez i�indeki de�i�kenin olas� de�erine g�re tan�mlanan bir sonu� verir.
		switch(unvan)
		{
			case "tornavida": // e�er unvan de�i�keni tornavida ise bu blok �al��acakt�r.
				System.out.println("Girebilirsiniz tornavida bey.");
				break; // break komutu, kod �al��t�ktan sonra program�n di�er durumlar� atlamas� i�indir.
			case "kasap":
				System.out.println("Giremezsin kasap!"); // e�er unvan de�i�keni kasap ise bu blok �al��acakt�r.
				break;
			case "sat�r":
				System.out.println("Ho�geldin patron!"); // e�er unvan de�i�keni sat�r ise bu blok �al��acakt�r.
			default:
				// e�er unvan de�i�keni yukaridakilerden hi�biri de�ilse bu blok �al��acakt�r.
				System.out.println("Hop! Sen de kimsin, giremezsin?!");
				break;
		}
	}
}