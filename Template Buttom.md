# UI Kit Documentation: Neo-Tactile Design System

Dokumentasi ini merangkum komponen-komponen utama yang terdapat dalam desain interface **Neo-Tactile**, sebuah gaya desain modern yang menggabungkan estetika *glassmorphism* (efek kaca transparan) dengan *neumorphism* (kedalaman bayangan yang lembut/taktil).

---

## 1. Header & Identitas Utama
* **Komponen:** Header Aplikasi
* **Elemen:** * Avatar Pengguna (ikon lingkaran di sebelah kiri)
  * Judul Halaman / Nama Brand (`UI Kit`)
  * Menu Hamburger (ikon tiga garis di sebelah kanan untuk navigasi)
* **Karakteristik:** Terletak di bagian paling atas *glass panel*, memberikan penanda navigasi global yang bersih.

---

## 2. Dropdown & Selektor Input
* **Komponen:** Input Card / Dropdown Menu
* **Elemen:**
  * Field Utama (`Colded`) dengan ikon *arrow down* di kanan.
  * Sub-field / State Seleksi (`Select/lad`) di dalam kontainer yang sama.
* **Karakteristik:** Menggunakan sudut membulat (*large border-radius*) dengan warna latar belakang putih solid yang kontras di atas panel transparan, menciptakan hierarki visual yang jelas untuk area interaktif.

---

## 3. Segmented Control / Tab Navigasi
* **Komponen:** Horizontal Button Group
* **Elemen:**
  * Tombol navigasi/pilihan berbentuk sirkular dan pil di dalam kontainer gelap (*dark mode accent*).
  * Terdiri dari ikon kontrol media atau fungsional (`=`, `·|`, `≡`).
* **Karakteristik:** Memberikan alternatif interaksi cepat dengan kontras gelap yang memecah dominasi warna putih/terang pada komponen lainnya.

---

## 4. Status Progress / Indikator Loading
* **Komponen:** Circular Progress Indicator
* **Elemen:**
  * Cincin pemuat berwarna biru neon terang (*active/loading state*).
  * Ikon atau grafik status di bagian tengah lingkaran.
* **Karakteristik:** Efek *glow* (berpendar) biru memberikan umpan balik visual yang kuat kepada pengguna bahwa suatu proses sedang berjalan atau sedang aktif.

---

## 5. Komponen Modal / List Item View
* **Komponen:** Modal Card Pop-up
* **Elemen:**
  * Header Modal dengan teks `Modal` dan tombol *more options* (`...`).
  * List Item internal (`Nectee`, `Lrogren`, `Lac lten`) yang masing-masing dilengkapi dengan ikon di kiri dan panah drop-down di kanan.
* **Karakteristik:** Menggunakan sudut melengkung yang serasi dengan komponen atas, berfungsi untuk mengelompokkan informasi atau pengaturan yang lebih kompleks secara terstruktur.

---

## Spesifikasi Gaya Global (Style Guide)

### Efek Visual & Bayangan
* **Latar Belakang Panel:** Efek kaca buram (*frosted glass*) dengan *blur* tinggi dan garis tepi (*border*) tipis berwarna putih semi-transparan.
* **Pencahayaan:** Menggunakan teknik *inner shadow* dan *drop shadow* yang lembut untuk menciptakan efek timbul (taktil) seolah-olah tombol dapat ditekan secara fisik.

### Palet Warna Utama
* **Primary Blue:** `#3B82F6` (Digunakan untuk *active state*, slider, dan indikator loading)
* **Base White:** `#FFFFFF` (Untuk komponen utama/card)
* **Dark Accent:** `#1E293B` (Untuk komponen segmented control)
* **Background:** Gradasi gelap dengan pencahayaan lembut (*ambient light*) berwarna biru di sudut bawah.