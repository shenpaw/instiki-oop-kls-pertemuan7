/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan702;

/**
 *
 * @author PC-A-30
 */
public class persegi extends bangunruang {
    private int panjang, lebar;
    
    public void setpanjang (int pj){
        this.panjang = pj;
    }
    public void setlebar(int lb){
        this.panjang = lb;
    }
    @Override
    public void hitungluas(){ //akan menimpa yg  ada pada bangunruang
        this.luas = this.panjang*this.lebar;
                
        System.out.printf("hitung luas persegi\n");
        System.out.printf("~~~~~~~~~~~~~~~~~~~\n");
        System.out.printf("luas = panjang x lebar \n");
        System.out.printf("     =  %d x %d\n", this.panjang, this.lebar);
        System.out.printf("     =  %.2f", this.luas);
    }
    
    
}
