/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farmsystem.controller;

import ec.edu.espe.Farmsystem.model.Dog;
import utlis.FileManager;

/**
 *
 * @author HP
 */
public class DogController {
    public void save (Dog dog){
        String data = dog.getName() + "," + dog.getRace()+ "," + dog.getColor()+ "," + dog.getYears();
    FileManager.save(data, "dogs");
    }
    }
    

