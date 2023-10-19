/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopders;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class OopDers {

    public static void main(String[] args) throws IOException {

       
        DegerYaz(CreateFile("araba.txt"));

    }

    public static File CreateFile(String fileName) throws IOException {

        File file = new File(fileName);

        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void DegerYaz(File file) throws IOException {
        int cikisDeger = 1;
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        while (cikisDeger != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Araba markasını girin: ");
            String marka = scan.nextLine();
            System.out.println("Araba modelini girin: ");
            String model = scan.nextLine();
            System.out.println("Araba uretim yilini girin: ");
            int uretimYili = scan.nextInt();
            System.out.println("Araba fiyatini girin: ");
            int fiyat = scan.nextInt();

            System.out.println("cikis icin 0 a basin devam icin baska sayi kullanin ");
            cikisDeger = scan.nextInt();

            bufferedWriter.write(marka + " " + model + " " + " " + uretimYili + " " + fiyat);

        }
        bufferedWriter.close();

    }

}
