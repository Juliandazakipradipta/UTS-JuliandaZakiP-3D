public class Kucing extends Hewan {
	public Kucing(String JenisSuara) {
		super("Meong");
	}
	public void bersuara() {
		System.out.println("Kucing ini bersuara "+JenisSuara);
	}
	public void jenis() {
		System.out.println("Hewan ini merupakan hewan Mamalia");
	}
}
