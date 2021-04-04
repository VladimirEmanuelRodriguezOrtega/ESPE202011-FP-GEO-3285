/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.question.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SSS SANTIAGO
 */
public class Controller {
    public Controller(String FileName) {
        try {
            File file = new File(FileName);
        
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception exception) {
            System.out.println("Error: no se pudo crear el archivo users.txt");
        }
    }
    
    
    
    public static void addUser(String fileName,String data){
        
        Path filePath = Paths.get(fileName);
        
        try {
            String linea = data + "\n";
            Files.write(filePath, linea.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception exception) {
            System.out.println("Error: Cannot write to file '" + exception.getMessage() + "'");
        }
    }
    
  
    public static void save(String fileName, String data){
        // todo saving data in the file name
        List<String> lineInformation;
        lineInformation = retrieveList(fileName);
        
        try{
            
            
            java.io.File txtFile = new java.io.File(fileName);
            lineInformation.add(data);
            
            if (!txtFile.exists()) {
             txtFile.createNewFile();
           }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            
            for (String studentObject : lineInformation) {
                printer.println(studentObject);
                
            }
            printer.close();
            
        }catch(IOException ex){
            System.err.println("Error saving student..");
            
            
        }
        
        System.out.println("saving----->"+data+"----in file----"+fileName);
        
    }
    public static List<String> retrieveList(String fileName){
        
        ArrayList<String> information = new ArrayList<>();
       
        try{
            FileReader f= new FileReader(fileName);
           
            
            
            
           
            
            BufferedReader b = new BufferedReader(f);
            
            
            String lineFile;
            
            while(( lineFile=b.readLine())!=null){
               
                
                information.add(lineFile);
                
            }
            
            
        }catch (IOException exception){
            System.out.println("no existe el archivo");
             //return information;
        }
        return information;
        
    }
}
