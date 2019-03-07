import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Maps {
    
    public static void main(String[] args) {   
        
        HashMap<String, Tacos> menut=new HashMap<String, Tacos>();
        
        menut.put("001", new Tacos("Pastor"));
        menut.put("002", new Tacos("Barbacoa"));
        menut.put("003", new Tacos("Machitos"));
        menut.put("004", new Tacos("Bisteq"));
        menut.put("005", new Tacos("Alambre"));
        menut.put("006", new Tacos("Chorizo"));
        menut.put("007", new Tacos("Tripa"));
        
        System.out.println(menut);
    }
}

class Tacos{
    
    public Tacos(String x){
    
        
        menu = x;
        price=15;
        
    }
    
    public String toString(){
        return "|menu= " + menu + ", price=" + price + "|";
    }
    private String menu;
    private double price;
}