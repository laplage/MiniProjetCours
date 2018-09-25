/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojetcours;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MiniProjetCours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        /* Scanner clavier = new Scanner(System.in);
        try {
            System.out.println("Entrer le premier nombre : ");
            int nombre1 = clavier.nextInt();//=10;
            System.out.println("Entrer le deuxième nombre : ");
            int nombre2 = clavier.nextInt();//=15;

            System.out.println("la moyenne est de  :" + moyenne(nombre1, nombre2));
        } catch (Exception e) {
            System.out.println("entrer un nombre SVP");
        }*/
        //int[] cote = new int[10]; //déclaration8
        int [] cote ={0,1,2,3,4,5,6,7,8,9,10};
        /*int i = 5;
        int j = ++i;
        int k = i++;
        System.out.println(j);
         System.out.println(k);
         ;*/
        //for (int i = 0; i < 10; i++) {
          //  cote[i] = i;
        //}
        for (int i : cote) {
            System.out.println(i);
        }
    }

    /**
     *
     * @param nb1
     * @param nb2
     * @return
     */
    public static double moyenne(double nb1, double nb2) {
        return (nb1 / nb2);
    }

}
