public class Programmer extends Pegawai {
	double bonus;

	// Bonus
	public void setBonus(double bonus) {
		this.bonus = bonus; }

	public double getBonus() {
		return this.bonus; }

	// Cetak
	public void cetakInfo() {
		System.out.println("Programmer");
		super.cetakInfo(); // Mengunakan "super" untuk menakses Getter dari class Pegawai, dimana Pegawai adalah super class
		cetakBonus(); }

	public void cetakBonus() {
		System.out.println("Bonus 	: " + getBonus()); }
}