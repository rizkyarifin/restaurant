# TODO LIST UNTUK ANGGOTA 5
## Program Utama & Implementasi Method Push/Pop

### TUGAS SESUAI SOAL:
Melengkapi implementasi Single Linked List dan membuat program demo sistem antrian restoran.

### CHECKLIST TUGAS:

#### 1. Implementasi Method Push dan Pop di SingleLinkedList
- [ ] Tambah method push() untuk menambah pelanggan ke akhir antrian
- [ ] Tambah method pop() untuk melayani pelanggan dari depan antrian
- [ ] Tambah method display() untuk tampilan antrian yang rapi
- [ ] Handle edge cases (antrian kosong, dll)

#### 2. Edit Main.java  
- [ ] Buat program demo yang menunjukkan operasi push dan pop
- [ ] Tampilkan antrian setelah setiap operasi
- [ ] Demonstrasi FIFO (First In First Out)

#### 3. Testing & Demo
- [ ] Tambah 3-4 pelanggan ke antrian (push)
- [ ] Layani 2 pelanggan (pop)  
- [ ] Pastikan antrian ditampilkan setelah setiap operasi

### EXPECTED OUTPUT SEDERHANA:
```
=== DEMO ANTRIAN RESTORAN ===

Menambah pelanggan Budi...
Pelanggan Budi berhasil ditambahkan ke antrian!

=== ANTRIAN SAAT INI ===
Posisi 1: Customer{Nama='Budi', No.Antrian=1, Waktu=10:30:45}
================================

Menambah pelanggan Sari...
Pelanggan Sari berhasil ditambahkan ke antrian!

=== ANTRIAN SAAT INI ===
Posisi 1: Customer{Nama='Budi', No.Antrian=1, Waktu=10:30:45}
Posisi 2: Customer{Nama='Sari', No.Antrian=2, Waktu=10:31:12}
================================

Melayani pelanggan...
Pelanggan Budi (No. 1) sedang dilayani!

=== ANTRIAN SAAT INI ===
Posisi 1: Customer{Nama='Sari', No.Antrian=2, Waktu=10:31:12}
================================
```

### CATATAN:
- Semua komponen sudah siap (Node, Customer, SingleLinkedList dengan push/pop)  
- Fokus hanya pada demo sederhana sesuai requirement soal
- Tidak perlu menu interaktif atau fitur kompleks