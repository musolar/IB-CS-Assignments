import java.util.*;

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
            case 40:
                Example40();
                break;
            case 41:
                Example41();
                break;
            case 42:
                Example42();
                break;
            case 43:
                Example43();
                break;
            case 44:
                Example44();
                break;
            case 45:
                Example45();
                break;
            case 46:
                Example46();
                break;
            case 47:
                Example47();
                break;
            case 48:
                Example48();
                break;
            case 49:
                Example49();
                break;
            case 50:
                Example50();
                break;
            case 51:
                Example51();
                break;
            case 52:
                Example52();
                break;
            case 53:
                Example53();
                break;
            case 54:
                Example54();
                break;
            case 55:
                Example55();
                break;
            case 56:
                Example56();
                break;
            case 57:
                Example57();
                break;
            case 58:
                Example58();
                break;
            case 59:
                Example59();
                break;
            case 60:
                Example60();
                break;
            case 61:
                Example61();
                break;
            case 62:
                Example62();
                break;
            case 63:
                Example63();
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
        input.nextLine(); // to clear newline

        int[] ARRAY = new int[length];

        if (length % 2 == 0) {
            System.out.println("Works only with odd numbers (eg 3 5 7.....)");
        } else {
            for (int i = 0; i < length; i++){
                System.out.println("Enter the next element");
                ARRAY[i] = input.nextInt();
                input.nextLine(); // to clear newline
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
        Vehicle Vehicle1 = new Vehicle("red", "car", 2000);
        Vehicle Vehicle2 = new Vehicle("green", "bus", 4000);
        Vehicle Vehicle3 = new Vehicle("blue", "motorcycle", 800);

        Vehicle[] Vehicles = {Vehicle1, Vehicle2, Vehicle3};
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
        if (PASSWORD.equals(ANSWER)) {
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
        int MAX = 10;
        int SUM = 0; 
        int COUNT = 0;

        for( COUNT = 0; COUNT <= MAX - 4; COUNT++) { 
            if (COUNT == 0 && MAX > 0){
                System.out.println("HELLO");
            } else if (COUNT < 4) {
                System.out.println("Go for it");
            } else {
                System.out.println("OK");
            }
        }
            SUM += COUNT; 

            System.out.println(" Total = " + SUM);
            System.out.println(" MAX = " + COUNT);
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
      
        String ARRAY1[] = {"aa", "11", "34", "ff", "mm"};
        String ARRAY2[] = {"ff", "hh", "mn", "33", "34"};
   
        System.out.println("The following items appear in both arrays");

        for (int A1 = 0; A1 < ARRAY1.length; A1++) {
            for (int A2 = 0; A2 < ARRAY1.length; A2++) {
                if (ARRAY1[A1] == ARRAY2[A2]) {
                    //System.out.println(ARRAY2[A1]); // ERROR
                    System.out.println(ARRAY2[A2]);
                }
            }
        }
    }


    public static void Example32() {
        int i = 0;
        boolean ascending = true;
        boolean descending = true;
        int[] sample = new int[5];
        for (i = 0; i < sample.length; i++) {
            System.out.println("Enter the measurement");
            sample[i] = input.nextInt();
        }
        input.nextLine(); // to clear newline

        for (i = 0; i < sample.length - 1; i++) {
            if (sample[i] > sample[i + 1]) {
                ascending = false;
            } else if (sample[i] < sample[i + 1]) {
                descending = false;
            }
        }

        System.out.println("The array is:");
        for (i = 0; i < sample.length; i++) {
            System.out.println(sample[i]);
        }

        if (ascending) {
            System.out.println("The array is sorted in ASCENDING order.");
        } else {
            System.out.println("The array is not sorted in ASCENDING order.");
        }
        if (descending) {
            System.out.println("The array is sorted in DESCENDING order.");
        } else {
            System.out.println("The array is not sorted in DESCENDING order.");
        }
    }

    public static void Example33() {
        int n;
        int[] randomNums = new int[10];

        for (n = 0; n < randomNums.length; n++) {
            randomNums[n] = (int) (Math.random() * 10);
        }

        for (n = 0; n < randomNums.length; n++) {
            System.out.println(randomNums[n]);
        }
    }

    public static void Example34() {
        int n;
        n = 0;
        int m;
        m = n + 3;
        while (n <= 2) {
            while (m < 10) {
                m = 13 - 3;
                System.out.println(n + 2);
                System.out.println("m=" + m);
            }
            System.out.println("0K");
            n++;
        }
        System.out.println("m=" + m + " n=" + n);
        if (m > n) {
            System.out.println("n=" + n);
        } else {
            System.out.println(m < n);
        }
        System.out.println(n);
    }

    public static void Example35() {
        int[] array = {-30, -13, 4, -3, -30, -3, -3, -3, -15};
        for (int i=0; i < array.length - 1; i++) {
            for (int j=0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        int prev = array[0];
        int count = 1;

        for (int i=1; i < array.length; i++) {
            if (array[i] == prev) {
                count++;
                if (i == array.length - 1) {
                    System.out.println("Number: " + array[i] + ", frequency: " + count);
                }
            } else {
                System.out.println("Number: " + array[i - 1] + ", frequency: " + count);
                prev = array[i];
                count = 1;
                if (i == array.length - 1) {
                    System.out.println("Number: " + array[i] + ", frequency: " + count);
                }
            }
        }
    }

    public static void Example36() {

        int n = 5; //input
        int sum = 0; //output

        // algorithm A (executes in O(1))
        {
            sum = n * (n + 1) / 2;
        }
        System.out.println("The SUM is: " + sum);

        // algorithm B (executes in O(N))
        {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        System.out.println("The SUM is: " + sum);

        // algorithm C (executes in O(N^2))
        {
            for (int i = 1; i <= n; i++) {
                for (int m = 1; m <= i; m++) {
                    sum++;
                }
            }
        }
        System.out.println("The SUM is: " + sum);
    }


    public static void Example40(){

        int MAX = 0; 

        System.out.println(" Enter four integers");

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        
         MAX = A;
        if ( B > MAX ){
            MAX = B; 
        } else if ( C > MAX ) { 
            MAX = C; 
        } else if ( D > MAX ) { 
            MAX = D; 
        }
        
  System.out.println("Maximum number is " + MAX);

    }

    public static void Example41(){
     
    {
        System.out.println(" Enter two Postitive Integers  ");
        
        int A = input.nextInt();
        int B = input.nextInt();

         // Variables for quotient and remainder
        int r = A;
        int Q = 0;  

        // Loop to find quotient and remainder 
        while (r >= B) {
            r = r - B;  // Subtract b from r
            Q = Q + 1;  // Increment quotient
        }

        // Output the quotient and remainder
        System.out.println("Quotient: " + Q + " Remainder: " + r);

    }
      {
        System.out.println(" Enter two positive integers ");

        int A = input.nextInt();
        int B = input.nextInt();
        
        // Calculate quotient and remainder
        int q = A / B;
        int r = A % B;
        
        System.out.println("Quotient: " + q + " Remainder: " + r);
       } 
    }

    public static void Example42(){
        System.out.println("Enter command <encrypt|decrypt>");
        String command = input.nextLine();
        if (command.equals("encrypt")) {
            
            System.out.println("Enter a number to be encrypted (max 18 digits)");
            long num = input.nextInt();
            input.nextLine();

            long[] digits = new long[("" + num).length()];
            
            // extract digits
            for (int i=0; i < digits.length; i++) {
                digits[i] = (long) ((num % Math.pow(10, digits.length - i)) / Math.pow(10, digits.length - (i + 1)));
            }

            // change digits
            for (int i=0; i < digits.length; i++) {
                digits[i] = (digits[i] + 5) % 10;
            }

            // reverse digits
            for (int i=0; i < (digits.length / 2); i++) {
                long temp = digits[i];
                digits[i] = digits[digits.length - i];
                digits[digits.length - i] = temp;
            }

            // construct encrypted output
            long encrypted = 0;
            for (int i=0; i < digits.length; i++) {
                encrypted += (digits[i] + Math.pow(10, digits.length - (i + 1)));
            }

            System.out.println("Encrypted number is:");
            System.out.println(encrypted);

        } else if (command.equals("decrypt")) {
            
            System.out.println("Enter a number to be encrypted (max 18 digits)");
            long encrypted = input.nextInt();
             input.nextLine();
            long[] digits = new long[("" + encrypted).length()];
            
            // extract digits
            for (int i=0; i < digits.length; i++) {
                digits[i] = (long) ((encrypted % Math.pow(10, digits.length - i)) / Math.pow(10, digits.length - (i + 1)));
            }

            // reverse digits
            for (int i=0; i < (digits.length / 2); i++) {
                long temp = digits[i];
                digits[i] = digits[digits.length - i];
                digits[digits.length - i] = temp;
            }

            // change digits
            for (int i=0; i < digits.length; i++) {
                digits[i] = (digits[i] + 5) % 10;
            }

            // construct encrypted output
             long decrypted = 0;
             for (int i=0; i < digits.length; i++) {
                decrypted += (digits[i] + Math.pow(10, digits.length - (i + 1)));
             }
 
             System.out.println("Decrypted number is:");
             System.out.println(decrypted);
            }
        } 
    
    public static void Example43(){

         final double Pi = 3.1415926535;

        // Initialize variables
        double ratio = 0, area;

        // Loop to calculate the area of the circle
        while (ratio != 999) {
           
            System.out.println("Enter the radius of the circle. Enter 999 to exit: ");
            ratio = input.nextDouble();

            // Exit condition
            if (ratio == 999) {
                System.out.println("See you!");
                break;  // Exit the loop
            } else {
                // Calculate the area of the circle
                area = Pi * ratio * ratio;

                System.out.println("Area: " + area);
            }
        }
    }

    public static void Example44(){
        int n = 0;
        while (n < 2) {
            System.out.println("OK");
            n++;
            int m = n + 1;
            System.out.println("INSIDE LOOP");
            System.out.println(n);
            System.out.println(m);
        System.out.println("OUTSIDE LOOP");
        System.out.println(n);
        // System.out.println(m); => Error: m does not exist outside the loop

      }

   } 

    public static void Example45(){
       //Declares the integer Year
        int year = 0;
        
        // Loop to keep asking for the year until user enters -999
        while (year != -999) {
            // Prompt user to enter a year
            System.out.println("Enter the year. Enter -999 to exit: ");
            year = input.nextInt();
            
            // Exit condition
            if (year == -999) {
                System.out.println("See you!");
                break;  // Exit the loop
            } else {
                // Check if the year is a leap year
                boolean isLeap = false;
                if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                    isLeap = true;
                }
                
                // Output whether it's a leap year or not
                if (isLeap) {
                    System.out.println("Year " + year + " is a leap year.");
                } else {
                    System.out.println("Year " + year + " is not a leap year.");
                }
            }
        }
        
    }

    public static void Example46(){
           int row;

        // Top part of the diamond
        for (row = 1; row <= 5; row++) {
            // Print leading spaces
            for (int space = 1; space <= 5 - row; ++space) {
                System.out.print(' ');
            }

            // Print # symbols
            for (int symbol = 1; symbol <= 2 * row - 1; ++symbol) {
                System.out.print('#');
            }

            // Move to the next line
            System.out.print('\n');
        }

        // Bottom part of the diamond
        for (row = 4; row >= 1; row--) {
            // Print leading spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(' ');
            }

            // Print # symbols
            for (int symbol = 1; symbol <= 2 * row - 1; symbol++) {
                System.out.print('#');
            }

            // Move to the next line
            System.out.print('\n');
        }
    }

    public static void Example47(){
        Collection<String> surnames = new ArrayList<String>();
        surnames.add("Pappas");
        surnames.add("Percy");
        surnames.add("Brox");
        System.out.println("These names start with \"P\"");
        Iterator<String> iter = surnames.iterator();
        while (iter.hasNext()) {
            String surname = iter.next();
            if (surname.substring(0, 1).equals("P")) {
                System.out.println(surname);
            }
        }
    }

    public static <Vehicle> void Example48(){
         // Create vehicles
        Vehicle vehicle1 = new Vehicle("red", "car", 2000);
        Vehicle vehicle2 = new Vehicle("green", "bus", 4000);
        Vehicle vehicle3 = new Vehicle("blue", "motorcycle", 800);

        // Create a collection of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        // Output the message
        System.out.println("This Vehicle is a bus");

        // Loop through the collection
        for (Vehicle vehicle : vehicles) {
            if (vehicle.Type.equals("bus")) {
                System.out.println(vehicle);
            }
        }
    }

    public static void Example49(){
          // Arrays for absences on Monday and Tuesday
        String[] monday = {"Tom", "John", "Mary", "Bob"};
        String[] tuesday = {"Bob", "Tom", "Eri"};

        // Initialize the count
        int x = 0;

        // Create a collection for absences
        Collection<String[]> absences = new ArrayList<>();
        absences.add(monday);
        absences.add(tuesday);
        // Iterate over each array of absences

        for (String[] array1 : absences) {
            // Get the next array of absences
            // Loop through the names in the current array
            for (String array11 : array1) {
                if (array11.equals("Bob")) {
                    x++;  // Increment count if "Bob" is found
                }
            }
        }

        // Output the result
        System.out.println("Bob found " + x + " times");
    }

    

    public static void Example50(){
        String original_string, reverse_string = "";
        // Prompt the user to enter a string
       System.out.println("Type a string to check if it is a palindrome or not:");
       original_string = input.nextLine();

       int Stringlength = original_string.length();

       // Loop to reverse the string
       for (int i = Stringlength - 1; i >= 0; i--) {
           reverse_string = reverse_string + original_string.charAt(i);
       }

       // Checks if original string is equal to the reversed string
       if (original_string.equals(reverse_string)) {
           System.out.println("The string entered is a palindrome.");
       } else {
           System.out.println("The string entered is not a palindrome.");
       }
    }

    public static void Example51(){
        System.out.println("null");
        
        System.out.println("Enter an integer");
        
        int number = input.nextInt();
        input.nextLine();
        System.out.println("The reverse of " + number + " is " + findReverse(number));
    }

    public static int findReverse(int number) {
        int reverse = 0;
        int palindrome = number;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = (reverse * 10) + remainder;
            palindrome /= 10;
        }
        return reverse;
    }

    public static void Example52(){
        System.out.println("Enter the number to check");
        int palindrome = input.nextInt();
        input.nextLine();

        if (findReverse(palindrome) == palindrome) {
            System.out.println("" + palindrome + " is a palindrome.");
        } else {
            System.out.println("" + palindrome + " is not a palindrome.");
        }
    }

    public static void Example53(){
        
    }

    public static void Example54(){
        
    }

    public static void Example55(){
        
    }

    public static void Example56(){
        
    }

    public static void Example57(){
        
    }

    public static void Example58(){
        
    }

    public static void Example59(){
        
    }

    public static void Example60(){
        
    }

    public static void Example61(){
        
    }

    public static void Example62(){
        
    }

    public static void Example63(){

    }
    
}