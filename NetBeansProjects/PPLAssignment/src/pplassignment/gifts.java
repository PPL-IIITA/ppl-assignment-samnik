/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassignment;


/**
 *
 * @author nikita
 */
public class gifts {
    public String gifttype;
    public int value;
    public int price;
   
    
    public int luxRating;
    public int difficultyObtain;
    
    public int utilValue;
    public String utilClass;
    
    public gifts(String gtype,int val,int pri){
        gifttype = gtype;
        value =val;
        price = pri;
        utilValue = 0;
        utilClass = "";
        luxRating = 0;
        difficultyObtain = 0;
    }
    public gifts(String gtype,int val,int pri,int rating,int diff){
        gifttype = gtype;
        value =val;
        price = pri;
        luxRating = rating;
        difficultyObtain = diff; 
        utilValue = 0;
        utilClass = "";
    }
    public gifts(String gtype,int val,int pri,int util,String utilclass){
        gifttype = gtype;
        value =val;
        price = pri;
        utilValue = util;
        utilClass = utilclass;
        luxRating = 0;
        difficultyObtain = 0;
    }
   
}
