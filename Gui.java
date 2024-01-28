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


/**
 *
 * @author Admin
 */
public class Gui extends Frame{
     Label label;
    TextField field;
    Button button1,button2, button3, button4, button5, button6;
    public Gui(){
        button1 = new Button("1.Register Employee Shift");
        button1.setBounds(140, 90, 300, 50);
        button1.setFont(new Font("The New Roman",Font.BOLD,15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(52,73,94));
        add(button1);
        
        button2 = new Button("2.Show Position and time preferences");
        button2.setBounds(140, 150, 300, 50);
        button2.setFont(new Font("The New Roman",Font.BOLD,15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(52,73,94));
        add(button2);
        
        button3 = new Button("3.Employee Shift ");
        button3.setBounds(140, 210, 300, 50);
        button3.setFont(new Font("The New Roman",Font.BOLD,15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(52,73,94));
        add(button3);
        
        button4 = new Button("4.Search Employee Shift");
        button4.setBounds(140, 270, 300, 50);
        button4.setFont(new Font("The New Roman",Font.BOLD,15));
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(52,73,94));
        add(button4);
        
         button5 = new Button("5.Delete Existing Shift");
        button5.setBounds(140, 330, 300, 50);
        button5.setFont(new Font("The New Roman",Font.BOLD,15));
        button5.setForeground(Color.WHITE);
        button5.setBackground(new Color(52,73,94));
        add(button5);
        
        button6 = new Button("6.Exit");
        button6.setBounds(140, 330, 300, 50);
        button6.setFont(new Font("The New Roman",Font.BOLD,15));
        button6.setForeground(Color.WHITE);
        button6.setBackground(new Color(52,73,94));
        add(button6);
//    
//         label = new Label("Name");
//        label.setBounds(120, 30, 100, 100);
//        label.setFont(new Font("Calibri",Font.BOLD,20));
//        label.setForeground(Color.WHITE);
//        add(label);
        
//         label = new Label("Gender");
//        label.setBounds(220, 30, 100, 100);
//        label.setFont(new Font("Calibri",Font.BOLD,20));
//        label.setForeground(Color.WHITE);
//        add(label);
//        
//        label = new Label("Position");
//        label.setBounds(320, 30, 100, 100);
//        label.setFont(new Font("Calibri",Font.BOLD,20));
//        label.setForeground(Color.WHITE);
//        add(label);
//        field = new TextField();
//        field.setBounds(150, 250, 250, 40);
//        field.setFont(new Font("calibri",Font.PLAIN,28));
//        field.setBackground(Color.CYAN);
//        add(field);
        
//        button1.addActionListener(this);
//        button2.addActionListener(this);
//        button3.addActionListener(this);
//        button4.addActionListener(this);
//        button5.addActionListener(this);
//        button6.addActionListener(this);
        
        setLayout(null);
        setSize(600,500);
        setLocationRelativeTo(this);
        setTitle("Shift Time of employee");
        setBackground(new Color(52,73,94));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Gui();
    }
}
