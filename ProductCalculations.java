/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {

    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double getVat() {
        return price * 0.15;
    }

    @Override
    public double getCommission() {
        return price * 0.05;
    }

    @Override
    public double getTotal() {
        return price + getVat() + getCommission();
    }
}

