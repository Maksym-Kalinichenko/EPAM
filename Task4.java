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
public class Task4 {
    public static void main(String[] args) {
        
        int sum = 0;
        int num;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of number: ");
        
        num = input.nextInt();
        
        System.out.println("Enter only integer ");
        
        for(int i = 0; i < num; i++){
            int j = input.nextInt();
            sum = sum + j;
        }
        System.out.println(sum);
    }
    
}
