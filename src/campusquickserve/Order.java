
package campusquickserve;
import java.util.Scanner;

public class Order {
    
 private String CustomerName;
 private String StudentNumber;
 private String ItemName; 
 private double baseprice; 
 private final double VATrate = 0.15;
 private double calculateVAT;
    
public Order(String name, String studentNumber, String item, double price){
    this.CustomerName = name;
    this.StudentNumber = studentNumber;
    this.ItemName = item;
    this.baseprice = price;
    }

//VAT calc.
//multiply price with 0.15
public double calculateVAT(){
    return baseprice * VATrate;
}

//Calc total
public double Total(){
    return baseprice + calculateVAT;

}



}
