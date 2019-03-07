/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author julio
 */
public class List {
    
    public static void main(String[] args) {
        
        LinkedList<String> tacos=new LinkedList<String>();
        
        tacos.add("Pastor");
        tacos.add("Lengua");
        tacos.add("Bisteq");
        tacos.add("Machito");
        tacos.add("Tripa");
        tacos.add("Barbacoa");
        tacos.add("Alambre");
        tacos.add("Chorizo");
        
        LinkedList<String> salsa=new LinkedList<String>();
        
        salsa.add("Roja");
        salsa.add("Verde");
        salsa.add("Tomate");
        salsa.add("Tomatillo");
        salsa.add("Chile de Arbol");
        salsa.add("Chipotle");
        salsa.add("Seco");
        salsa.add("Asada");
        
        ListIterator<String> tac=tacos.listIterator();
        ListIterator<String> sal=salsa.listIterator();
        
        while(sal.hasNext()){
            if(tac.hasNext()){
                tac.next();
            }            
            tac.add(sal.next());
        }
        System.out.println(tacos);
    }
    
}
