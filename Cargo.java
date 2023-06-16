/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dwane.T;

import javax.swing.JSpinner;

/**
 *
 * @author user
 */
public class Cargo extends JFrame{
    private String name;
    private String surname;
    private String collectorsNum;
    private double distance;
    private int days;
    private double kg;

    public Cargo(String name, String surname, String collectorsNum, double distance, int days, double kg) {
        this.name = name;
        this.surname = surname;
        this.collectorsNum = collectorsNum;
        this.distance = distance;
        this.days = days;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCollectorsNum() {
        return collectorsNum;
    }

    public void setCollectorsNum(String collectorsNum) {
        this.collectorsNum = collectorsNum;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    
    
    public double CostWith(){
        double total =0;
        if(days>=1 && days<=3){
            total =(25 * kg ) +(500/days)+(12 *distance);
        }
        
         if(days>=4 && days<=6){
            total =(20* kg)+(400/days)+(distance * 12);
        }
        
        if(days>=7 && days<=10){
            total =(15 * kg ) +(300/days)+(12 *distance);
            
        }
        return total ;
    }
    
    public double Tax(){
        return Math.round(CostWith()*0.15);
    }
    
    public double Total(){
        return CostWith() + Tax();
    }
            
    
    
    
}
