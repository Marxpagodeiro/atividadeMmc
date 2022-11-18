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
      String texto2 = "Digite o numero que sera usado na operação";
      int quant=quant(texto1);
      int[] num = nuns(texto2,quant);
      int primo = 2;
      boolean tudo1 = tudo1(num);
      int mmc = 1;
      while (!tudo1){
        System.out.println(print(num) + "|" + primo);
        while(!primoDivide(primo,num)){
            primo=proximoPrimo(primo); 
        }
        divisao(num,primo);
        mmc= mmc*primo;
      
      }
      System.out.println("O resultado final do mmc eh:"+ mmc);
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
    public static String print(int[] vet){
        String print = "";
        for(int i = 0; i < vet.length;i++){
            print += vet[i]+ ",";
        }
        return print;
    }

    public static boolean tudo1(int[]vet){
        boolean tudo1= false;
        for (int i = 0; i < vet.length; i++){
            if(vet[i] ==1){
                tudo1= true;
            }
        }
        return tudo1;       
    }
    public static boolean ehPrimo(int primo){
        boolean primoCerto = true;
        for(int i = 2; i< (primo/2)+1; i++){
            if(primo % 2 == 0){
                primoCerto = false;
                break;
            }
        }
        return primoCerto;
    }
    public static boolean primoDivide(int primo,int[]vet){
        boolean resp = true;
        for(int i = 0; i < vet.length; i++){
            if(vet[i] % primo == 0){
                resp = false;
            }
        }
        return resp;
    }
    public static int proximoPrimo(int primo){
        int proxPri = primo;
        do{
            proxPri=primo+1;
        }while (!ehPrimo(proxPri));
        return proxPri;
      
    }
    public static void divisao(int[] vet,int primo){
        
        for(int i = 0; i < vet.length; i++){
            vet[i] = vet[i] / primo;
        }
    }
        
}
