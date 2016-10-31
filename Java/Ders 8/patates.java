import java.util.Scanner; // programa tarayýcý tanýmlandý.

public class patates {
	public static void main(String Args[])
	{
		int x, y;
		Scanner tarayici1 = new Scanner(System.in);
		System.out.println("Karþýlaþtýrmak istediðiniz sayý deðerlerinden birincisini giriniz.");
		x = tarayici1.nextInt(); // önceden tanýmlanan x deðiþkenine kullanýcý tarafýndan deðer atandý.
		System.out.println("Karþýlaþtýrmak istediðiniz sayý deðerlerinden ikincisini giriniz.");
		y = tarayici1.nextInt(); // önceden tanýmlanan y deðiþkenine kullanýcý tarafýndan deðer atandý.
		
		if(x == y) // x ile y eðer eþit ise aþaðýdaki kod bloðu çalýþacaktýr.
		{
			System.out.println("Girdiðiniz iki deðer birbirine eþit.");
		}
		else if(x > y) // x eðer y'den daha büyükse aþaðýdaki kod bloðu çalýþacaktýr.
		{
			System.out.println("Birinci deðer, ikinci deðerden daha büyük.");
		}
		else if(x < y) // x eðer y'den daha küçükse aþaðýdaki kod bloðu çalýþacaktýr.
		{
			System.out.println("Birinci deðer, ikinci deðerden daha küçük.");
		}
		else // eðer yukarýdaki üç durum da yanlýþ ise, aþaðýdaki kod bloðu çalýþacaktýr.
		{
			System.out.println("Girdiðiniz deðerler int veri tipinde olmak zorunda");
		}
	}
}