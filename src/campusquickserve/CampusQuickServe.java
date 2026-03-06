package campusquickserve;
import javax.swing.JOptionPane;


public class CampusQuickServe {

    
    public static void main(String[] args) {
    /*
        //get input for user details
    String name = JOptionPane.showInputDialog("Enter Customer Name:");
    String studentNumber = JOptionPane.showInputDialog("Enter student number:");
    String item = JOptionPane.showInputDialog("Enter item ordered:");
    var price = JOptionPane.showInputDialog("Enter the price:");
    
    //Ensure value is not null/empty
    if (name == null || studentNumber == null || item = null || price == null )
        {JOptionPane.showMessageDialog(null, "Input cannot be empty. The program will now close");
        System.exit(0);
        }
    
        
    }
    
}
*/
   
 /*       // 1. Gather Input using JOptionPane (GUI)
        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNum = JOptionPane.showInputDialog("Enter Student Number:");
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        
        // Input for price with error handling
        String priceInput = JOptionPane.showInputDialog("Enter Price (e.g., 50.00):");
        
        // Validate input is not empty
        if (name == null || studentNum == null || item == null || priceInput == null) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty. Exiting.");
            System.exit(0);
        }

        double price = 0.0;
        try {
            price = Double.parseDouble(priceInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Price format. Please enter a number.");
            System.exit(0);
        }

        // 2. Create Order Object
        Order myOrder = new Order(name, studentNum, item, price);

        // 3. Get Receipt String
        String receipt = myOrder.getReceipt();

        // 4. Output to Console
        System.out.println("\n--- RECEIPT GENERATED ---");
        System.out.println(receipt);
        System.out.println("-------------------------\n");

        // 5. Output to JOptionPane (GUI)
        JOptionPane.showMessageDialog(null, receipt, "QuickServe Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
} 
*/
 // 1. Gather Customer Details
        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNum = JOptionPane.showInputDialog("Enter Student Number:");

        // 2. Gather Order Details
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        String qtyInput = JOptionPane.showInputDialog("Enter Quantity:");
        String priceInput = JOptionPane.showInputDialog("Enter Price Per Item:");

        // 3. Validate Inputs
        if (name == null || studentNum == null || item == null || qtyInput == null || priceInput == null) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty. Exiting.");
            System.exit(0);
        }

        int quantity = 0;
        double price = 0.0;

        try {
            quantity = Integer.parseInt(qtyInput);
            price = Double.parseDouble(priceInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Number format for Quantity or Price.");
            System.exit(0);
        }

        // 4. Create Order Object
        Order myOrder = new Order(CustomerName, StudentNumber, ItemName, quantity, baseprice);

        // 5. Calculate Totals
        myOrder.Total();

        // 6. Get Receipt String
        String receipt = myOrder.getReceipt();

        // 7. Display Receipt in JOptionPane
        JOptionPane.showMessageDialog(null, receipt, "QuickServe Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}