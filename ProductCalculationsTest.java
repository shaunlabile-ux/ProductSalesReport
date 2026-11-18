/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {

        ProductCalculations product =
                new ProductCalculations(1000);

        assertEquals(150, product.getVat(), 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {

        ProductCalculations product =
                new ProductCalculations(1000);

        assertEquals(1200, product.getTotal(), 0.001);
    }
}
