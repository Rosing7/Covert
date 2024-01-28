/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shift_Time;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class input extends Frame{
    Label label;   
    TextField field1,field2;
    Button ok;
    JComboBox cbTime,cbPosition;
    JTable table;
    DefaultTableModel model;
    
    public input(){
         label = new Label("Name");
        label.setBounds(50, 30, 100, 100);
        label.setFont(new Font("Calibri",Font.BOLD,15));
        label.setForeground(Color.WHITE);
        add(label);
        
        label = new Label("Position");
        label.setBounds(50, 90, 100, 100);
        label.setFont(new Font("Calibri",Font.BOLD,15));
        label.setForeground(Color.WHITE);
        add(label);
        String position[]={" ","Casier","Stock Controller","Cleaner","Security"};
        cbPosition = new JComboBox(position);
        cbPosition.setBounds(260, 110, 250, 40);
        cbPosition.setFont(new Font("Time New Roman",Font.PLAIN,15));
        cbPosition.setEditable(true);
        cbPosition.setFocusable(false);
        add(cbPosition);
        
        label = new Label("Time Preference");
        label.setBounds(50, 150, 200, 100);
        label.setFont(new Font("Calibri",Font.BOLD,15));
        label.setForeground(Color.WHITE);
        add(label);
        String time[]={" ","Morning","Afternoon","Night"};
        cbTime = new JComboBox(time);
        cbTime.setBounds(260, 170, 250, 40);
        cbTime.setFont(new Font("Time New Roman",Font.PLAIN,15));
        cbTime.setEditable(true);
        cbTime.setFocusable(false);
        add(cbTime);
        
        label = new Label("Total Working Hour/week");
        label.setBounds(50, 210, 200, 100);
        label.setFont(new Font("Calibri",Font.BOLD,15));
        label.setForeground(Color.WHITE);
        add(label);
        
        
        field1 = new TextField();
        field1.setBounds(260, 60, 250, 35);
        field1.setFont(new Font("calibri",Font.PLAIN,10));
        field1.setBackground(Color.WHITE); 
        add(field1);
        
        field2 = new TextField();
        field2.setBounds(260, 230, 250, 35);
        field2.setFont(new Font("calibri",Font.PLAIN,10));
        field2.setBackground(Color.WHITE);
        add(field2);
        
        String head[]={"Name","Position","Time Preference","Total Working Hour/week"};
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(head);
        table.setRowHeight(40);
        table.setFont(new Font("Time New Roman",Font.PLAIN,20));
        table.setModel(model);
        JScrollPane js = new JScrollPane(table);
        js.setBounds(50, 400, 1200, 200);
        add(js);
        
        
        setLayout(null);
        setSize(1300,800);
        setLocationRelativeTo(this);
        setTitle("1.Input");
        setBackground(new Color(52,73,94));
        setVisible(true);
    }
    public void actionPerform(ActionEvent e){
        String name = field1.getText();
        String position = cbPosition.getSelectedItem().toString();
    }
    public static void main(String[] args) {
        new input();
//        Scanner input = new Scanner(System.in);
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("John Wick", "Cashier", "Morning", 40));
//        employees.add(new Employee("Narith", "Cleaner", "Afternoon", 30));
        
                
    }
}
