/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart2;

import java.util.Date;
import shoppingcart2.Size;

/**
 *
 * @author vangu
 */
public class Apparel extends Merchandise{
    private Size size;
    private Date returnPeriod;

    public Date getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(Date returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public String toString(){
        return size + " " + super.getItemName() + ": " + super.getPrice() + " x " + super.getQuantity();
    }
}
