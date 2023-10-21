/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaodev;

import java.io.File;
import java.io.IOException;

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
        
       File file =   dosyaIslemleri.DosyaOlustur("araba.txt");
        dosyaIslemleri.DosyaYaz(file, araba);
        dosyaIslemleri.DosyaOku(file);
    
    
    }
    
}
