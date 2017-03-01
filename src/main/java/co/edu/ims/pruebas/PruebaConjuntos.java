/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.pruebas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 012345678
 */
public class PruebaConjuntos {
    public static void main(String[] args){
        Set<String> conjuto = new HashSet<>();
        String actor1 = "Chespirito";
        String actor2 = "Audrey Tatoo";
        String actor3 = "Megan Fox";        
        String actor4 = "Arnol Scharzenegger";
        
        conjuto.add(actor1);
        conjuto.add(actor2);
        conjuto.add(actor3);
        conjuto.add(actor4);
        conjuto.add(actor2);
        conjuto.add(actor3);
        
        //Los conjuntos no se pueden ordenar
        //Collections.sort(conjuto);
        System.out.println(conjuto);
        System.out.println("Tamaño: " + conjuto.size());
        
        
        
    }//end main
    
}
