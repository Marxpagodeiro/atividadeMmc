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

    public static void main(String[] args) {
      String texto1 = "De quantos numeros você quer tirar o mmc?";
      String texto2 = "Qual numero você quer que tire o mmc?";
      int quant=quant(texto1);
      int[] num = nuns(texto2,quant);
      int primo = 2;
      boolean tudo1 = tudo1(num);
      int mmc = 1;
      
      while(!tudo1){
          while(!primoDivide(primo,num)){
             primo=proximoPrimo(primo); 
          }
          divisão(primo,num);
          mmc= mmc*primo;
      }
      System.out.println(mmc);
      
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
    public static boolean primoDivide(int primo,int[]vet){
        boolean resp = false;
        for(int i=0;i<vet.length;i++){
            if(vet[i]%primo == 0){
               resp = true; 
            }
        }
        return resp;
    }
    public static int proximoPrimo(int primo){
        int resp = 0;
        int cont = 0;
        int proxPri = 0; 
        proxPri = primo+1;
        for(int d = 2;d<=(proxPri/2)+1;d++){
            if(proxPri%d == 0){
                cont++;
                }
        }
        if(cont == 0){
            resp=proxPri;
        }
        return resp;
    }
    public static void divisão(int primo,int[] vet){
        int divisão=0;
        for(int i=0;i<vet.length;i++){
        divisão=vet[i]/primo;
        }
    }
}