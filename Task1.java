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
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.println("Write your name: ");
        name = input.next();
        System.out.println("Hello " + name);
    }
    
}
