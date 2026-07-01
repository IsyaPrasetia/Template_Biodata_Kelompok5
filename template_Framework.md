# TEMPLATE PROMPT: IMPLEMENTASI WIREFRAME KE [FLUTTER/KOTLIN/FIGMA]

*Petunjuk Penggunaan: Salin seluruh teks di bawah ini, isi bagian dalam tanda kurung siku `[...]`, lalu berikan ke AI pilihan Anda (seperti Claude, ChatGPT, atau Gemini).*

---

Halo AI, saya memiliki sketsa wireframe aplikasi mobile yang terdiri dari 4 halaman utama: **Halaman 1 (Menu Utama)** dan **Halaman 2, 3, 4 (Detail Profil Developer)** yang menggunakan layout seragam. 

Tolong buatkan [Kode Flutter / Kode Kotlin / Desain UI Figma] berdasarkan spesifikasi struktur dan arsitektur komponen di bawah ini:

## 1. Panduan Desain & Style Global
* **Warna Utama (Primary):** `[Contoh: #2A4365 - Biru Gelap]`
* **Warna Aksen (Accent):** `[Contoh: #ED8936 - Oranye]`
* **Warna Latar Belakang:** `[Contoh: #FAFAFA - Off-white]`
* **Tipografi:** Gunakan font **Poppins** atau **Helvetica** agar terlihat bersih dan profesional.
* **Padding/Spacing:** Jaga jarak antar komponen minimal `16dp/16px` agar tidak terlalu padat.

---

## 2. Struktur Halaman & Komponen

### Halaman 1: Menu Utama / Dashboard
Halaman ini adalah pintu masuk aplikasi. Komponen disusun secara vertikal:
1. **Logo Kelas (L1):** Berbentuk lingkaran, letakkan di bagian paling atas tengah.
2. **Informasi Tugas (K1):** Sebuah kartu (Card) dengan background soft kontras, berisi teks keterangan tugas kelompok/kelas.
3. **Menu Navigasi Developer (B1, B2, B3):** * Tiga buah tombol panjang yang disusun vertikal ke bawah.
   * Setiap tombol memiliki teks: `"Lihat Profil Developer 1"`, `"Lihat Profil Developer 2"`, dan `"Lihat Profil Developer 3"`.
   * **Fungsi:** Jika ditekan, masing-masing tombol akan mengarahkan pengguna ke halaman detail profil yang sesuai (Halaman 2, 3, atau 4).
4. **Tombol Keluar (Exit):** Tombol berbentuk oval di bagian bawah untuk menutup aplikasi.

### Halaman 2, 3, & 4: Detail Profil Developer (Template Seragam)
Halaman ini menampilkan detail dari masing-masing developer dengan susunan layout sebagai berikut:
1. **Foto Profil (L2):** Berbentuk lingkaran besar di bagian atas.
2. **Nama Pengguna (Username):** Teks tebal (Bold) diletakkan tepat di bawah foto profil.
3. **Biodata (Kotak):** Sebuah kontainer persegi panjang berisi teks deskripsi diri/informasi detail developer.
4. **Grid/Baris Tombol Sosial Media & Kontak:**
   * **Instagram:** Tombol horizontal panjang dengan ikon Instagram.
   * **Website:** Tombol horizontal panjang dengan ikon Web/Link.
   * **Email & GitHub:** Dua tombol berukuran lebih kecil yang diletakkan berdampingan secara horizontal (Row) di bawah tombol website. Berikan jarak (*padding*) yang cukup agar tidak mudah salah tekan.
5. **Tombol Kembali (Back):** Berada di bagian pojok kiri atas (sebagai AppBar Back Button) atau tombol di bagian paling bawah untuk kembali ke Halaman 1.

---

## 3. Output yang Saya Harapkan
* **Jika meminta Kode (Flutter/Kotlin):** * Berikan kode yang terstruktur dengan baik dan bersih.
  * Pisahkan file halaman utama dan halaman detail developer (reusable widget/class untuk detail profil).
  * Lengkapi dengan state navigation sederhana (Navigator/Intent).
* **Jika meminta Desain (Figma/CSS):**
  * Berikan struktur layouting, kode CSS, atau petunjuk pembuatan komponen auto-layout di Figma.

Silakan buatkan langkah pertama untuk komponen ini!
