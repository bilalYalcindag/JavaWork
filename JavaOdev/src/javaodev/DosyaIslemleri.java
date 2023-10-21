/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaodev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author bllyl
 */
public class DosyaIslemleri {
    
    
    
    
    public File DosyaOlustur(String dosyaAdi) throws IOException{
        File file = new File(dosyaAdi);
        
        if(!file.exists()){
            file.createNewFile();
        }
        
        return file;
    }
    
    public void DosyaOku(File file) throws FileNotFoundException, IOException{
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        
    }
    
    public void DosyaYaz(File file, Araba araba) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        bufferedWriter.write(araba.marka + " " + araba.model + " " + araba.renk + " "
                             + araba.fiyat + " " + araba.uretimYili + "\n");
        bufferedWriter.close();
    
    }  
    
}
