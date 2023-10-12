# Posttest-2-PBO

## Elemen Penting
Dalam pemrograman bertema Service Mobil ini terdapat ArrayList<mobil> daftarMobil = new ArrayList<>(); untuk menginisialisasi objek ArrayList daftarMobil. ArrayList untuk menyimpan objek dan penambahan atau penghapusan elemen. Tipe elemen di ArrayList ini adalah mobil. Lalu ada import java.util.ArrayList; untuk mengakses ke fungsionalitas class ArrayList tanpa mereservasi ruang memori. import java.util.Scanner; untuk membaca inputan dari pengguna melalui console atau file dalam program. import java.util.Iterator; untuk mengakses elemen satu persatu pada kumpulan objek. Pemrograman ini menggunakan operasi CRUD yang terbagi pada setiap case. Case 1 add, case 2 read, case 3 update dan case 4 remove.
Kemudian terdapat pula;
    public String getNamaService() {
        return namaservice; 
ini digunakan untuk mendapat nilai nama service dari objek kelas mobil.
    public String getMerkMobil() {
        return merkmobil;
metode ini digunakan untuk mendapatkan informasi terkait merk mobil.
    public double getHarga() {
        return harga;
digunakan untuk mendapatkan nilai dari atribut harga. Adapun
    public void setHarga (double harga) {
        this.harga = harga;
ini adalah metode setter untuk mengatur nilai atribut harga dari objek kelas mobil dengan nilai yang diberikan sebagai parameter.


## Alur Kerja Output
Saat program di-run, akan muncul menu admin yang terdiri dari tambah, lihat, update dan hapus.
**********************************
|        >> MENU ADMIN <<        |
**********************************
|   1. Tambah Daftar Service     |
|   2. Lihat Daftar Service      |
|   3. Update Daftar Service     |
|   4. Hapus Daftar Service      |
|   5. Keluar                    |
----------------------------------
Pilih 1,2,3,4 atau 5 : .User akan diminta untuk memilih antara 1/2/3/4/5. Jika user menginputkan 1, maka user diminta untuk memasukkan nama service, merk mobil yang akan diservice dan estimasi biaya service. Jika sudah, program akan memberi tahu bahwa daftar service berhasil ditambahkan. Selanjutnya jika user menginputkan 2 yaitu 'lihat daftar service', maka akan tertampil daftar service mobil yang telah dimasukkan/ditambahkan sebelumnya. Selanjutnya, jika user menginputkan 3, maka user diminta memasukkan nama service yang ingin diganti/diupdate. Setelah itu masukkan nama service yang baru, merk mobil dan harganya. Namun jika nama service yang ingin diganti tidak ada di daftar, maka akan tertampil bahwa Daftar Service Tidak Tersedia. Selanjutnya, jika user menginputkan 4, maka user diminta memasukkan nama service yang ingin dihapus. Misalnya ganti oli, setelah dimasukkan 'ganti oli' lalu dienter maka akan kembali ke menu admin. Dan jika ingin mengecek apakah sudah terhapus/terupdate/tertambah, cukup menginputkan pilihan kedua. Jika sudah terhapus dan tidak ada daftar service lagi, maka program menampilkan bahwa Daftar Service Tidak Tersedia.
