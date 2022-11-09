/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libro;

import java.util.Random;
//@autor DAVID ISMAEL LOPEZ NAVARRO
public class ListaEnOrden {

    public static void main(String[] args) {
        Random r;
 int d;
 ListaOrdenada lista;
 int k;
 r = new Random(); // generador de números aleatorios 
 lista = new ListaOrdenada(); // crea lista vacía
 k = r.nextInt(99)+1; // número de elementos 
 // inserta elementos en la lista
 for (; k >= 0; k-- )
 {
 d = r.nextInt();
 lista.insertaOrden(d);
 }
 // escribe los elementos de la lista
 System.out.println("Elementos de la lista ordenada \n");
 lista.visualizar(); 
}
}
    
    

