package campusquickserve;
import javax.swing.JOptionPane;


public class CampusQuickServe {

    
    public static void main(String[] args) {
    
        //get input for user details
    String name = JOptionPane.showInputDialog("Enter Customer Name:");
    String studentNumber = JOptionPane.showInputDialog("Enter student number:");
    String item = JOptionPane.showInputDialog("Enter item ordered:");
    var price = JOptionPane.showInputDialog("Enter the price:");
    
    //Ensure value is not null/empty
    /*if (name == null), (studentNumber == null), (item = null), (price == null )
        {JOptionPane.showMessageDialog(null, "Input cannot be empty. The program will now close");
        System.exit(0);
        }*/
    
        
    }
    
}
