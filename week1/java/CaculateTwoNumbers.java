import javax.swing.JOptionPane;
import java.lang.Math;

public class CaculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Input the first number");
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Input the first number");
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Sum is: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "Difference is: " + (Math.abs(num1 - num2)));
        JOptionPane.showMessageDialog(null, "Product is: " + (num1*num2));
        JOptionPane.showMessageDialog(null, "Quotient is: " + (num1/num2));
    }
}
