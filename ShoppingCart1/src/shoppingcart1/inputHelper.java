/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart1;

/**
 *
 * @author vangu
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author vangu
 */
public class inputHelper {
    public static void main (String[] args){
        String testString = inputHelper.getInput("hello");
        System.out.println(testString);
    }
    
    
    public static String getInput(String prompt){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(prompt);
        System.out.flush();
        
        try{
            return stdin.readLine();
        }
        catch(Exception E){
            return "Error" + E.getMessage();
        }
            
    }
    
    public static Double getDouble(String prompt) throws NumberFormatException {
        String input = getInput(prompt);
        return Double.parseDouble(input);
    }
    
    public static Integer getInteger(String prompt) throws NumberFormatException{
        String input = getInput(prompt);
        return Integer.parseInt(input);
    }
    
}