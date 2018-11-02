/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httye;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Ramdani
 */
public class Generator {
    public JTextField gr[][];
    public int baris;
    public int kolom;
    public void cek() {
        if (HTTYE.gb.level.getText().equals("1")) {
//            System.out.println("level 1");
            setLvl1G1();
        } else if (HTTYE.gb.level.getText().equals("2")) {
            System.out.println("level 2");
        } else if (HTTYE.gb.level.getText().equals("3")) {
            System.out.println("level 3");
        } else if (HTTYE.gb.level.getText().equals("4")) {
            System.out.println("level 4");
        } else {
            System.out.println("level 5");
        }
    }
    
    public void setLvl1G1 () {
        baris=8;
        kolom=16;
        gr=new JTextField[baris][kolom];
        for (int i=0;i<baris;i++) {
            for (int j=0;i<kolom;j++) {
                gr[i][j]=new JTextField(1);
                gr[i][j].setBackground(Color.red);
            }
        }
        for (int i=0;i<baris;i++) {
            for (int j=0;i<kolom;j++) {
                HTTYE.gb.papanGame.add(gr[i][j]);
            }
        }
        
    }
}
