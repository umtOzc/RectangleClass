import javax.swing.JOptionPane;
import java.util.Scanner;

public class RectangleClass
{
    public static void main(String[]args){
        double width, lenght, area, perimeter;
        String lenghtStr, widthStr, outputStr;
        
        lenghtStr = JOptionPane.showInputDialog("Enter the lenght: ");
        lenght = Double.parseDouble(lenghtStr);
        
        widthStr = JOptionPane.showInputDialog("Enter the widht: ");
        width = Double.parseDouble(widthStr);
        
        area = lenght*width;
        perimeter = 2*(lenght + width);
        
        outputStr = "Lenght : " + lenght + "\n"+
                    "Width : " + width + "\n"+
                    "Area : " + area + "\n" +
                    "Perimeter : " +perimeter+ "\n";   //Şu "\n" alt satıra geçirmek için kullanılır
                    
        JOptionPane.showMessageDialog( null, outputStr, "Rectangle", JOptionPane.WARNING_MESSAGE);
    }
}
