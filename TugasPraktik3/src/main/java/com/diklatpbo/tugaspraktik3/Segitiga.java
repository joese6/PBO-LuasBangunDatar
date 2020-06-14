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
public class Segitiga extends Bangun2Dall{
    double alas,tinggi;
    public Segitiga(){
        
    }
    public Segitiga(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    int getAlasInteger(){
        return (int)alas;
    }
    int getTinggiInteger(){
        return (int)tinggi;
    }
    
    @Override
    void InfoLuas(){
        double LuasS=0.5*alas*tinggi;
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Alas : "+this.getAlasInteger());
        System.out.println("Tinggi : "+this.getTinggiInteger());
        System.out.println("Luas Segitiga : "+LuasS);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
