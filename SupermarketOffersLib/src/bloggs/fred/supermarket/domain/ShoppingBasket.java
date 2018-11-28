/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloggs.fred.supermarket.domain;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Administrator
 */
public class ShoppingBasket {
    HashMap<Long,Item> myBasket = new HashMap<>();
    
    
    public void addItem(Item item){
        myBasket.put(item.getId(), item);
    }
   
    public void removeItem(Item item){
        myBasket.remove(item.getId(), item);
    }
    
    public void clearBasket(){
        myBasket.clear();
    }

    public HashMap<Long, Item> getMyBasket() {
        return myBasket;
    }
    
   public String getBasketItems(){
       // HashMap<Long, Item> 
       Long key = 0L;
       Item value  = null;
       
       for(Entry<Long, Item> basketItem : myBasket.entrySet()) {
            key = basketItem.getKey();
            value = basketItem.getValue();
        }
        return key + " " + value;
    }
   
   public double getBasketTotal(){
       
   }
   
   }
   
       
