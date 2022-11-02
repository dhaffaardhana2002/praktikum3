public class Pegawai {
	String nama;
	double gajiPokok;

	// Nama
	public void setNama(String nama) {
		this.nama = nama; }

	public String getNama() {
		return this.nama; }

	// Gaji Pokok
	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok; }

	public double getGajiPokok() {
		return this.gajiPokok; }

	// Cetak Info
	public void cetakInfo() {
		System.out.println("Nama 		: " + getNama());
		System.out.println("Gaji Pokok 	: " + getGajiPokok());
	}
}

