/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.raiz2;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Raiz2 {

   public static void main(String[] args){
        String texto = "Qual o numero que você quer saber a raiz quadrada?";
        double ra = 0;// Raiz        
        double sub = 0; // double auxiliar de substituição
        double num = numeroUsuario(texto); // numero que o usuario deu 
        ra = maisProximo(num); // chamando a função numero mais proximo
        while((ra * ra) != num){
            ra = (ra + (num/ra))/2;
            if(ra == sub){
                System.out.println("A raiz quadrada aproximada de " + num + " é " + ra);
                break;
            }
            sub = ra;
        }
        if((ra * ra) == num){
            System.out.println("A raiz quadrada exata de " + num + " é " + ra);
        }
   }
   public static double numeroUsuario(String texto){
       Scanner in = new Scanner(System.in);
       double num;
       System.out.println(texto);
       num = in.nextDouble();
       if (num < 0) {
           num = -num;
       }
       return num;
       
   }
   public static double maisProximo(double vet){
        double raiz = 1;
        int aux = 0;
        for(int i = 0; i < vet; i++){
            aux = (i - 1) * (i - 1);
            if((i * i) > vet){
                raiz = aux;
                break;
            }
        }
        return raiz;
    }
}