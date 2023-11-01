/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.riko.tugas_praktek_pertama;

import java.util.Scanner;
public class Tugas_praktek_pertama {

    public static void main(String[] args) {
        double Nilai1, Nilai2, hasil;
        //String nama;
        boolean nilai,selesai = false;
        Scanner UserInput = new Scanner (System.in);
        
        System.out.println("Operator Penugasan ");
        System.out.println("=================================================");
        System.out.println("1. +=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 += Nilai2));
        System.out.println("2. -=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 -= Nilai2));
        System.out.println("3. *=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 *= Nilai2));
        System.out.println("4. /=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 /= Nilai2));
        System.out.println("5. %=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 %= Nilai2));
        
        
        System.out.println("Operator Pembanding");
        System.out.println("=================================================");        
        System.out.println("1. >");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 > Nilai2));
        System.out.println("2. <");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 < Nilai2));
        System.out.println("3. ==");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 == Nilai2));
        System.out.println("4. !=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 != Nilai2));
        System.out.println("5. >=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 >= Nilai2));
        System.out.println("6. <=");
        System.out.print("Masukkan Angka Pertama : ");
        Nilai1 = UserInput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        Nilai2 = UserInput.nextDouble();
        System.out.println("Hasilnya adalah :" + (Nilai1 <= Nilai2));
        
        
        System.out.println("Operator Bitwise");
        System.out.println("=================================================");
        int nilai1,nilai2;
        System.out.println("1. &");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + (nilai1 & nilai2));
        System.out.println("2. |");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + (nilai1 | nilai2));
        System.out.println("3. ^");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + (nilai1 ^ nilai2));
        System.out.println("4. ~");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + "Negasi angka pertama =>" + " " + (~nilai1) + ","  + "Negasi Angka Kedua" + " " + (~nilai2));
        System.out.println("5. >> dan <<");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (nilai1 >> 1) + "," + "Angka Kedua =>" + " " + (nilai2 << 1));
        System.out.println("6. >>>> dan <<<<");
        System.out.print("Masukkan Angka Pertama : ");
        nilai1 = UserInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        nilai2 = UserInput.nextInt();
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (nilai1 >>> 1) + "," + "Angka Kedua =>" + " " + (nilai2 >>>1));
    }
}
