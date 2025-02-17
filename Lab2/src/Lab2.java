/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ardacoskun
 */

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x, y;
        
        System.out.print("Enter the 1st number => ");
        x = input.nextInt();
        
        System.out.print("Enter the 2nd number => ");
        y = input.nextInt();
        
        System.out.printf("The sum is: %d\n", (x+y));
    }
    
}
