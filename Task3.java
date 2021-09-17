/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.tasks;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author maksymkalinichenko
 */
public class Task3 {

    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter number of random numbers: ");
        num = input.nextInt();
        
        for(int i = 0;i < num; i++){
            System.out.println(rand.nextInt());
        }
        for(int i = 0;i < num; i++){
            System.out.print(rand.nextInt() + " ");
        }
        
        
    }

}
