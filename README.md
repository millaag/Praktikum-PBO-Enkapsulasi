Praktikum PBO - Enkapsulasi

Tugas Pertemuan 6 - Pemrograman Berorientasi Objek (PBO)
Topik utama: Encapsulation (Enkapsulasi) - menyembunyikan data agar hanya bisa diakses melalui method yang terkontrol.

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
## Penjelasan Tiap Latihan

### Student1  
**Konsep utama:** *getter & setter dengan validasi nilai (basic encapsulation)*  

**Penjelasan:**
- Field `name` dan `score` bersifat `private`, artinya tidak bisa diakses langsung dari luar kelas.  
- Akses data dilakukan lewat **getter** dan **setter**, bukan langsung ke field.  
- Pada method `setScore(int score)`, terdapat **validasi** agar nilai hanya antara **0 sampai 100**.  
  Jika nilai di luar batas, program melempar **IllegalArgumentException** untuk mencegah data tidak valid.  
- Konsep ini menjaga agar objek `Student` selalu berada dalam keadaan yang benar (valid state).

**Tujuan:**  
Menunjukkan bagaimana *enkapsulasi* mencegah manipulasi langsung dan menjaga integritas data objek.  

**Output Program:**
Milla memiliki nilai 85
Setelah diperbarui: 95
Error: Score harus antara 0 sampai 100

---

### Student2  
**Konsep utama:** *enkapsulasi dengan perilaku terkontrol (no setter)*  

**Penjelasan:**
- Di versi ini, method `setScore()` dihapus agar nilai `score` **tidak bisa diubah langsung**.  
- Sebagai gantinya, digunakan dua method baru:
  - `addScore(int delta)` → menambah nilai.
  - `reduceScore(int delta)` → mengurangi nilai.  
- Kedua method tersebut memeriksa apakah nilai akhir tetap berada di antara **0 dan 100**.  
- Dengan cara ini, kita memaksa perubahan nilai terjadi lewat perilaku yang jelas (menambah atau mengurangi), bukan lewat manipulasi bebas.

**Keunggulan:**  
Lebih aman dan menggambarkan perilaku dunia nyata — perubahan skor dilakukan lewat aksi yang masuk akal, bukan penetapan langsung.  

**Output Program:**
Milla memiliki score 70
Setelah addScore(20): 90
Error: Score tidak boleh lebih dari 100
Setelah reduceScore(30): 60

---

### Team  
**Konsep utama:** *enkapsulasi koleksi (collection encapsulation)*  

**Penjelasan:**
- Class `Team` menyimpan daftar anggota (`List<Student> members`) sebagai **private field**.  
- Method `addMember(Student s)` digunakan untuk menambah anggota baru ke dalam tim.  
- Method `getMembers()` mengembalikan **salinan list (copy)**, bukan referensi langsung.  
  Ini mencegah pihak luar mengubah daftar anggota asli di dalam objek `Team`.  

**Tujuan:**  
Melindungi data koleksi agar tidak bisa dimanipulasi langsung dari luar objek.  
Ini adalah bentuk lanjutan dari enkapsulasi yang menjaga *integritas koleksi data*.

**Output Program:**
Daftar anggota tim:
- Milla (85)
- Agustin (90)
Setelah clear copy, anggota asli:
- Milla (85)
- Agustin (90)

---

### ImmutableStudent  
**Konsep utama:** *enkapsulasi tingkat lanjut (immutable object)*  

**Penjelasan:**
- Class `ImmutableStudent` diberi modifier `final` agar **tidak bisa diwarisi**.  
- Field `name` dan `score` juga diberi `final` supaya **tidak bisa diubah** setelah objek dibuat.  
- Tidak ada `setter` di class ini.  
- Method `withAddedScore(int delta)` digunakan untuk menghasilkan **objek baru** dengan nilai baru — bukan mengubah objek lama.  

**Keunggulan:**
- Objek bersifat **immutable (tidak bisa berubah)**, sehingga aman digunakan di banyak tempat tanpa takut datanya berubah diam-diam.  
- Cocok untuk sistem yang butuh kestabilan atau multi-threading.

**Output Program:**
s1: Milla = 80
s2: Milla = 90
Error: Score hasil perubahan tidak valid

---

## Kesimpulan 
Keempat latihan ini menunjukkan tahapan evolusi **enkapsulasi**:
1. **Student1** → dasar: menyembunyikan field dengan getter/setter.  
2. **Student2** → kontrol lebih kuat dengan method perilaku.  
3. **Team** → melindungi koleksi agar tak bisa diubah dari luar.  
4. **ImmutableStudent** → objek sepenuhnya aman (tidak bisa diubah).  

Dengan cara ini, kamu bisa menjaga agar **objek selalu dalam keadaan valid, aman, dan mudah di-maintain.**

Cara Menjalankan Program
javac Student1.java && java Student1
javac Student2.java && java Student2
javac Team.java && java Team
javac ImmutableStudent.java && java ImmutableStudent

Nama : Milla Agustin
NIM  : L0324020
Pertemuan: 6 - Enkapsulasi
Mata Kuliah: Pemrograman Berorientasi Objek
