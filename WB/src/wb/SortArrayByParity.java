/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wb;

import java.util.LinkedList;

/**
 *
 * @author otega
 */
public class SortArrayByParity {
    
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int temp = 0;
        
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0){
                result[temp] = A[i];
                temp++;
            }
        }
        
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 != 0){
                result[temp] = A[i];
                temp++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        
    }
    
}
