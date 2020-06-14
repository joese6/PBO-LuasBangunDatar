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
public class PersegiPanjang extends Bangun2Dall{
    double panjang,lebar;
    PersegiPanjang(){
        
    }
    PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    int getPanjangInteger(){
        return (int)panjang;
    }
    int getLebarInteger(){
        return (int)lebar;
    }
    @Override
    void InfoLuas(){
        double LuasPP=this.panjang*this.lebar;
        System.out.println("MENGHITUNG LUAS BANGUN DATAR");
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang : "+this.getPanjangInteger());
        System.out.println("Lebar : "+this.getLebarInteger());
        System.out.println("Luas Persegi Panjang : "+LuasPP);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
}
