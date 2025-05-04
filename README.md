# Kalkulator Sederhana

Proyek **kalkulator‐simple** ini ditulis dengan Java 17 dan dibangun menggunakan **Apache Maven**.  Fungsinya mencakup empat operasi aritmetika dasar lengkap dengan validasi input dan rangkaian *unit‑test* otomatis berbasis **TestNG** serta laporan eksekusi **Allure**.

---

## ✨ Fitur

| Kategori  | Detail                                                                                    |
| --------- | ----------------------------------------------------------------------------------------- |
| Operasi   | Penjumlahan `+`, Pengurangan `−`, Perkalian `*`, Pembagian `/` (dengan proteksi bagi‐nol) |
| Validasi  | • Operand numerik • Rentang −32 768 … 32 767 • Operator legal • Divisor ≠ 0               |
| Otomasi   | Build & test sekali klik via Maven `mvn verify`                                           |
| Pelaporan | Allure HTML report *out‑of‑the‑box* (100 % pass 🎉)                                       |

---

## 🛠️ Teknologi & Dependensi

| Tool           | Versi    | Peran                    |
| -------------- | -------- | ------------------------ |
| Java           | **17**   | Bahasa & runtime         |
| Maven          | 3.x      | Build automation         |
| TestNG         | 7.11     | Framework unit‑test      |
| Allure‑TestNG  | 2.29     | Integrasi laporan        |
| Maven Surefire | 3.0.0‑M5 | Menjalankan TestNG suite |

Semua dideklarasikan di [`pom.xml`](./pom.xml) — lihat blok `<dependencies>` dan `<plugins>`.

---

## 📂 Struktur Proyek

```text
src/
├─ main/java/com/swt/
│  ├─ Computation.java        # delegasi operator → Operation
│  ├─ MainApp.java            # CLI
│  ├─ Operation.java          # + − * /
│  ├─ ResultPrinter.java      # cetak hasil/error
│  └─ Validator.java          # seluruh rule validasi
└─ test/java/com/swt/
   ├─ OperationTest.java      # + − * /
   ├─ ValidatorTest.java      # checkNumeric, checkRange, …
   ├─ ResultPrinterTest.java  # verifikasi stdout
   ├─ AppTest.java            # integrasi end‑to‑end
   └─ ComputationTest.java    # (opsional) wrapper
```

Tambahan konfigurasi TestNG berada di `src/test/resources/testng.xml`.

---

## 🧑‍💻 Cara Menjalankan

1. **Clone**

   ```bash
   git clone https://github.com/username/kalkulator-simple.git
   cd kalkulator-simple
   ```
2. **Build & test + generate report**

   ```bash
   mvn clean verify      # compile, unit‑test, Allure result & HTML
   ```
3. **Jalankan aplikasi**

   ```bash
   java -jar target/kalkulator-1.0.jar
   ```

---

## 📊 Melihat Laporan Allure

```bash
# opsi 1 – serve otomatis
mvn allure:serve          # buka http://localhost:4040

# opsi 2 – HTML statik
echo "file://$(pwd)/target/site/allure-maven-plugin/index.html"
```

*Overview* menampilkan total 54 test dengan status 100 % pass, grafik status, timeline, dan daftar suite `CalculatorUnitTests`.

---

## 📝 Validasi Input

| Rule     | Metode          | Pesan error                                |
| -------- | --------------- | ------------------------------------------ |
| Numerik  | `checkNumeric`  | `Input bukan angka.`                       |
| Rentang  | `checkRange`    | `Angka di luar rentang -32768 s.d. 32767.` |
| Operator | `checkOperator` | `Operator tidak valid.`                    |
| Bagi‑nol | `checkDivisor`  | `Pembagi tidak boleh nol.`                 |

---

## ▶️ Contoh Interaksi

```text
Operand pertama : 15
Operand kedua   : 3
Operator (+ - * /) : /
Hasil = 5.0
```

```text
Operand pertama : 7
Operand kedua   : 0
Operator (+ - * /) : /
Error: Pembagi tidak boleh nol.
```

---
