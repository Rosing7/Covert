/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rupp_;

import java.text.DateFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Covert {
     public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a short date (YYYY-MM-DD): ");
String shortDate = sc.nextLine();
String[] dateParts = shortDate.split("-");
int year = Integer.parseInt(dateParts[0]);
int month = Integer.parseInt(dateParts[1]);
int day = Integer.parseInt(dateParts[2]);
String monthName = new DateFormatSymbols().getMonths()[month
- 1];
System.out.println("Output: " + monthName + " " + day + ", " +
year);
sc.close();
}
}
