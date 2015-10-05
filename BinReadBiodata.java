/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printbiodata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Fauzan
 */
public class BinReadBiodata {
    public static void main(String[] args){
        
       try{
        FileInputStream path = new FileInputStream("C:/Users/Fauzan/Desktop/NurFauzanIkmi.bin");
        ObjectInputStream os = new ObjectInputStream(path);
        
        //read line
        int line = os.read();
            while(line != -1){
                System.out.print((char)line);
                line = os.read();
            }           

        System.out.println();    
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
       
    }
    
}
