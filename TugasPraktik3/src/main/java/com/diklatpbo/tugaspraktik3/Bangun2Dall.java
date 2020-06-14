/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Mas Johan
 */
public class Bangun2Dall extends JPanel{
    double Luas;
    int PerbesarGmb=3;
    
    double phi=3.14,jari2=10,luasLingkaran=phi*jari2*jari2;
    double p=15,l=10,luasPersegiPanjang=p*l;
    double a=10,t=20,luasSegitiga=0.5*a*t; 
    
    Bangun2Dall(){
        
    }
    @Override
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        //set Font
        Font f = new Font ("Arial", 1, 4);
        g.setFont(f);
        
        Graphics2D g2d=(Graphics2D)g;
        //PERBESARAN 3 KALI
        g2d.scale(PerbesarGmb, PerbesarGmb);
        
        //menggambar lingkaran
        g.setColor(Color.BLUE);
        g.drawString("Jari-jari : "+jari2, 4, 10);
        g.drawString("Luas Lingkaran : "+luasLingkaran, 4, 18);
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 4, 25);
        g.setColor(Color.BLUE);
        g.drawOval(4, 40, 20, 20);//g.drawOval(10, 120, 50, 50);// int x,y,w,,h
        g.drawString("LINGKARAN", 4, 70);
        
        //memberi warna background pada gambar persegi panjang
        g.setColor(Color.GREEN);
        g.fillRect(60, 0, 620, 380);
        
        //menggambar persegi panjang
        g.setColor(Color.BLUE);
        g.drawString("Panjang : "+p, 70, 10);
        g.drawString("Lebar : "+l, 70, 18);
        g.drawString("Luas Persegi Panjang : "+luasPersegiPanjang, 70, 25);
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 70, 32);
        g.drawRect(70, 40, 40, 20); //g.drawRect(200, 120, 100, 50);// int x,y,w,,h
        g.drawString("PERSEGI PANJANG", 70, 70);
        
        //memberi warna background pada gambar segitiga
        g.setColor(Color.MAGENTA);
        g.fillRect(130, 0, 620, 380);
        //menggambar segitiga
        g.setColor(Color.BLUE);
        g.drawString("Alas : "+a, 140, 10);
        g.drawString("Tinggi : "+t, 140, 18);
        g.drawString("Luas Segitiga : "+luasSegitiga, 140, 25);
        g.drawString("Perbesaran gambar : "+PerbesarGmb+" kali", 140, 32);
        g.drawString("SEGITIGA", 140, 70);
        int[]x1= {140, 146, 154};// int[]x= {420, 440, 460};
        int[] y1={40, 60, 40};//  int[] y={120, 170, 120};
        g.drawPolygon(x1,y1 , 3);//  g.drawPolygon(x,y , 3);
     }
     
    void InfoLuas(){
        System.out.println("Program Luas Bangun Datar 2D");
        System.out.println("============================");
    }
    public static void main(String[]args){
        Bangun2Dall b2d=new Bangun2Dall();
        b2d.setBackground(Color.YELLOW);
        b2d.InfoLuas();
        
        //Lingkaran
        Lingkaran ling=new Lingkaran(10);
        ling.InfoLuas();
        
        //Persegi Panjang
        PersegiPanjang pp=new PersegiPanjang(15,10);
        pp.InfoLuas();
        
        //Segitiga
        Segitiga s=new Segitiga(10,20);
        s.InfoLuas();
        
        JFrame jf=new JFrame();
        jf.setTitle("Menggambar Bangun Datar");
        jf.setSize(620, 380);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(b2d);
    
    }
}
