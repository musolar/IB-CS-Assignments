import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App {

    //This is used to get input from the user.
    static Scanner input = new Scanner(System.in);
    
    // This method runs when the program starts.
    public static void main(String[] args) throws Exception {

        //Select between examples
        System.out.println("Type example number to run.");
        int exampleNum = input.nextInt();
        input.nextLine(); // to clear newline
        
        switch (exampleNum) {
            case 10:
                Example10();
                break;
            case 11:
                Example11();
                break;
            case 12:
                Example12();
                break;
            case 13:
                Example13();
                break;
            case 14:
                Example14();
                break;
            case 15:
                Example15();
                break;
            case 16:
                Example16();
                break;
            case 17:
                Example17();
                break;
            case 18:
                Example18();
                break;
            case 19:
                Example19();
                break;
            case 20:
                Example20();
                break; 
            case 21:
                Example21();
                break;
            case 22:
                Example22();
                break;
            case 23:
                Example23();
                break;
            case 24:
                Example24();
                break;
            case 25:
                Example25();
                break;
            case 26:
                Example26();
                break;
            case 27:
                Example27();
                break;
            case 28:
                Example28();
                break;
            case 29:
                Example29();
                break;
            case 30:
                Example30();
                break;
            case 31:
                Example31();
                break;
            case 32:
                Example32();
                break;
            case 33:
                Example33();
                break;
            case 34:
                Example34();
                break;
            case 35:
                Example35();
                break;
            case 36:
                Example36();
                break;
            default:
                System.out.println("Example not implemented yet.");;
        }

        //Good practice to prevent memory leaks.
        input.close();
    }
    
    public static void Example10() {
        
        //  Example #10
    
        int[] array = new int[10];
        int position = 0;
        while (position <= 9) {
            array[position] = position + 1;
              position = position + 1;
        }
        for (position=0; position <= 9; position++) {
            System.out.println("Array position " + position + " contains the value " + array[position]);
        }
    }
    
    public static void Example11() {   
        
        // Example #11

        System.out.println("Enter the size of the array");
        
        int bkwPos = 0;
        int fwdPos = 0;
        int numMatches = 0;
        int length = input.nextInt();

        int[] ARRAY = new int[length];

        if (length % 2 == 0) {
            System.out.println("Works only with odd numbers (eg 3 5 7.....)");
        } else {
            for (int i = 0; i < length; i++){
                System.out.println("Enter the next element");
                ARRAY[i] = input.nextInt();
            }
            bkwPos = (length / 2) - 1;
            fwdPos = (length / 2) + 1;
            while (bkwPos >= 0 && fwdPos < length) {
                if (ARRAY[bkwPos] == ARRAY[fwdPos]) {
                    numMatches++;
                }   
                bkwPos--;
                fwdPos++; 
            }
            if (numMatches == (length - 1) / 2 ) {
                System.out.println("Array is symmetric");      
            } else {
                System.out.println("Array is not symmetric");
            }
        }

    }

    public static void Example12(){

        // Example #12

        int[] A = {5, 1, 4, 7, 9, -12};
        int SIZE = 6;
        int MINIMUM = Math.abs(A[0] - A[1]);
        int MININDEX = 0; 
        
        for (int I = 1; I <= SIZE -2; I++){
            if (Math.abs(A[I] - A[I + 1]) < MINIMUM) {
                MINIMUM = Math.abs(A[I] - A[I + 1]);
                MININDEX = I;
            }
        }
        System.out.println("DISTANCE " + MINIMUM + " BETWEEN ELEMENT " + MININDEX + " AND ELEMENT " + (MININDEX + 1) );
    }

    public static void Example13() {
        // Example 13 
      
        String[] Names = { "May" , "Eri" , "Elen" , "kit" , "Rate" , "More" , "Epi" , "Ent" , "Renal" , "Bib" };
        int[] Grades =   {  99,     55,     77,      45,     89,      98,      76,     45,     33,       75   };
        int Min = Grades[0];
        int Max = Grades[0];
        int Total = 0;
        int Average = 0;
        int M = 0;
        String Worst = "";
        String Best = "";

         System.out.println("_______________");
         System.out.println(" STUDENTS LIST ");
         System.out.println("_______________");
         
        for (M = 0; M<= 9; M++) {
            if (Grades[M] <= Min ) {
                Min = Grades[M];
                Worst = Names[M];
            }
        }
        
        for (M = 0; M<= 9; M++){
           Total = Total + Grades[M];
             if( Grades[M] >= Max) {
                Max = Grades[M];
                Best = Names[M]; 
             }
        }

        Average = Total/10;
        System.out.println("_________");
        System.out.println(" STATISTICS");
        System.out.println("_________");
        System.out.println("Minimum mark " + Min +  " Student " + Worst);
        System.out.println(" Maximum mark " + Max + " Student " + Best);
        System.out.println(" Class Average " + Average);
        
    }

    public static void Example14() {
        vehicle Vehicle1 = new vehicle("red", "car", 2000);
        vehicle Vehicle2 = new vehicle("green", "bus", 4000);
        vehicle Vehicle3 = new vehicle("blue", "motorcycle", 800);

        vehicle[] Vehicles = {Vehicle1, Vehicle2, Vehicle3};
        for (int I = 0; I <= 2; I++) {
            if (Vehicles[I].Type == "bus") {
                System.out.println("bus found at array position " + I);
            }
        }
    }

    public static void Example15() {
        int[][] TEMP = {
            {10, 11, 12, 13, 10},
            {10, 13, 14, 12, 12},
            {13, 13, 14, 15, 12},
            {16, 17, 17, 17, 16},
            {22, 23, 24, 24, 24},
            {26, 25, 24, 25, 26},
            {29, 28, 26, 27, 26},
            {29, 28, 27, 28, 28},
            {24, 23, 24, 25, 25},
            {20, 21, 22, 23, 24},
            {15, 16, 17, 18, 18},
            {12, 11, 13, 11, 11}
        };
        for (int MONTH = 0; MONTH <= 11; MONTH++) {
            System.out.println(Integer.toString(MONTH + 1) + " Month");
            for (int CITY = 0; CITY <= 4; CITY++) {
                System.out.println("City " + (CITY + 1) + " " + TEMP[MONTH][CITY]);
            }
        }
    }

    public static void Example16() {

        
        int[][] A = {
            {0, 1, 2},
            {2, 3, 4},
            {5, 6, 7}
        };

        int[] LINE1 = new int[3];
        int[] LINE2 = new int[3];
        int[] LINE3 = new int[3];
        int[] COLUMN1 = new int[3];
        int[] COLUMN2 = new int[3];
        int[] COLUMN3 = new int[3];
        int[] DIAGONAL = new int[3];

        int COUNT1 = 0;
        int COUNT2 = 0;
        int COUNT3 = 0;
        int COUNT4 = 0;
        int COUNT5 = 0;
        int COUNT6 = 0;
        int COUNT7 = 0;

        for (int I = 0; I <= 2; I++) {
            for (int J = 0; J <= 2; J++) {
                if (J == 0) {
                    COLUMN1[COUNT1] = A[I][J];
                    COUNT1++;
                } else if (J == 1) {
                    COLUMN2[COUNT2] = A[I][J];
                    COUNT2++;
                } else {
                    COLUMN3[COUNT3] = A[I][J];
                    COUNT3++;
                }
                if (I == J) {
                    DIAGONAL[COUNT4] = A[I][J];
                    COUNT4++;
                }
                if (I == 0) {
                    LINE1[COUNT5] = A[I][J];
                    COUNT5++;
                } else if (I == 1) {
                    LINE2[COUNT6] = A[I][J];
                    COUNT6++;
                } else {
                    LINE3[COUNT7] = A[I][J];
                    COUNT7++;
                }
            }
        }

        System.out.println("LINE1:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(LINE1[I]);
        }

        System.out.println("LINE2:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(LINE2[I]);
        }
        
        System.out.println("LINE3:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(LINE3[I]);
        }
        
        System.out.println("COLUMN1:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(COLUMN1[I]);
        }

        System.out.println("COLUMN2:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(COLUMN2[I]);
        }

        System.out.println("COLUMN3:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(COLUMN3[I]);
        }
        
        System.out.println("DIAGONAL:");
        for (int I = 0; I <= 2; I++) {
            System.out.println(DIAGONAL[I]);
        }
    }

    public static void Example17() {
        //rows=students, columns=lessons
        int[][] array = {
            {85, 72},
            {82, 93},
            {75, 56}

        };
        for(int lesson=0; lesson<=1; lesson++) {
            System.out.println("Next lesson");
            for(int student=0; student<=2; student++) {
                System.out.println("lesson " + lesson + " student " + student + " grade " + array[student][lesson]);
            }
        }
        System.out.println("______");
        for(int student=0; student<=2; student++) {
            System.out.println("Next student");
            for(int lesson=0; lesson<=1; lesson++) {
                System.out.println("Student " + student + " lesson " + lesson + " grade " + array[student][lesson]);
            }
        }
    }

    public static void Example18() {
        int[][] array = {
            {-22,  12, -33},
            { 33,  62,  21},
            { 54,  22,  42}
        };
        int dimension = 3;
        int indexRow = 0;
        int indexColumn = 0;
        String direction = "";
        int minimum = Math.abs(array[0][0] - array[0][1]);
        for (int r=0; r<dimension; r++) {
            for (int c=0; c<dimension - 1; c++) {
                int candidate = Math.abs(array[r][c] - array[r][c+1]);
                if (candidate < minimum) {
                    minimum = candidate;
                    indexRow = r;
                    indexColumn = c;
                    direction = "ROWS";
                }
            }
        }
        for (int c=0; c<dimension; c++) {
            for (int r=0; r<dimension - 1; r++) {
                int candidate = Math.abs(array[r][c] - array[r+1][c]);
                if (candidate < minimum) {
                    minimum = candidate;
                    indexRow = r;
                    indexColumn = c;
                    direction = "COLUMNS";
                }
            }
        }
        System.out.print("Minimum distance " + minimum);
        if (direction == "ROWS") {
            System.out.println(" between elements (" + indexRow + "," + indexColumn + ") and (" + (indexRow + 1) + "," + indexColumn + ")");
        } else {
            System.out.println(" between elements (" + indexRow + "," + indexColumn + ") and (" + indexRow + "," + (indexColumn + 1) + ")");
        }
                 
    }


    public static void Example19() {
        int[] array = {2, 9, 5, 6, 7, 8};
        int target = 7;

        for (int counter = 0; counter<= 5; counter++ ){
            if (array[counter] == target) {
                System.out.println("" + array[counter] + " found at position " + counter);
                return;
            }
        }
        System.out.println("Not found.");
    }


    public static void Example20() {
        int[] values = { 11, 12, 15, 16, 112, 118, 123, 145 };
        int target = 15;
        int lowerBound = 0;
        int upperBound = values.length - 1;
        int midpoint = 0;
        while (lowerBound <= upperBound) {
            midpoint = (lowerBound + upperBound) / 2;
            int current = values[midpoint];
            if (current == target) {
                System.out.println("" + target + " found at array index " + midpoint);
                return;
            } else if (target < current) {
                upperBound = midpoint - 1;
            } else {
                lowerBound = midpoint + 1;
            }
        }
        System.out.println("" + target + " was not found.");
    }

    public static void Example21() { 
        int[] elements = {1, 663, 8, 2 ,4, 1, 22, 66, 20, 122};
        for (int i=0; i<elements.length - 1; i++) {
            for (int j=0; j<elements.length - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted elements: " + Arrays.toString(elements));
        
    }

    public static void Example22() {
        int[] elements = {1, 663, 8, 2, 4, 1, 22, 66, 20, 122};
        for (int i=0; i<elements.length; i++) {
            for (int j=0; j<elements.length - i - 1; j++) {
                if (elements[j] < elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted elements: " + Arrays.toString(elements));
    }

    public static void Example23() {
        int[] elements = {1, 5, 3, 86, 256, 420, 9, 510, 51, 24, 60};

        for (int startPos = 0; startPos < elements.length - 1; startPos++) {
            int max = startPos;
            for (int current = startPos + 1; current < elements.length; current++) {
                if (elements[current] < elements[max]) {
                    max = current;
                }
            }
            int temp = elements[max];
            elements[max] = elements[startPos];
            elements[startPos] = temp;
        }
        System.out.println("Sorted elements: " + Arrays.toString(elements));
    }

    public static void Example24() {
        int totalHigh = 0;
        int totalLow = 0;
        int avgHigh = 0;
        int avgLow = 0;
        String[] cityNames = new String[4];
        int[] highTemps = new int[4];
        int[] lowTemps = new int[4];

        for (int i=0; i<4; i++) {
            System.out.println("Type the name of the city.");
            cityNames[i] = input.nextLine();
            System.out.println("Type maximum temperature of the city.");
            highTemps[i] = input.nextInt();
            System.out.println("Type minimum temperature of the city.");
            lowTemps[i] = input.nextInt();
            input.nextLine(); // to clear remaining newline
            totalHigh += highTemps[i];
            totalLow += lowTemps[i];
        }
        avgHigh = totalHigh / 4;
        avgLow = totalLow / 4;

        System.out.print("Cities below average low: ");
        for (int i=0; i<4; i++) {
            if (lowTemps[i] < avgLow) {
                System.out.print(cityNames[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Cities above average high: ");
        for (int i=0; i<4; i++) {
            if (highTemps[i] > avgHigh) {
                System.out.print(cityNames[i] + " ");
            }
        }

        System.out.println();
    }

    public static void Example25() {
        String ANSWER = "MORGAN";
        String PASSWORD = input.nextLine();
        if (PASSWORD == ANSWER) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }

    public static void Example26() {
        int A;
        int B;
        B = 22;
        for (A = 1; A <= 2; A++) {
            B = A + 15;
        }
        A *= 2;
        System.out.println("VALUE OF A, B--" + A + "," + B);
        if (A < 3) {
            while (A < 10) {
                System.out.println("HELLO");
                A *= 2;
            }
        } else {
            while (A > 7) {
                A -= 5;
            }
            System.out.println("OK");
        }
        int C;
        C = 1;
        while (C < 4) {
            System.out.println("VALUE OF A, B, C--" + A + "," + B + "," + C);
        }
        //END
    }

    public static void Example27() {
        // Version 1
        {
            int n;
            n = 0;
            while (n <= 3) {
                System.out.println("OK");
                n++;
            }
            System.out.println(n);
        }
        //Version 2
        {
            int n;
            for (n=0; n<=3; n++) {
                System.out.println("OK");
            }
            System.out.println(n);
        }

    }

    public static void Example28() {                 // MAX  SUM   COUNT  RES   OUTPUT   
        int MAX = 10;                                // 10   null  null   -             
        int SUM = 0;                                 // 10   0     null   -             
        int COUNT = 0;                               // 10   0     0      -             
                                                     //                                      | MAX  SUM  COUNT  RES    OUTPUT      | MAX  SUM  COUNT  RES    OUTPUT | MAX  SUM  COUNT  RES    OUTPUT      | MAX  SUM  COUNT  RES    OUTPUT      | MAX  SUM  COUNT  RES    OUTPUT
        for (COUNT = 0; COUNT <= MAX - 6; COUNT++) { // 10   0     0      True               | 10   0    1      True               | 10   0    2      True          | 10   0    3      True               | 10   0    4      True               | 10   0    5      False
            if (COUNT == 0 && MAX > 0) {             // 10   0     0      True               | 10   0    1      False              | 10   0    2      False         | 10   0    3      False              | 10   0    4      False              | skip
                System.out.println("Hello");       // 10   0     0      -     "Hello"      | skip             -                  | skip                           | skip                                | skip                                | skip
            } else if (COUNT > 2) {                  // skip                                 | 10   0    1      False              | 10   0    2      False         | 10   0    3      True               | 10   0    4      True               | skip
                System.out.println("Go for it");   // skip                                 | skip             -                  | skip                           | 10   0    3      -      "Go for it" | 10   0    4      -      "Go for it" | skip
            } else {                                 // skip                                 | 10   0    1      True               | 10   0    2      True          | 10   0    3      False              | 10   0    4      False              | skip
                System.out.println("OK");          // skip                                 | 10   0    1      -      "OK"        | 10   0    2      -      "OK"   | skip                                | skip                                | skip
            }                                        // -                                    | -                                   | -                              | -                                   | -                                   | -
        }                                            // 10   0     1      -                  | 10   0    2      -                  | 10   0    3      -             | 10   0    4      -                  | 10   0    5      -                  | skip
        
        SUM += COUNT;                                // 10   5     5      -
        System.out.println("Total = " + SUM);        // 10   5     5      -      "Total = 5"

    }


    public static void Example29() { 
        

        
    }


    public static void Example30() { 
        int FIRST = 14; 
        int SECOND = 12; 

        System.out.println("Common Factors of numbers" + FIRST + "and" + SECOND);

        for (int COUNT = 1; COUNT <= SECOND; COUNT++){
            if (FIRST % COUNT  == 0 && SECOND % COUNT == 0) {
                System.out.println(COUNT);
            }
        }
    }

         // finish it 

    public static void Example31() { 
      
         String A1[] = {"aa", "11", "34", "ff", "mm"};
         String A2[] = {"ff", "hh", "mn", "33", "34"};
   
         System.out.println("The following items appear in both arrays");

         //for ()
    }


    public static void Example32() {

    }

    public static void Example33() {

    }
        

    public static void Example34() {

    }

    public static void Example35() {

    }

    public static void Example36() {

    }
}