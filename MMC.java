/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mmc;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class MMC {

    public static void main(String[] args) {
      String texto1 = "De quantos numeros você quer tirar o mmc?";
      String texto2 = "Qual numero você quer que tire o mmc?";
      int quant=quant(texto1);
      int[] num = nuns(texto2,quant);
      int primo = 2;
      boolean tudo1 = tudo1(num);
      
    }
    public static int[]nuns(String texto1,int quant){
       Scanner in = new Scanner(System.in);
       int[] num = new int[quant]; 
       for(int i =0;i<quant;i++){
        System.out.println(texto1);
        num[i]=in.nextInt();
        } 
       return num;
    }
    public static int quant(String texto){
       Scanner in = new Scanner(System.in);
       int quant;
       System.out.println(texto);
       quant=in.nextInt(); 
       return quant;
    }
    public static boolean tudo1(int[]vet){
        boolean tudo1= false;
        int cont=0;
        for(int i=0;i<vet.length;i++){
            if(vet[i]==1){
               cont++;
            } 
        }
        if(cont==vet.length){
            tudo1=true;
        }
    return tudo1;       
}
}
