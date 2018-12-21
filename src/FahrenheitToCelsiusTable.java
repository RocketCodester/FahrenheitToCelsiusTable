//---------------------------------------------------------------
//         COSC 1337.S01
//         Lab 3
//         2015/3/03
//         FahrenheitToCelsiusTable.java
//         Displays a temperature conversion table 
//---------------------------------------------------------------
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,
                "Enter the lower temperature bound in degrees Fahrenheit:");
        String input2 = JOptionPane.showInputDialog(null,
                "Enter the upper temperature bound in degrees Fahrenheit:");
        String input3 = JOptionPane.showInputDialog(null,
                "Enter the temperature increment in degrees Fahrenheit:");
        double lowerFBound = Double.parseDouble(input);
        double upperFBound = Double.parseDouble(input2);
        double fIncr = Double.parseDouble(input3);
        String table = "Far\tCel";
        table += "\n---------------------------";        
        //DecimalFormat x = new DecimalFormat("0.00");
        for (double i = lowerFBound; i<=upperFBound; i+=fIncr) {
            double j=(5/9.0)*(i-32);
            table = table + "\n" + i/*x.format(i) + "\t" + x.format(j)*/;
        }
        JTextArea jt = new JTextArea(table);
        jt.setOpaque(false);
        jt.setEditable(false);
        jt.setTabSize(6);
        JOptionPane.showMessageDialog(null, jt);
        System.exit(0);
    }
}