/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting;

/**
 *
 * @author Dell
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
    int[] arr={1,5,6,8,9};
        
        for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
 System.out.println("main loop executed");
    int tmp = 0;  
if (arr[i] > arr[j])   
{  
System.out.println("loop executed");
    tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
} 
        
        
    }
    
}
