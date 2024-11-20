import java.util.Scanner;

public class Example61 {
    static int SIZE = 3;  // Size of the matrix
    static int[][] A = new int[SIZE][SIZE];  // Declare a 2D array

    public Example61(Scanner input){
        // Fill the matrix with user input
        System.out.println("Enter the elements of the matrix (" + SIZE + "x" + SIZE + "):");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                A[i][j] = input.nextInt();
            }
        }


        // Menu options and loop to repeat until exit (choice 10)
        int SELECT = 0;
        while (SELECT != 10) {
            System.out.println("\nOptions:");
            System.out.println("1. Check if the matrix is a Binary matrix");
            System.out.println("2. Check if the matrix is an Arrowhead matrix");
            System.out.println("3. Check if the matrix is a Diagonal matrix");
            System.out.println("4. Check if the matrix is an Identity matrix");
            System.out.println("5. Check if the matrix is an Integer matrix");
            System.out.println("6. Check if the matrix is a Nonnegative matrix");
            System.out.println("7. Check if the matrix is a Permutation matrix");
            System.out.println("8. Check if the matrix is a Symmetric matrix");
            System.out.println("9. Press 10 to exit");

            System.out.print("Please choose an operation: ");
            int CHOICE = input.nextInt();

            // Selection of desired operation
            switch (CHOICE) {
                case 1:
                    Binary();
                    break;
                case 2:
                    Arrowhead();
                    break;
                case 3:
                    Diagonal();
                    break;
                case 4:
                    Identity();
                    break;
                case 5:
                    Integer();
                    break;
                case 6:
                    Nonnegative();
                    break;
                case 7:
                    Permutation();
                    break;
                case 8:
                    Symmetric();
                    break;
                case 10:
                    SELECT = 10;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
     

    // Method to check if matrix is Binary (0, 1) matrix
    public static void Binary() {
        System.out.println("Checking if the matrix is a Binary matrix (0, 1):");
        boolean isBinary = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (A[i][j] != 0 && A[i][j] != 1) {
                    isBinary = false;
                    break;
                }
            }
        }
        if (isBinary) {
            System.out.println("It is a Binary matrix.");
        } else {
            System.out.println("It is not a Binary matrix.");
        }
    }

    // Method to check if matrix is Arrowhead
    public static void Arrowhead() {
        System.out.println("Checking if the matrix is an Arrowhead matrix:");
        boolean isArrowhead = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (A[i][j] != 0 && (i != 0 && j != 0 && i != j)) {
                    isArrowhead = false;
                    break;
                }
            }
        }
        if (isArrowhead) {
            System.out.println("It is an Arrowhead matrix.");
        } else {
            System.out.println("It is not an Arrowhead matrix.");
        }
    }

    // Method to check if matrix is Diagonal
    public static void Diagonal() {
        System.out.println("Checking if the matrix is a Diagonal matrix:");
        boolean isDiagonal = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i != j && A[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
        }
        if (isDiagonal) {
            System.out.println("It is a Diagonal matrix.");
        } else {
            System.out.println("It is not a Diagonal matrix.");
        }
    }

    // Method to check if matrix is Identity
    public static void Identity() {
        System.out.println("Checking if the matrix is an Identity matrix:");
        boolean isIdentity = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && A[i][j] != 1 || i != j && A[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }
        if (isIdentity) {
            System.out.println("It is an Identity matrix.");
        } else {
            System.out.println("It is not an Identity matrix.");
        }
    }

    // Method to check if matrix is Integer
    public static void Integer() {
        System.out.println("Checking if the matrix is an Integer matrix:");
        boolean isInteger = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (A[i][j] != (int) A[i][j]) {
                    isInteger = false;
                    break;
                }
            }
        }
        if (isInteger) {
            System.out.println("It is an Integer matrix.");
        } else {
            System.out.println("It is not an Integer matrix.");
        }
    }

    // Method to check if matrix is Nonnegative
    public static void Nonnegative() {
        System.out.println("Checking if the matrix is a Nonnegative matrix:");
        boolean isNonnegative = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (A[i][j] < 0) {
                    isNonnegative = false;
                    break;
                }
            }
        }
        if (isNonnegative) {
            System.out.println("It is a Nonnegative matrix.");
        } else {
            System.out.println("It is not a Nonnegative matrix.");
        }
    }

    // Method to check if matrix is Permutation
    public static void Permutation() {
        System.out.println("Checking if the matrix is a Permutation matrix:");
        boolean isPermutation = true;
        for (int i = 0; i < SIZE; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < SIZE; j++) {
                rowSum += A[i][j];
                colSum += A[j][i];
            }
            if (rowSum != 1 || colSum != 1) {
                isPermutation = false;
                break;
            }
        }
        if (isPermutation) {
            System.out.println("It is a Permutation matrix.");
        } else {
            System.out.println("It is not a Permutation matrix.");
        }
    }

    // Method to check if matrix is Symmetric
    public static void Symmetric() {
        System.out.println("Checking if the matrix is a Symmetric matrix:");
        boolean isSymmetric = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (A[i][j] != A[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) {
            System.out.println("It is a Symmetric matrix.");
        } else {
            System.out.println("It is not a Symmetric matrix.");
        }    
    }
}
