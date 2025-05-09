/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minigame;
import java.util.Scanner;

/**
 *
 * @author PC-A-30
 */
public class Tebakan {

    private String tx = "gajah"; // jawaban rahasia

    // Method untuk permainan tebak-tebakan
    public void tebak(String tebakan) {
        if (tebakan.equalsIgnoreCase(tx)) {
            System.out.println("Tebakan kamu benar!");
        } else {
            System.out.println("Salah, coba lagi!");
        }
    }
}
    
