public class praktikum3 {
	public static void main(String[] args) {
		Manager orang1 = new Manager();

		// Set Pegawai
		orang1.setNama("Diana Putri");
		orang1.setGajiPokok(6450000.5);

		// Set Manager
		orang1.setTunjangan(4000000.7);

		//Cetak Diana
		orang1.cetakInfo();


		Programmer orang2 = new Programmer();

		// Set Pegawai
		orang2.setNama("Ricardo Felix");
		orang2.setGajiPokok(5699390.6);

		// Set Manager
		orang2.setBonus(3000000.2);

		//Cetak Diana
		orang2.cetakInfo();


	}
}