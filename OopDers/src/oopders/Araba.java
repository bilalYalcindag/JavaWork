/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Araba {
    
    public String marka,model,renk; 
    public int uretimYili,fiyat;

    public Araba(String marka,String model,String renk,int uretimYili,int fiyat) {
      this.fiyat = fiyat;
      this.marka = marka;
      this.model = model;
      this.renk = renk;
      this.uretimYili = uretimYili;
  
    }
    
    public void ArabaUnique(){
        String uniqueDeger =renk.charAt(0) + marka ;
        System.out.println(uniqueDeger);
    }
    
    public static void DegerYaz(File file) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Araba markasını girin: ");
        String marka = scan.nextLine();
        System.out.println("Araba modelini girin: ");
        String model = scan.nextLine();
        System.out.println("Araba uretim yilini girin: ");
        int uretimYili = scan.nextInt();
        System.out.println("Araba fiyatini girin: ");
        int fiyat = scan.nextInt();
        
     FileWriter fileWriter = new FileWriter(file);
     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
     bufferedWriter.write(marka + " " + model+ " " + " " +  uretimYili +" " + fiyat);
     
     bufferedWriter.close();
        
    }
    
    public void CreateFile(String fileName) throws IOException{
        
        File file = new File(fileName);
        
        if(!file.exists()){
            file.createNewFile();
        }
    } 
    
    
}
