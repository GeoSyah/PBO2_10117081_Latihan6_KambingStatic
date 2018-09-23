/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geo Syah Alkautsar
 * 10117081 IF-2
 * Menampilkan total kambing
 */
public class KambingStatic {

     //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                                        + Mamalia.jumlahKambing);
    }
    
}
