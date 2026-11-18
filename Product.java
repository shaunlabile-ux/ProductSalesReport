/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product implements IProducts {
    private String[] products = {
        "Cow Nights Monarch",
        "Resilience Barbados",
        "Sealy Phuket"
    };

    private int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    @Override
    public int getTotalProductsSold() {
        int total = 0;

        for (int[] productSales : sales) {
            for (int value : productSales) {
                total += value;
            }
        }

        return total;
    }

    @Override
    public double getAverageProductsSold() {
        return (double) getTotalProductsSold() / 9;
    }

    @Override
    public String getMostPopularProduct() {
        int highest = 0;
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            int total = 0;

            for (int value : sales[i]) {
                total += value;
            }

            if (total > highest) {
                highest = total;
                index = i;
            }
        }

        return products[index];
    }
}

