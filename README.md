
# Aplikasi Kalkulator Sederhana

Ini adalah aplikasi **kalkulator sederhana** yang diimplementasikan dengan Java. Aplikasi ini mendukung operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian. Aplikasi ini juga dilengkapi dengan validasi untuk memastikan input yang dimasukkan oleh pengguna valid (angka, dalam rentang yang benar, dll).

### Fitur:
- **Penjumlahan**: Menambahkan dua angka.
- **Pengurangan**: Mengurangi satu angka dari angka lainnya.
- **Perkalian**: Mengalikan dua angka.
- **Pembagian**: Membagi satu angka dengan angka lainnya (dengan penanganan kesalahan pembagian dengan nol).
- **Validasi**: Memastikan input yang dimasukkan valid untuk angka, operator, dan rentang angka.

### Teknologi:
- **Java**: Versi 8 atau lebih baru
- **JUnit 5**: Untuk pengujian unit

### Struktur Proyek:
```
└── 📁src
    └── 📁main
        └── 📁java
            └── 📁com
                └── 📁swt
                    ├── Computation.java
                    ├── MainApp.java
                    ├── 📁operation
                    │   ├── Addition.java
                    │   ├── Division.java
                    │   ├── Multiplication.java
                    │   └── Subtraction.java
                    ├── ResultPrinter.java
                    └── Validator.java
    └── 📁test
        └── 📁java
            └── 📁com
                └── 📁swt
                    └── AppTest.java
```

### Instalasi:

1. **Clone** repository ini:
   ```bash
   git clone https://github.com/username/kalkulator-sederhana.git
   ```

2. Pindah ke direktori proyek:
   ```bash
   cd kalkulator-sederhana
   ```

3. **Bangun proyek**:
   - Jika menggunakan Maven, jalankan perintah berikut untuk membangun dan mengemas aplikasi:
     ```bash
     mvn clean package
     ```

4. **Jalankan aplikasi**:
   - Setelah membangun proyek, jalankan aplikasi dengan perintah:
     ```bash
     java -jar target/kalkulator-sederhana-1.0-SNAPSHOT.jar
     ```

### Menjalankan Pengujian Unit:

Untuk memastikan aplikasi berjalan dengan benar, kami telah menulis pengujian unit untuk berbagai fitur (seperti operasi aritmatika dan validasi). Untuk menjalankan pengujian:

1. **Menggunakan Maven**:
   ```bash
   mvn test
   ```

2. Pengujian terdapat di direktori `src/test/java/com/swt`, dengan kelas pengujian utama yaitu `AppTest.java`.

### Logika Validasi:
Aplikasi memastikan validasi berikut sebelum melakukan perhitungan:
- **Pengecekan Numerik**: Memastikan bahwa operand adalah angka yang valid.
- **Pengecekan Rentang**: Memastikan bahwa operand berada dalam rentang yang valid antara `-32,768` hingga `32,767`.
- **Pengecekan Operator**: Memastikan operator yang digunakan adalah salah satu dari `+`, `-`, `*`, `/`.
- **Pengecekan Pembagi Nol**: Memastikan bahwa pembagian tidak terjadi jika pembaginya adalah nol.

### Contoh Penggunaan:
1. **Input**:
   - Operand 1: `5`
   - Operand 2: `3`
   - Operator: `+`

   **Output**:
   - `Hasil = 8.0`

2. **Input**:
   - Operand 1: `6`
   - Operand 2: `0`
   - Operator: `/`

   **Output**:
   - `Error: Pembagi tidak boleh nol.`
