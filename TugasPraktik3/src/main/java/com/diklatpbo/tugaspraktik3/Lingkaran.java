/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik3;
import java.awt.Graphics;
/**
 *
 * @author Mas Johan
 */
public class Lingkaran extends Bangun2Dall{
    double jarijari;
    
    Lingkaran(){
        
    }
    Lingkaran (double jari){
        this.jarijari=jari;
    }
    int getJariInteger(){
        return (int)jarijari;
    }
    
    @Override
    void InfoLuas(){
        double LuasL=3.14*jarijari*jarijari;
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-Jari : "+this.getJariInteger());
        System.out.println("Luas Lingkaran : "+LuasL);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
