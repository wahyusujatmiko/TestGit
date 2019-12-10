### Contoh Program Integrasi Netbeans, Postgresql dan iReport.
Sistem program integrasi antara display, database dan jasperreport. Display yang dibuat pada netbeans hanya terdiri dari sebuah button/tombol. Tombol tersebut ketika ditekan akan menampilkan data dari database menggunakan jasperreport yang sudah terinstal.
### Langkah-langkah pengerjaan
#### 1. Instalasi Netbeans
- Netbeans yang digunakan adalah versi netbeans 8.0.2, dapat didownload pada link berikut: https://netbeans.org/downloads/8.0.2/.
#### 2. Instalasi Postgresql
- Postgresql yang digunakan adalah versi postgresql 9.1 (pgAdminIII), dapat didownload pada link berikut: https://www.filehorse.com/download-postgresql-64/10969/.
- Cara install, create dan buat tabel database menggunakan postgresql bisa dilihat dilink berikut: https://www.youtube.com/watch?v=BWte1HQccy8.
#### 3. Instalasi iReport Plugin
- IReport yang digunakan adalah versi iReport 5.0, dapat didownload dilink berikut: http://plugins.netbeans.org/plugin/4425/ireport atau https://gilacoding.com/read/cara-membuat-dan-contoh-sederhana-laporan-dengan-ireport-java-netbeans.
- Cara instalasi iReport juga ada dalam link diatas.
#### 4. Buat tampilan sederhana menggunakan netbeans
- Tampilan yang dibuat hanya sebuah tombol yang digunakan untuk menampilkan data database melalui jasperreport.
#### 5. Buat database pada postgresql 
- Buat data database db_belajar dan tabel tb_sembako. Caranya bisa lihat link dinomor 2.
- Buat kolom id, nama_barang, stok dan harga.
#### 6. Add beberapa library yang dibutuhkan untuk menjalankan ireport
- Add PostgreSQL JDBC driver. Caranya bisa dilihat di link nomor 3. Postgresql JDBC driver ini digunakan untuk koneksi tampilan netbeans dengan database postgresql.
- Download dan add library commons-beanutils-1.8.2.jar. Download librarynya ada di link berikut: http://www.java2s.com/Code/Jar/c/Downloadcommonsbeanutils182jar.htm atau bisa pakai dari link nomor 3.
- Download dan add library commons-collections4-4.4.jar. Download librarynya ada di link berikut: https://commons.apache.org/proper/commons-collections/download_collections.cgi.
- Download dan add library commons-digester-2.1.jar. Download librarynya ada di link berikut: http://www.java2s.com/Code/Jar/c/Downloadcommonsdigester21jar.htm atau bisa pakai dari link nomor 3.
- Download dan add library commons-javaflow-20060411.jar. Download librarynya ada di link berikut: http://www.docjar.com/jar_detail/commons-javaflow-20060411.jar.html.
- Download dan add library commons-logging-1.1.jar. Download librarynya ada di link berikut: http://www.java2s.com/Code/Jar/c/Downloadcommonslogging112jar.htm.
- Download dan add library groovy-all-2.0.8.jar. Download librarynya ada di link berikut: http://www.java2s.com/Code/Jar/g/Downloadgroovyall208jar.htm.
- Download dan add library jasperreports-6.10.0.jar. Download librarynya ada di link berikut: https://sourceforge.net/projects/jasperreports/files/jasperreports/JasperReports%206.10.0/.
- JDK yang digunakan adalah JDK 8.
- Download dan add library rs2xml.jar di https://hacksmile.com/rs2xml-jar-free-download/.
