/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan301;

import java.util.Scanner;

/**
 *
 * @author Febrianatha
 * TGL 22 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aw=0;
        Scanner dtIN = new Scanner(System.in);
        System.out.print("Nilai Awal: ");
        aw =Integer.parseInt( dtIN.nextLine() );
        
        
        int awal = aw;
        int akhir = 10;
        System.out.print("Nilai Akhir: ");
        akhir = Integer.parseInt( dtIN.nextLine());
        
        System.out.println("Perulangan While");
        while(awal<akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++;  //awal=awal+1
        }
        System.out.println("Perulangan do .. while");
        awal = aw;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while(awal<akhir);
        
        System.out.println ("Perulangan for");
        for(awal=0;awal<akhir;awal++){
            System.out.println("Perulangan ke-"+awal);
        }
    }
    
}
