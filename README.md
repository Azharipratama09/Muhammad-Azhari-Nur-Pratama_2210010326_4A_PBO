# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data laptop menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk dan model laptop, dan memberikan output berupa informasi detail dari model tersebut seperti seri,warna, dan tipe

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Laptop`, `LaptopDetail`, dan `LaptopBeraksi` adalah contoh dari class.

```bash
public class Laptop {
    ...
}

public class LaptopDetail extends Laptop {
    ...
}

public class LaptopBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `laptops[i] = new LaptopDetail(merk, model);` adalah contoh pembuatan object.

```bash
laptops[i] = new LaptopDetail(merk, model);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `model` adalah contoh atribut.

```bash
String merk;
String model;
    
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Laptop` dan `LaptopDetail`.

```bash
public Laptop(String merk, String model) {
        this.merk = merk;
        this.model = model;

}

    public LaptopDetail(String merk, String model) {
        super(merk, model);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` dan `setModel` adalah contoh method mutator.

```bash
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getModel`, `getSeri`, `getWarna`,  dan `getJenis` adalah contoh method accessor.

```bash
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `model` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String merk;
    private String model;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `LaptopDetail` mewarisi `Laptop` dengan sintaks `extends`.

```bash
public class LaptopDetail extends Laptop { {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Laptop` merupakan overloading method `displayInfo` dan `displayInfo` di `LaptopDetail` merupakan override dari method `displayInfo` di `Laptop`.

```bash
    public String displayInfo() {
        return "Merk: " + getMerk() +
               "\nModel: " + getModel();
    }
    
    // polymorphism overloading
    public String displayInfo(String spesifikasi) {
        return displayInfo() + "\nSpesifikasi: " + spesifikasi;
    }
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getSeri` dan seleksi `switch` dalam method `getWarna`.

```bash
    public String getSeri() {
        String kodeSeri = getModel().substring(0, 1);
        // seleksi if
        if (kodeSeri.equals("f")) {
            return "Seri baru";
        }if (kodeSeri.equals("x")) {
            return "Seri lama";
        } else {
            return "Seri Lain";
        }
    }
    
    public String getWarna() {
        String kodeWarna = getModel().substring(1,2 );
        // seleksi switch
        switch (kodeWarna) {
            case "1":
                return "Hitam";
            case "2":
                 return "Biru";
            default:
                return "Warna Lain";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < laptops.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan merk laptop " + (i + 1) + ": ");
String merk = scanner.nextLine();
System.out.println("Data Laptop: ");
 System.out.println(laptop.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `LaptopDetail[] laptops = new LaptopDetail[2];` adalah contoh penggunaan array.

```bash
LaptopDetail[] laptops = new LaptopDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format model: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Azhari Nur Pratama
NPM: 2210010326
