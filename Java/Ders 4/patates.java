import java.util.Scanner; // tarayıcı programa dahil edildi.

public class patates {
	public static void main(String Args[])
	{
		Scanner tarayici = new Scanner(System.in);
		
		 // programda tarayici isminde tarayici değişkeni tanımlandı.
		 
		System.out.println = ("Bir sayı gir.");
		int girilensayi = tarayici.nextInt(); // değişkene, kullanıcıdan alınan veri atandı.
		System.out.println("Girdiğiniz sayı: " + girilensayi); // girilensayi ekrana verildi.
		
		/*
		 * Videonun 2. kısmındaki kodlar aşağıda verilmiştir. Çalıştırmak için yorum işaretlerini programdan
		 * siliniz.
		 * 
		 * Scanner tarayici1 = new Scanner(System.in);
		 * System.out.println("Bir isim gir.");
		 * String girilenisim = tarayici1.nextLine();
		 * System.out.println("Girdiğiniz isim: " + girilenisim);
		 */
	}
}