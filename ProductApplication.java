/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class ProductApplication extends JFrame {

    JTextField txtCustomer;
    JTextField txtPrice;
    JComboBox<String> cmbProduct;

    JButton btnProcess;
    JButton btnClear;

    public ProductApplication() {

        setTitle("Product Calculations");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        txtCustomer = new JTextField();
        txtPrice = new JTextField();

        cmbProduct = new JComboBox<>(new String[]{
            "Cow Nights Monarch",
            "Resilience Barbados",
            "Sealy Phuket"
        });

        btnProcess = new JButton("Process");
        btnClear = new JButton("Clear");

        add(new JLabel("Customer Name:"));
        add(txtCustomer);

        add(new JLabel("Product Name:"));
        add(cmbProduct);

        add(new JLabel("Product Price:"));
        add(txtPrice);

        add(btnProcess);
        add(btnClear);

        btnProcess.addActionListener(e -> process());

        btnClear.addActionListener(e -> clear());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem processItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");

        exitItem.addActionListener(e -> System.exit(0));
        processItem.addActionListener(e -> process());
        clearItem.addActionListener(e -> clear());

        fileMenu.add(exitItem);
        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void process() {

        try {

            String customer = txtCustomer.getText();
            String product = (String) cmbProduct.getSelectedItem();

            if (customer.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Enter customer name.");
                return;
            }

            double price = Double.parseDouble(txtPrice.getText());

            if (price < 0) {
                JOptionPane.showMessageDialog(this,
                        "Price cannot be negative.");
                return;
            }

            ProductCalculations calculation =
                    new ProductCalculations(price);

            double vat = calculation.getVat();
            double commission = calculation.getCommission();
            double total = calculation.getTotal();

            String result =
                    "Customer: " + customer +
                    "\nProduct: " + product +
                    "\nVAT: R" + vat +
                    "\nCommission: R" + commission +
                    "\nTotal: R" + total;

            JOptionPane.showMessageDialog(this, result);

            try (FileWriter writer =
                    new FileWriter("data.txt", true)) {

                writer.write(result + "\n\n");
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this,
                    "Please enter a valid product price.");

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(this,
                    "Error saving data.");
        }
    }

    private void clear() {

        txtCustomer.setText("");
        txtPrice.setText("");
        cmbProduct.setSelectedIndex(0);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
                new ProductApplication());
    }
}

