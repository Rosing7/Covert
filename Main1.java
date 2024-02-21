/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rupp_;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Drake", "Premium");
        Sale sale = new Sale(customer, "29-01-2024");
        sale.setServiceExpense(100.0);
        sale.setProductExpense(550.0);

        sale.DisplayInfo();
    }
}
