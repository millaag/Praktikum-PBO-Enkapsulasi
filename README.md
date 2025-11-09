Praktikum PBO - Enkapsulasi

Tugas Pertemuan 6 - Pemrograman Berorientasi Objek (PBO)
Topik utama: Encapsulation (Enkapsulasi) — menyembunyikan data agar hanya bisa diakses melalui method yang terkontrol.

Tujuan

Memahami konsep enkapsulasi dalam OOP.
Melatih penggunaan access modifier (private, public).
Mencegah manipulasi langsung terhadap data objek.
Mempelajari immutable object sebagai bentuk enkapsulasi tingkat lanjut.

Struktur Program
```
Praktikum-PBO-Enkapsulasi/
│
├── Student1.java & MainStudent1.java
├── Student2.java & MainStudent2.java
├── Team.java & MainTeam
└── ImmutableStudent.java & MainImmutableStudent
```
Penjelasan Tiap Latihan
1. Student1
Konsep: getter & setter dengan validasi nilai.
Output:
Milla memiliki nilai 85
Setelah diperbarui: 95
Error: Score harus antara 0 sampai 100

2. Student2
Konsep: kontrol perubahan nilai lewat method domain.
Output:
Milla memiliki nilai 80
Setelah ditambah: 90
Setelah dikurangi: 75

3. Team
Konsep: enkapsulasi koleksi (list).
Output:
Daftar anggota tim:
Milla
Ica
Tapasya

4. ImmutableStudent
Konsep: objek immutable (tidak bisa diubah).
Output:
Nama: Milla, Nilai: 80
Nama: Agustin, Nilai: 95

Cara Menjalankan Program
javac Student1.java && java Student1
javac Student2.java && java Student2
javac Team.java && java Team
javac ImmutableStudent.java && java ImmutableStudent

Nama : Milla Agustin
NIM  : L0324020
Pertemuan: 6 - Enkapsulasi
Mata Kuliah: Pemrograman Berorientasi Objek
