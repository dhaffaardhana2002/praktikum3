public class Manager extends Pegawai {
	double tunjangan;

	// Tunjangan
	public void setTunjangan(double tunjangan) {
		this.tunjangan = tunjangan; }

	public double getTunjangan() {
		return this.tunjangan; }

	// Cetak
	public void cetakInfo() {
		System.out.println("Manager");
		super.cetakInfo(); // Mengunakan "super" untuk menakses Getter dari class Pegawai, dimana Pegawai adalah super class
		cetakTunjangan(); }

	public void cetakTunjangan() {
		System.out.println("Tunjangan 	: " + getTunjangan()); }
}