import ec.edu.espe.matrixutils.MatrixUtils;
import java.util.Scanner;

/**
 *
 * @author
 */
public class MatrixApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int cols;
        
        System.out.println("Enter the matrix dimensions (mxn): ");
        System.out.println();
        
        System.out.print("enter the rows: ");
        rows = input.nextInt();
        input.nextLine();
        
        System.out.print("enter the columns: ");
        cols = input.nextInt();
        input.nextLine();
        
        System.out.println();
        
        float a[][] = MatrixUtils.readMatrixElements(rows, cols, "A", input);
        float b[][] = MatrixUtils.readMatrixElements(rows, cols, "B", input);
        float c[][] = MatrixUtils.add(a, b);
        
        System.out.println();
        System.out.println("matrix A: ");
        MatrixUtils.prettyPrintMatrix(a);
        
        System.out.println();
        System.out.println("matrix B: ");
        MatrixUtils.prettyPrintMatrix(b);
        
        System.out.println();
        System.out.println("The addition of matrix A and B equals to: ");
        MatrixUtils.prettyPrintMatrix(c);
        
        c = MatrixUtils.substract(a, b);
        
        System.out.println();
        System.out.println("The substraction of matrix A and B equals to: ");
        MatrixUtils.prettyPrintMatrix(c);
        
        c = MatrixUtils.multiply(a, b);
        
        System.out.println();
        System.out.println("The product of matrix A and B equals to: ");
        MatrixUtils.prettyPrintMatrix(c);
    }
    
}
