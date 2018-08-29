/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart1;

import java.util.ArrayList;
import shoppingcart1.inputHelper;

/**
 *
 * @author vangu
 */
public class ShoppingCart1 {
    private ArrayList<String> Merchandise = new ArrayList();
    // This ArrayList is essentially going to be the thing that contains all of our items (merchandise)
    // we will manipulate this ArrayList by adding to it, popping items off, and printing from it
    // eventually we will actually create the objects that go into this list but for the time being I will use the generic
    // <String> so that we can insert basic item names into it
    
    private static boolean Close = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String Response;
        String ItemManipulated;
        System.out.println("Hello you are running the ShoppingCart1 application\n");
        ShoppingCart1 shoppingcart = new ShoppingCart1();
        // this creates the ShoppingCart1 object within our main function
        // since we did not specify a constructor (we didn't create a constructor)
        // Java automatically creates a default constructor for us.
        while(Close == false){
            Response = inputHelper.getInput("Here are your choices of action:\n"
                    + "Add Item -- go ahead and type, 'add' and press enter. You will then be prompted for the item's name you would like to add\n"
                    + "Remove Item -- go ahead and type, 'remove' and press enter. You will then be prompted for item's name you would like removed\n"
                    + "Print Shopping -- go ahead and type, 'print' to see all of your items in the cart\n");
            switch(Response){
                case "add":
                    ItemManipulated = inputHelper.getInput("What is the name of the item you would like added?");
                    shoppingcart.addItem(ItemManipulated);
                    System.out.println("You have added " + ItemManipulated);
                    Thread.sleep(2000);
                    break;
                case "remove":
                    ItemManipulated = inputHelper.getInput("What is the name of the item you would like removed?");            
                    if(shoppingcart.removeItem(ItemManipulated))
                        // this looks a little tricky because I don't have curly braces but all it is doing is that it runs whatever is in the 'If' statement
                        // and if that is true it will run ONLY the next line which in this case is the println statement
                    System.out.println("You have successfully removed " + ItemManipulated);
                    Thread.sleep(2000);
                    break;
                case "print":
                    shoppingcart.printList();
                    Thread.sleep(2000);
                    break;
                case "close":
                    Close = true;
                    break;
                default: 
                    System.out.println("Sorry, I didn't quite get that");
                    Thread.sleep(10);
            
        }
        }
        System.out.println("Closing ShoppingCart1 Application");
    }
    
    private void addItem(String Item){
        Merchandise.add(Item);
        // this is very simple in that all we are doing is using ArrayList's default add function to add the item
        // to the list. In the future we will want to add checks to this AddItem() function that will check
        // for duplicate items and then if it finds duplicates we will want to increment the quantity instead
        // of adding a duplicate item to the cart
    }
    
    private boolean removeItem(String Item){
        if(Merchandise.contains(Item)){
            return Merchandise.remove(Item);
            // this is also very simple since we are using the default remove() function from the ArrayList.
            // We are returning the item with this function to later display to the user which item was removed
            // from the ShoppingCart
        }
        else{
            System.out.println("Sorry bud, but that item isn't in your shopping cart");
            return false;
        }
    }
    
    private void printList(){
        if(Merchandise.isEmpty()){
            System.out.println("Sorry bud, but your shopping cart is empty");
            return;
            // not sure if I want to have return here or a break (I assume return though)
        }
        for(String item: Merchandise){
            System.out.println(item);
            // this will iterate through the list of items in the shopping cart and will print each one out
            // if you have questions regarding a FOR loop do not hesitate to ask me
        }
    }
    
}
