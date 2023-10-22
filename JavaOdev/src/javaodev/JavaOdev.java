/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaodev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bllyl
 */
public class JavaOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DosyaIslemleri dosyaIslemleri = new DosyaIslemleri();
        Araba araba = new Araba("TOGG", "T10x", "Kırmızı", 2023, 1000000);
        Araba araba2 = new Araba("Mercedes","AMG","Gri", 2020, 5000000);
        Araba araba3 = new Araba("BMW","X5","Siyah", 2015, 350000);
        
       File file =   dosyaIslemleri.DosyaOlustur("araba.txt");
        dosyaIslemleri.DosyaYaz(file, araba);
        dosyaIslemleri.DosyaYaz(file, araba2);
        dosyaIslemleri.DosyaYaz(file, araba3);
        dosyaIslemleri.DosyaOku(file);
        System.out.println(Parse("araba.txt"));
        
       
    
    }
    
    public static int Parse(String fileName) {
        int latestYear = -1;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                // Satırı boşluğa göre böler
                String[] parts = line.split(" ");
                if (parts.length == 5) {
                    try {
                        int uretimYili = Integer.parseInt(parts[4]);
                        if (uretimYili > latestYear) {
                            latestYear = uretimYili;
                        }
                    } catch (NumberFormatException e) {
                        // Üretim yılı sayıya dönüştürülemezse bu satırı geçer.
                        continue;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return latestYear;
    }
    
}
