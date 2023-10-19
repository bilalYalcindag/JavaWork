/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author acer
 */
public class TextOkuma {
    
    public File file;
    
    public TextOkuma(File file){
        this.file = file;
    }
    
    public String FileRead( File file) throws FileNotFoundException, IOException{
        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String line;
        
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line); 
            }
        bufferedReader.close();
        
        return  line ;
    }
    
    
    
    
}
