# Tugas PBO Pertemuan 6

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Inheritance

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `praktikum2` dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class praktikum2 {
	public static void main(String[] args) {
	
	}
}
```

### Buat file Pegawai class

- Untuk membuat super class constructor, buat file di folder yang sama dengan nama `Pegawai.java`
- Tulis kode java seperti berikut

```
public class Pegawai {
	String nama;
	double gajiPokok;
}
```

- Lalu buat Setter dan Getter sebagai berikut

```
public void setNama(String nama) {
	this.nama = nama; }

public String getNama() {
	return this.nama; }

public void setGajiPokok(double gajiPokok) {
	this.gajiPokok = gajiPokok; }

public double getGajiPokok() {
	return this.gajiPokok; }
```

- Setelah itu buat function `cetakInfo()` untuk mencetak informasi dari Pegawai

```
public void cetakInfo() {
	System.out.println("Nama 		: " + getNama());
	System.out.println("Gaji Pokok 	: " + getGajiPokok());
}
```

### Buat file Manager sebagai subclass dari Pegawai

- Setelah diawal telah membuat super class, sekarang kita akan membuat sub class dengan menggunakan syntac `extend` setelah nama sub class
- Sebelum itu buat file baru dengan nama `Manager.java` dan ketik kode tersebut


```
public class Manager extends Pegawai { 

}
```

- Lalu buat variabel tunjangan dan juga Setter Getter


```
double tunjangan;

public void setTunjangan(double tunjangan) {
	this.tunjangan = tunjangan; }

public double getTunjangan() {
	return this.tunjangan; }
```

- Buat cetak tunjangan dan cetak info, tujuan cetak tunjangan agar bisa digunakan jika hanya ingin melihat tunjangan atau bisa untuk digunakan didalam cetak info

```
public void cetakInfo() {
	System.out.println("Manager");
	super.cetakInfo();
	cetakTunjangan(); }

public void cetakTunjangan() {
	System.out.println("Tunjangan 	: " + getTunjangan()); }
```

Bisa anda lihat diatas ada syntac `super`, bukan superman ataupun kekuatan super tapi super class. Ini digunakan untuk mengakses function `cetakInfo()` dari class Pegawai agar tidak perlu di ketik ulang.

### Buat file Programmer sebagai subclass juga

- Setelah itu buat file baru dengan nama `Programmer.java`
- Lalu buat variabel tunjangan dan juga Setter Getter

```
double bonus;

public void setBonus(double bonus) {
	this.bonus = bonus; }

public double getBonus() {
	return this.bonus; }
```

- Buat cetak info dan cetak bonus dengan cara yang sama dengan Manager

```
public void cetakInfo() {
	System.out.println("Programmer");
	super.cetakInfo();
	cetakBonus(); }

public void cetakBonus() {
	System.out.println("Bonus 	: " + getBonus()); }
```

### Di dalam file `prektikum3.java`

- Tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari class constructor yang sudah dibuat

```
Manager orang1 = new Manager();
```

- Gunakan enkapsulasi yang sudah dibuat di awal untuk membuat objek

```
orang1.setNama("Diana Putri");
orang1.setGajiPokok(6450000.5);
orang1.setTunjangan(4000000.7);
```

### Cetak hasil koding

- Print hasil dengan menggunakan function `cetakInfo()`

```
orang1.cetakInfo();
```

- Lakukan hal yang sama pada `orang2` namun dengan nama yang lain
- Print juga hasil untuk Riko
- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `praktikum2.java`, `Pegawai.java`, `Manager.java`, dan `Programmer.java`.
- Jika berhasil dan tidak ada error, ketik

```
java praktikum2
```

- Tampilan nya akan seperti ini

```
Manager
Nama 		: Diana Putri
Gaji Pokok 	: 6450000.5
Tunjangan 	: 4000000.7
Programmer
Nama 		: Ricardo Felix
Gaji Pokok 	: 5699390.6
Bonus 		: 3000000.2
```

[Klik disini untuk melihat Hasil screenshot](https://github.com)

___
Terima kasih untuk membaca tutorial saya. Tak lupa juga untuk dosen saya dan teman-teman saya yang sudah membantu saya.
