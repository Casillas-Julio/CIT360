
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Collections {
    
    public Collections(String name, String account, double money, String city){
        
        this.name=name;
        this.account=account;
        this.money=money;
        this.city=city;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public double getMoney() {
        return money;
    }
    
    private String name;
    private String account;
    private double money;
    private String city;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.account);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Collections other = (Collections) obj;
        if (!Objects.equals(this.account, other.account)) {
            return false;
        }
        return true;
    }
    
    
}
