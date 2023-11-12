public class Hewan {
	protected String JenisSuara;
	public Hewan(String JenisSuara) {
		this.JenisSuara = JenisSuara;
	}
	public void bersuara() {
		System.out.println("Hewan Bersuara: "+JenisSuara);
	}
}