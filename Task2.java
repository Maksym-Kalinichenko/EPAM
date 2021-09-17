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
public class Task2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write what do you want: ");
        for (int i = 0; true; i++){
            StringBuffer text;
            text = new StringBuffer(input.nextLine());
            text.reverse();
            System.out.println(text.toString());
        }
    }
}
