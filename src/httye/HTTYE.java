/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httye;

import javax.swing.*;

/**
 *
 * @author Ramdani
 */
public class HTTYE {
    static Menu_Utama mu;
    static List_Games lg;
    static About ab;
    static Help hl;
    static Number num;
    static Find fin;
    static Game_Board gb;
    static Generator gen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mu=new Menu_Utama();
        lg= new List_Games();
        ab=new About();
        hl=new Help();
        num=new Number();
        fin=new Find();
        gb=new Game_Board();
        gen=new Generator();
        
        mu.setVisible(true);
    }
    
}
