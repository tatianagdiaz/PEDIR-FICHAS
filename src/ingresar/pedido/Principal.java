/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresar.pedido;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pedido p;
        
        p= new Pedido();
        
        
        Scanner cantidad;
       
        cantidad = new Scanner(System.in);
        int a,b,c,d,e;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        
        /*for(int i=0;i<5;i++){       
            //System.out.println("Digite la cantidad de fichas de" +denominacion+ "que desea:" );
            p.mipedido[1][i] = cantidad.nextInt();         
        }
        */
       
         System.out.println("Digite la cantidad de fichas de 100 que desea:" );
         p.mipedido[1][0] = cantidad.nextInt();
         a = p.mipedido[1][0];
         System.out.println("Digite la cantidad de fichas de 200 que desea:" );
         p.mipedido[1][1] = cantidad.nextInt();
         b = p.mipedido[1][1];
         System.out.println("Digite la cantidad de fichas de 500 que desea:" );
         p.mipedido[1][2] = cantidad.nextInt();
         c = p.mipedido[1][2];
         System.out.println("Digite la cantidad de fichas de 1000 que desea:" );
         p.mipedido[1][3] = cantidad.nextInt();
         d = p.mipedido[1][3];
         System.out.println("Digite la cantidad de fichas de 2000 que desea:" );
         p.mipedido[1][4] = cantidad.nextInt();
         e = p.mipedido[1][4];
       
         
         
         System.out.println("Usted tiene "+a+" fichas de 100"); 
        System.out.println("Usted tiene "+b+" fichas de 200"); 
        System.out.println("Usted tiene "+c+" fichas de 500"); 
        System.out.println("Usted tiene "+d+" fichas de 1000"); 
        System.out.println("Usted tiene "+e+" fichas de 2000"); 
        
    }}
    
