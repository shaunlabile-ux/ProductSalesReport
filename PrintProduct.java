/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class PrintProduct {

    public static void main(String[] args) {

        Product product = new Product();

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("--------------------------------");

        System.out.println("Total Product Sales: "
                + product.getTotalProductsSold());

        System.out.println("Average Product Sales: "
                + product.getAverageProductsSold());

        System.out.println("Most Popular Product: "
                + product.getMostPopularProduct());
    }
}

