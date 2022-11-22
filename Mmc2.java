/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmc;

import java.util.Scanner;

/**
 *
 * @author 20222tpmi0035
 */
public class Mmc2 {

    /**
     * @param args the command line arguments
     */
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
