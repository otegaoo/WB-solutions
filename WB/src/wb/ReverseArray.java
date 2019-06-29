/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wb;

/**
 *
 * @author otega
 */
public class ReverseArray {

    public void reverseString(char[] s) {
        int start, end = 0; 
        end = s.length - 1; 
  
        for (start=0; start < end ; start++ ,end--) 
        { 
            
            char temp = s[start]; 
            s[start] = s[end]; 
            s[end]=temp; 
        } 
  
        for (char c : s) 
            System.out.print(c); 
        System.out.println(); 
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
