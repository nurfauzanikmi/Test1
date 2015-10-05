/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printbiodata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Fauzan
 */
public class BinWriteBiodata {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner input = new Scanner(System.in);
        File path = new File("C:/Users/Fauzan/Desktop/NurFauzanIkmi.bin");
        
        try (FileOutputStream fop = new FileOutputStream(path)) {
                // if file doesn't exists, then create it
                if (!path.exists()) {
                        path.createNewFile();
                }
                
                ObjectOutputStream os = new ObjectOutputStream(fop);
                
                //User Input
                System.out.print("Name : ");
                String name = input.nextLine();
                System.out.print("Matrix No : ");
                String matrix = input.nextLine();
                System.out.print("Gender : ");
                String gender = input.nextLine();
                System.out.print("Age : ");
                String age = input.nextLine();
                System.out.print("E-mails : ");
                String email = input.nextLine();
                System.out.print("Mobile Phone : ");
                String phone = input.nextLine();
                
                // get the content in bytes
                byte[] nameInBytes = name.getBytes();
                byte[] matrixInBytes = matrix.getBytes();
                byte[] genderInBytes = gender.getBytes();
                byte[] ageInBytes = age.getBytes();
                byte[] emailInBytes = email.getBytes();
                byte[] phoneInBytes = phone.getBytes();
                
                os.write(nameInBytes);
                os.write(System.getProperty("line.separator").getBytes());
                os.write(matrixInBytes);
                os.write(System.getProperty("line.separator").getBytes());
                os.write(genderInBytes);
                os.write(System.getProperty("line.separator").getBytes());
                os.write(ageInBytes);
                os.write(System.getProperty("line.separator").getBytes());
                os.write(emailInBytes);
                os.write(System.getProperty("line.separator").getBytes());
                os.write(phoneInBytes);

                os.flush();
                os.close();
                
                int totalBytes = (nameInBytes.length + matrixInBytes.length + genderInBytes.length 
                        + ageInBytes.length + emailInBytes.length + phoneInBytes.length);      
                System.out.println("\nBinary File Written...");
                System.out.println("Wrote " + totalBytes + 
                " bytes");
                
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
