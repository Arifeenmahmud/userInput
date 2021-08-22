/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;
import java.util.Scanner;

/**
 *
 * @author Arifeen Mahmud
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner test = new Scanner(System.in);
        System.out.println("This is test Import");
        String input = test.nextLine();
        System.out.println("My input is: "+ input);
        
    }
    
}
