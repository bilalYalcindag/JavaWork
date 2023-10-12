/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadosyaıslemleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author acer
 */
public class JavaDosyaIslemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("kod.txt");
        
        if(!file.exists()){
            file.createNewFile();
        }
        
        String word = "Dosya yazma denemesi" ; 
        
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(word);
        bufferedWriter.close();
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String line;
        
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line); 
            }
        bufferedReader.close();
        
    }
    
}
