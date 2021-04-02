/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.question.model;

/**
 *
 * @author SSS SANTIAGO
 */
public class BattleField {
    private String Name;
    private String Number;
    private String Fusil;
    private String Helmet;
    private String Platoom;

    public BattleField(String Name, String Number, String Fusil, String Helmet, String Platoom) {
        this.Name = Name;
        this.Number = Number;
        this.Fusil = Fusil;
        this.Helmet = Helmet;
        this.Platoom = Platoom;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getFusil() {
        return Fusil;
    }

    public void setFusil(String Fusil) {
        this.Fusil = Fusil;
    }

    public String getHelmet() {
        return Helmet;
    }

    public void setHelmet(String Helmet) {
        this.Helmet = Helmet;
    }

    public String getPlatoom() {
        return Platoom;
    }

    public void setPlatoom(String Platoom) {
        this.Platoom = Platoom;
    }

    @Override
    public String toString() {
        return Name + ";" + Number + ";" + Fusil + ";" + Helmet + ";" + Platoom ;
    }
    
}