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
        String texto2 = "Digite o numero que sera usado na operação";
        int quant=quant(texto1);
        int[] num = nuns(texto2,quant);
        int primo= 1;
        int mmc =1;
        while (!tudo1(num,quant)){
            while(!primoDiv(primo,num)){
                primo = proximoPrimo(primo);
                System.out.println("d");
            }
            divisao(num,primo,quant);
            mmc=mmc*primo;
            System.out.println("b");
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
    public static boolean tudo1(int[]vet,int quant){
        boolean tudoUm;
        int cont = 1;
        for (int i = 0; i < vet.length; i++){
            if(vet[i] ==1){
                cont++;
            }
        }
        if(cont == quant){
            tudoUm = true;
        }else{
            tudoUm = false;
        }
        return tudoUm;      
    }
    public static int proximoPrimo(int primo){
        primo++;
        int div;
        int contZe = 0;
        while(contZe != 1){
            for(int i=0;i < primo;i++){
                div = primo % i;
                if(div == 0){
                    contZe++;
                }  
            }
            if(contZe !=1){
                contZe = 0;
                primo++;
            }
        }
        return primo;
      
    }
    public static boolean primoDiv(int primo,int []vet){
       boolean primoDiv;
       int cont = 0;
       for(int i = 0; i < vet.length; i++){
           if((vet[i]%primo)== 0){
               cont++;
           }
         break;  
       }
       if(cont == 0){
           primoDiv = false;
       }
       else{
           primoDiv = true;
       }
       return primoDiv;
       
    }
    public static void divisao(int[] vet,int primo,int quant){
        for(int i = 0; i < quant; i++){
           if(vet[i] % primo == 0){
               vet[i] = vet[i] / primo;
               System.out.println("ultimo ");
           }
        }
           
    }
}