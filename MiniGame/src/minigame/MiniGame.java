/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minigame;
import java.util.Scanner;
/**
 *
 * @author PC-A-30
 */
public class MiniGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tebakan game = new Tebakan();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Permainan Tebak-Tebakan ===");
        System.out.println("Coba tebak kata rahasia! (ketik 'exit' untuk keluar)");

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Permainan selesai. Terima kasih!");
                break;
            }

            game.tebak(input);
        }

        scanner.close();
    }
    
}
