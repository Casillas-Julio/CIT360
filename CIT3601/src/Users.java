
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Users {
    
    public static void main(String[] args) {
        
        Collections User1=new Collections("John Smith", "123456789", 147200, "Dallas");
        Collections User2=new Collections("Brad Noble", "456789123", 258300, "Salt Lake City");
        Collections User3=new Collections("William Peterson", "789123456", 369100, "Houston");
        Collections User4=new Collections("Sara Jhonson", "147258369", 321600, "Danville");
        Collections User5=new Collections("Mike Carita", "258369147", 654900, "Columbia");
        Collections User6=new Collections("Shena James", "369147258", 98200, "Springfield");
        Collections User7=new Collections("Brad Noble", "456789123", 258300, "Sal Lake City");
        
        Set <Collections> BankClients=new HashSet<Collections>();
        
        BankClients.add(User1);
        BankClients.add(User2);
        BankClients.add(User3);
        BankClients.add(User4);
        BankClients.add(User5);
        BankClients.add(User6);
        BankClients.add(User7);
        
        for (Collections collection : BankClients) {
            
            System.out.println(collection.getName() + " | " + collection.getAccount() + " | " + collection.getMoney() + " | " + collection.getCity());
            
        }
    }
    
}
