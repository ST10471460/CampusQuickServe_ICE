
package campusquickserve;
import java.util.Scanner;

public class Order {
  //creating the fields  
 private String CustomerName;
 private String StudentNumber;
 private String ItemName; 
 private double baseprice; 
 private final double VATrate = 0.15;
 private double calculateVAT;
 
 //making the constructor
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

//creating the reciept
public String Reciept(){
    double vatAmount = calculateVAT();
    double totalAmount = Total();

return "-----------QuickServe Reciept-----------\n" +
        "Customer Name:" + CustomerName + "\n" +
        "Student Name:" + StudentNumber + "\n" +
        "Item Ordered:" + ItemName + "\n" +
        "Price: R" + baseprice + "\n" +
        "VAT (15%):" + vatAmount + "\n" +
        "Total: R" + totalAmount + "\n" + "----------------------------------------";

        
        
        
        
        
    


}



}
