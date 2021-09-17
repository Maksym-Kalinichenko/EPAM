/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.tasks;

import java.util.Scanner;

/**
 *
 * @author maksymkalinichenko
 */
public class Task5 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num 1 - 12 ");
        
        num = input.nextInt();
        
        while( (num > 12) || (num < 1)){
            System.out.println("Error!");
            num = input.nextInt();
        }
        
        switch(num){
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February ");
            break;
            case 3:
                System.out.println("March");
            break;
            case 4:
                System.out.println("April");
            break;
            case 5:
                System.out.println("May");
            break;
            case 6:
                System.out.println("June");
            break;
            case 7:
                System.out.println("July");
            break;
            case 8:
                System.out.println("August");
            break;
            case 9:
                System.out.println("September");
            break;
            case 10:
                System.out.println("October");
            break;
            case 11:
                System.out.println("November");
            break;
            case 12:
                System.out.println("December");
            break;
                
        }
        
    }
    
}
