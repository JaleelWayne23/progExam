/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssales;

import java.util.Scanner;

/**
 *
 * @author Asmin
 */
public class MatressSales {

    public static void main(String[] args) {
        


    
        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }

        

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*********************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.getTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) Math.round(product.getAverageProductsSold()));
        System.out.println("MOST POPULAR PRODUCT: " + product.getMostPopularProduct());
    }
}
    

