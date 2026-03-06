package campusquickserve;
import javax.swing.JOptionPane;


public class CampusQuickServe {
    
 public static void main(String[] args) {

        //Customer Details
        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNum = JOptionPane.showInputDialog("Enter Student Number:");

        //Order Details
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        String qtyInput = JOptionPane.showInputDialog("Enter Quantity:");
        String priceInput = JOptionPane.showInputDialog("Enter Price Per Item:");

        //Validate Inputs
        //prevents user from leaving it empty
        if (name == null || studentNum == null || item == null || qtyInput == null || priceInput == null) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty. The program will now close");
            System.exit(0);
        }

        //the correct format for input
        int quantity = 0;
        double price = 0.0;
        //forces user to use correct inputs if not the program closes
        try {
            quantity = Integer.parseInt(qtyInput);
            price = Double.parseDouble(priceInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format.");
            System.exit(0);
        }

       //Create Order Object
       Order myOrder = new Order(name, studentNum, item, quantity, price);
  
       //calculate totals
       myOrder.calculateTotlas();
       
       //get receipt
       String receipt = myOrder.getReiceipt();
       
       //Display Receipt om JoptionPane
       JOptionPane.showMessageDialog(null, receipt, "QuickServe Receipt", JOptionPane.INFORMATION_MESSAGE);
               
    }
}