package miniProjeSayıBulma;

public class miniProjeSayıBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int arananSayi = 6; 
		boolean mevcutMu = false;
		
		for (int sayi : sayilar) {
			if(sayi == arananSayi) {
				mevcutMu = true;
				break;
			}
		}
		
		
		if (mevcutMu) {
			System.out.println("Sayı mevcuttur.");
		}
		else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
