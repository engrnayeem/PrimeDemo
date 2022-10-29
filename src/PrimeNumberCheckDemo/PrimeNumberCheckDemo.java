/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNumberCheckDemo;

import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class PrimeNumberCheckDemo {
    public static void main(String[]args)
    {
    
    //variable declaration area
        
        int num,i,count=0;
        
        
   //take user input from user 
        
        //import package by press alter+enter
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter any Positive Number :");
        
        
        //num variable holds the user input
        
        num=input.nextInt();
        
        
        
        for(i=2;i<num;i++)
        {
        if(num%i==0)
        {
        
        count++;
        break;
        
        
        }
        
        
        
        
        
        
        }
        
        
        if(count==0)
        {
        System.out.println("It's a Prime Number.");
        
        }
        
        else
        {
        
        System.out.println("It's not a Prime Number.");
        
        }
        
         
        
        
        
        
        
   
    
    
    
    }
    
}
