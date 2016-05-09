/*
 * Simple activity that searches minimum and maximum values on the numbers entered using function and for loop (no math built-in function).
 */
package searchminmax;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class SearchMinMax {
    public static void main (String args[]){
        int in, i, count;
        String a = " ", b = " ";
        
        a = JOptionPane.showInputDialog("Enter your number of inputs: ");
        in = Integer.parseInt(a);
        
        int[] arr = new int[in];
        for (i=0; i<in; i++){
            count = i+1;
            b = JOptionPane.showInputDialog("Enter your value for element " + count + ": ");
            arr[i] = Integer.parseInt(b);
        }       
        JOptionPane.showMessageDialog(null, "Minimum value: " + minimumval(arr, in) + "\nMaximum value: " + maximumval(arr, in));
    }
    public static int minimumval (int n [], int size){
        int i, x = n[0];
        for (i=0; i<size; i++){
            if (n[i]<x)
                x = n[i];            
        }
        return(x);
    }
    public static int maximumval (int n [], int size){
        int i, x = n[0];
        for (i=0; i<size; i++){
            if (n[i]>x)
                x = n[i];            
        }
        return(x);
    }
}
