
package campusquickserve;
import java.util.Scanner;

public class Order {
//creating the fields  
 
    //customer details
 private String CustomerName;
 private String StudentNumber;
 
    //item details
 private String ItemName; 
 private int quantity;
 private double pricePerItem;
 
    //calculate values
 private double subtotal;
 private double vatAmount;
 private double finaltotal;
 
 //Vat rate
 private final double VATrate = 0.15;
 
 //making the constructor
public Order(String name, String studentNumber, String item, int qty, double price){
    this.CustomerName = name;
    this.StudentNumber = studentNumber;
    this.ItemName = item;
    this.pricePerItem = price;
    this.quantity = qty;
}    
//Calculations
public void calculateTotlas(){

    //subtotal  //subtotal=qty*pricePerItem
    this.subtotal = this.quantity * this.pricePerItem;

    //VAT   //vat=subtotal*15%
    this.vatAmount = this.subtotal * VATrate;
    
    //Final total   // total=subtotal*vat
    this.finaltotal = this.subtotal + this.vatAmount;
    
}

//creating the reciept
public String getReiceipt(){
    return "-----------QuickServe Receipt-----------\n" +
        "Customer Name:" + CustomerName + "\n" +
        "Student Name:" + StudentNumber + "\n" +
        
        "Item Ordered:" + ItemName + "\n" +    
        "Quantity:" + quantity + "\n" +
        "Price per item: R" + pricePerItem + "\n" + 
        
        "Subtotal: R" + subtotal + "\n" +  
        "VAT (15%):" + vatAmount + "\n" +
           
        "Total: R" + finaltotal + "\n" +    
        "----------------------------------------";

    }
}
