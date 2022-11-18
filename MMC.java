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
        while (!tudo1(num)){
            int aux = mmc;
            System.out.println(print(num) + "|" + primo);
            divisao(num, primo);
            if(mmc == aux){
              primo = proximoPrimo(primo);
            }
        }
        System.out.println("O resultado final do mmc eh:"+ mmc);
    }
    public static int mmc =1;
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
        boolean tudoUm = true;
        for (int i = 0; i < vet.length; i++){
            if(vet[i] !=1){
                tudoUm = false;
                break;
            }
        }
        return tudoUm;      
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
    public static int proximoPrimo(int primo){
        int proxPri = primo;
        do{
            proxPri=primo+1;
        }while (!ehPrimo(proxPri));
        return proxPri;
      
    }
    public static void divisao(int[] vet,int primo){
        int aux = 0;
        for(int i = 0; i < vet.length; i++){
           if(vet[i] % primo == 0){
               vet[i] = vet[i] / primo;
               aux +=1;
           }
        }
        if(aux > 0){
            mmc *= primo;
        }    
    }
        
}
