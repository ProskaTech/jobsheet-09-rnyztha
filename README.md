Create By:
Nama: Ranny Erzitha
NIM: 21343013

  OOP berputar pada konsep dari object sebagai dasar element dari program anda.
Ketika kita membandingkan dengan dunia nyata, kita dapat menemukan beberapa objek
disekitar kita,seperti mobil,singa, manusia dan seterusnya. Object ini di karakterisasi oleh sifat / attributnya dan tingkah lakunya.
  Contohnya, objek sebuah mobil mempunyai sifat tipe transmisi, warna dan
manufaktur, dimana ini bisa kita sebut sebagai Properti/Atribut. Mempunyai kelakuan berbelok, mengerem dan berakselerasi,Kelakuan ini bisa kita sebut sebagai Behavior/Method. 

1. Latihan 1: Pass By Value
* ![image](https://user-images.githubusercontent.com/110460970/197911059-24ac901e-03ac-4802-a86d-513485300124.png)
- Pass By Value dan Pass By Reference merupakan metode dalam mengirimkan parameter ke dalam sebuah fungsi, dimana didalam java disebut Behavior/Method . Pass By Value melewatkan parameter berdasarkan nilainya.
- Disini nilai parameter aktual akan dilewatkan pada saat pemanggilan method akan disalin ke parameter formal sehingga perubahan nilai pada method, tidak akan berpengaruh terhadap argument yang digunakan untuk memanggil method tersebut. Dengan kata lain, perubahan nilai tersebut hanya akan dikenali pada method yang bersangkutan saja.

2. Latihan 2 : Pass By Reference
* ![image](https://user-images.githubusercontent.com/110460970/197912196-65b6c60e-0280-4a7c-a501-7d701e37934d.png)
- Pass By Reference melewatkan parameter berdasarkan referensinya. Pada cara ini , referensi dari argumen (bukan nilai argumen) akan dilewatkan kedalam parameter formal, bukan disalin.
- Dengan demikian, nilai yang digunakan di dalam method akan sama dengan nilai yang di tunjuk referensi. 
- Melalui cara ini setiap perubahan nilai yang terjadi pada method juga akan berpengaruh terhadap argumen yang digunakan untuk memanggilnya.

3. Perbandingan Object
* ![image](https://user-images.githubusercontent.com/110460970/197912406-4d755c5b-6eea-404d-bfcf-0ef8c8b014ea.png)
- Metode equals() membandingkan dua String berdasarkan kontennya. Sehingga, apabila dua buah String memiliki huruf-huruf yang sama, diurutan yang sama dan besar-kecil yang sama maka dua String ini akan dianggap sama.
- Pada Latihan ini,kita membandingkan 2 buah String yaitu, str1 dan str2 dengan simbol "==".

4. Latihan 4 : Pemanggilan Method Menggunakan Parameter
* ![image](https://user-images.githubusercontent.com/110460970/197913143-bc836ac1-f123-4d6b-bc9c-0faf5f5bbc8e.png)
* ![image](https://user-images.githubusercontent.com/110460970/197913177-8944d94c-6ae1-4b7e-be6c-f4ca238e31fc.png)
* Dilanjutkan dengan membuat class baru untuk melanjutkan class diatas.
* ![image](https://user-images.githubusercontent.com/110460970/197913334-0a41270d-0220-414c-ba8d-eec126b42865.png)
- class baru hanya dapat mengakses kelas induk,jika class induk tidak private
