# TEMPLATE PROMPT v2: IMPLEMENTASI DESAIN HIGH-FIDELITY / UI REFINEMENT

*Petunjuk Penggunaan: Salin seluruh teks di bawah ini, sesuaikan bagian di dalam tanda kurung siku `[...]`, lalu berikan ke AI Anda untuk diubah menjadi kode pemrograman.*

---

Halo AI, saya memiliki referensi layout UI baru (High-Fidelity/Mockup) untuk **Halaman Detail / Profil** aplikasi saya. Tolong buatkan [Kode Flutter / Kode Kotlin / CSS Web] yang bersih, modern, dan responsif menggunakan komponen-komponen berikut:

## 1. Panduan Desain & Estetika (Style)
* **Tema/Gaya:** *Glassmorphism* modern dengan efek bayangan halus (soft shadow) dan sudut melengkung yang tumpul (rounded corners / border-radius besar).
* **Latar Belakang (Background):** Gradasi halus (Linear Gradient) dengan nuansa warna biru keabu-abuan / slate tebal modern.
* **Tipografi:** Gunakan font **Poppins** atau **Helvetica** dengan style serif/slab yang tegas untuk label teks utama agar terlihat estetik.

---

## 2. Struktur Komponen & Tata Letak

### A. Bagian Atas (Header Bar)
* **Foto Profil Kecil:** Berbentuk lingkaran di pojok kiri atas.
* **Nama User Card:** Label persegi panjang melengkung berwarna putih dengan teks nama pengguna (`nama user`).
* **Menu Tombol:** Ikon *Hamburger Menu* (tiga garis horizontal) di pojok kanan atas.

### B. Baris Tombol Kontrol (Control Buttons)
* Letakkan dua tombol sejajar secara horizontal di bawah Header:
  1. **Tombol Back:** Berwarna putih/terang dengan teks `"back"`.
  2. **Tombol Done:** Berwarna biru kontras dengan teks `"done"` berwarna putih.

### C. Kartu Biodata (Biodata Card)
* Sebuah kontainer/card besar berwarna putih semi-transparan (*glassmorphic style*).
* Di dalamnya terdapat label utama bertuliskan `"biodata"` serta komponen *Dropdown Menu* (dengan tanda panah ke bawah) untuk memilih atau menampilkan informasi detail.

### D. Baris Widget Media & Kontak (Quick Links)
* Baris horizontal berisi 3 elemen utama yang posisinya berdekatan:
  1. **Widget Jam:** Kontainer elips/persegi melengkung besar dengan teks kontras tinggi `"jam"`.
  2. **Tombol IG:** Lingkaran kecil dengan teks/ikon `"ig"`.
  3. **Tombol TikTok:** Lingkaran dengan efek *neon glow* biru melingkar di sekelilingnya, bertuliskan `"tiktok"`.

### E. Lembar Bawah / Bagian Utilitas (Utility Bottom Sheet / Modal)
* Bagian bawah layar berupa sebuah komponen *Modal / Card Utilitas* terpisah yang bertuliskan `"Modal"` di bagian atasnya.
* **Isi Konten:** Area dinamis bertuliskan `"utility, bisa riwayat atau bebas"`.
* **Daftar Menu:** Di bawahnya terdapat daftar pilihan bertingkat (*accordion / dropdown list*) seperti menu "Lingkungan", "Latihan", atau teks serupa dengan ikon kecil di sisi kiri dan panah dropdown di sisi kanan.

---

## 3. Output yang Diharapkan
* Berikan kode yang terstruktur rapi dengan pemisahan widget/komponen yang jelas.
* Pastikan efek melengkung (*border-radius*), bayangan (*box-shadow*), dan susunan *padding*-nya mirip dengan gambar referensi agar terlihat sangat modern.

Silakan buatkan kodenya sekarang!
