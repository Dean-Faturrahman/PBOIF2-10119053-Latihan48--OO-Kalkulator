/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan48.oo.kalkulator;

import model.Kalkulator;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program kalkulator
 */
public class PBOIF210119053Latihan48OOKalkulator {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        System.out.println("VALUE 1 = " + kalkulator.getValue1());
        kalkulator.setValue2(5);
        System.out.println("VALUE 2 = " + kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject(null);
        
        System.out.println("Result add is = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result minus is = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result multiplication is = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result division is = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
