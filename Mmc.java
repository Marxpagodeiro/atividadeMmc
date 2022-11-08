/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmc;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Mmc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String texto1 = "De quantos numeros vc quer tirar o mmc?";
      String texto2 = "Quais numeros vc quer que tire o mmc?";
      int quant=0;
      int[] num = new int[quant]; 
        System.out.println(texto1);
        quant=in.nextInt();
        for(int i =0;i<quant;i++){
        System.out.println(texto2);
        num[i]=in.nextInt();
        }
    }
    
    public static boolean tudo1(int[]vet){
        boolean tudo1= false;
        for(int i=0;i<vet.length;i++){
           while(vet[i]==1){
               tudo1=true;
           } 
        
    }
    return tudo1;       
}
}
