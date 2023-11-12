import java.util.List;
public class Admin extends Pengguna {
	public Admin(String nama) {
		super(nama);
	}
	public void identifikasi() {
		System.out.println("Admin "+nama);	
	}
	public void liatBuku(List<Buku> DaftarBuku) {
		System.out.println("Daftar Buku: ");
		for (Buku buku : DaftarBuku) {
			System.out.println(buku);
		}
	}

}