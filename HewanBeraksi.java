import java.util.Scanner;
public class HewanBeraksi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Kucing kucing = new Kucing(null);
		Anjing anjing = new Anjing(null);
		System.out.print("Masukan jenis hewan(Anjing/Kucing): ");
		String hewan = input.nextLine();
		if(hewan.equalsIgnoreCase("Kucing")) {
			kucing.bersuara();
		}else if (hewan.equalsIgnoreCase("Anjing")) {
			anjing.bersuara();
		}else {
			System.out.println("Jenis hewan ini tidak dikenal.");
		}
		
		System.out.print("\nApakah anda ingin mengetahui hewan yang ada pilih jenis hewan apa? (Y/N): ");
		String pil = input.nextLine();
		if (pil.equalsIgnoreCase("Y")) {
			if(hewan.equalsIgnoreCase("Anjing")) {
				anjing.jenis();
			} else if (hewan.equalsIgnoreCase("Kucing")) {
				kucing.jenis();
			}else {
				System.out.println("hewan ini tidak ada pilihan.");
			}
		} else if(pil.equalsIgnoreCase("N")){
			System.out.println(".");
		}else {
			System.out.println("Pilihan yang anda masukan salah.");
		}
	}

}

