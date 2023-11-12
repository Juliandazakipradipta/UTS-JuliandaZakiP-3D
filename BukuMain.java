import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BukuMain {
	
	public static void HapusBuku(List<Buku> DaftarBuku, Buku buku) {
		if(DaftarBuku.contains(buku)) {
			DaftarBuku.remove(buku);
			System.out.println("Buku telah dihapus");
		}else {
			System.out.println("Buku tak terdeteksi");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Buku> DaftarBuku = new ArrayList<Buku>();
		DaftarBuku.add(new Fiksi("Haikyuu!!!"));
		DaftarBuku.add(new NonFiksi("Filosofi Teras"));
		
		System.out.print("Login (User/Admin): ");
		String login = input.nextLine();
		if(login.equalsIgnoreCase("User")) {
			System.out.print("Masukan Nama User: ");
			String nama = input.nextLine();
			User user = new User(nama);
			user.identifikasi();
			System.out.println();
			user.liatBuku(DaftarBuku);
		} else if(login.equalsIgnoreCase("Admin")){
			System.out.print("Masukan Nama Admin: ");
			String nama = input.nextLine();
			Admin admin = new Admin(nama);
			admin.identifikasi();
			System.out.println();
			System.out.println("Pilih Menu:");
			System.out.println("1. Tambah Buku");
			System.out.println("2. Lihat Daftar Buku");
			System.out.println("3. Hapus buku");
			System.out.print("Masukan Pilihan Menu (1-3): ");
			int pil = input.nextInt();
			input.nextLine();
			switch (pil) {
			case 1: {
				System.out.println();
				System.out.print("Masukan judul Buku Baru: ");
				String JBaru = input.nextLine();
				System.out.print("Masukan Genre Buku(Fiksi/Non-Fiksi: ");
				String GBaru = input.nextLine();
				if(GBaru.equalsIgnoreCase("Fiksi")) {
					DaftarBuku.add(new Fiksi(JBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.liatBuku(DaftarBuku);
				}else if(GBaru.equalsIgnoreCase("Non-Fiksi")) {
					DaftarBuku.add(new NonFiksi(JBaru));
					System.out.println("Buku berhasil ditambahkan");
					admin.liatBuku(DaftarBuku);
				}
				break;
			}
			case 2: {
				System.out.println();
				admin.liatBuku(DaftarBuku);
				break;
			}
			case 3: {
			    System.out.println();
			    System.out.print("Masukan Buku yang ingin dihapus: ");
			    String judulHapus = input.nextLine();
			    boolean BukuDitemukan = false;
			    for (Buku buku : DaftarBuku) {
			        if (buku.judul.equalsIgnoreCase(judulHapus)) {
			            DaftarBuku.remove(buku);
			            System.out.println("Buku telah dihapus.");
			            BukuDitemukan = true;
			        }
			    }
			    if (!BukuDitemukan) {
			        System.out.println("Buku tidak terdeteksi.");
			    }
			    admin.liatBuku(DaftarBuku);
			    break;
			}
			default:
				System.out.println("Menu yang anda pilih tidak tersedia.");
			}
		} else {
			System.out.println("Pengguna tidak terdaftar.");
		}
		
	}
}
