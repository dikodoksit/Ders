import java.util.Scanner; // programa taray�c� tan�mland�.

public class patates {
	public static void main(String Args[])
	{
		int x, y;
		Scanner tarayici1 = new Scanner(System.in);
		System.out.println("Kar��la�t�rmak istedi�iniz say� de�erlerinden birincisini giriniz.");
		x = tarayici1.nextInt(); // �nceden tan�mlanan x de�i�kenine kullan�c� taraf�ndan de�er atand�.
		System.out.println("Kar��la�t�rmak istedi�iniz say� de�erlerinden ikincisini giriniz.");
		y = tarayici1.nextInt(); // �nceden tan�mlanan y de�i�kenine kullan�c� taraf�ndan de�er atand�.
		
		if(x == y) // x ile y e�er e�it ise a�a��daki kod blo�u �al��acakt�r.
		{
			System.out.println("Girdi�iniz iki de�er birbirine e�it.");
		}
		else if(x > y) // x e�er y'den daha b�y�kse a�a��daki kod blo�u �al��acakt�r.
		{
			System.out.println("Birinci de�er, ikinci de�erden daha b�y�k.");
		}
		else if(x < y) // x e�er y'den daha k���kse a�a��daki kod blo�u �al��acakt�r.
		{
			System.out.println("Birinci de�er, ikinci de�erden daha k���k.");
		}
		else // e�er yukar�daki �� durum da yanl�� ise, a�a��daki kod blo�u �al��acakt�r.
		{
			System.out.println("Girdi�iniz de�erler int veri tipinde olmak zorunda");
		}
	}
}