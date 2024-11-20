public class LakeTemp{

    
    // Method to print the 2D array
    public static void printTwoDArray(int[][] TDarray) {
        for (int[] TDarray1 : TDarray) {
            for (int time = 0; time < TDarray1.length; time++) {
                  System.out.printf("%7d", TDarray1[time]);
            }
                  System.out.println();
        }
    }

    // Method to calculate the sum of temperatures for each date
    public static void SumDate(int[][] TDarray) {
        for (int date = 0; date < TDarray.length; date++) {
            int sum = 0;
            for (int time = 0; time < TDarray[date].length; time++) {
                sum += TDarray[date][time];
            }
            System.out.println("The sum of the temperatures for date " + (date + 1) + " = " + sum);
        }
    }

    // Method to calculate the average temperature for each date
    public static void AvDate(int[][] TDarray) {
        for (int date = 0; date < TDarray.length; date++) {
            int sum = 0;
            for (int time = 0; time < TDarray[date].length; time++) {
                sum += TDarray[date][time];
            }
            int average = sum / TDarray[date].length;
            System.out.println("The average temperature for date " + (date + 1) + " = " + average);
        }
    }

    // Method to calculate the sum of temperatures for each time period (across all dates)
    public static void SumTime(int[][] TDarray) {
        for (int time = 0; time < TDarray[0].length; time++) {
            int sum = 0;
            for (int[] TDarray1 : TDarray) {
               sum += TDarray1[time];
            }
            System.out.println("The sum of the temperatures for time " + (time + 1) + " = " + sum);
        }
    }

    // Method to calculate the average temperature for each time period (across all dates)
    public static void AvTime(int[][] TDarray) {
        for (int time = 0; time < TDarray[0].length; time++) {
            int sum = 0;
            for (int date = 0; date < TDarray.length; date++) {
                sum += TDarray[date][time];
            }
            int average = sum / TDarray.length;
            System.out.println("The average temperature for time " + (time + 1) + " = " + average);
        }
    }

    // Method to find the maximum temperature for each date
    public static void MaxDate(int[][] TDarray) {
        for (int date = 0; date < TDarray.length; date++) {
            int maximum = TDarray[date][0];
            for (int time = 1; time < TDarray[date].length; time++) {
                if (TDarray[date][time] > maximum) {
                    maximum = TDarray[date][time];
                }
            }
            System.out.println("The maximum temperature for date " + (date + 1) + " = " + maximum);
        }
    }

    // Method to find the maximum temperature for each time period
    public static void MaxTime(int[][] TDarray) {
        for (int time = 0; time < TDarray[0].length; time++) {
            int maximum = TDarray[0][time];
            for (int date = 1; date < TDarray.length; date++) {
                if (TDarray[date][time] > maximum) {
                    maximum = TDarray[date][time];
                }
            }
            System.out.println("The maximum temperature for time " + (time + 1) + " = " + maximum);
        }
    }

    // Method to find the minimum temperature for each date
    public static void MinDate(int[][] TDarray) {
        for (int date = 0; date < TDarray.length; date++) {
            int minimum = TDarray[date][0];
            for (int time = 1; time < TDarray[date].length; time++) {
                if (TDarray[date][time] < minimum) {
                    minimum = TDarray[date][time];
                }
            }
            System.out.println("The minimum temperature for date " + (date + 1) + " = " + minimum);
        }
    }

    // Method to find the minimum temperature for each time period
    public static void MinTime(int[][] TDarray) {
        for (int time = 0; time < TDarray[0].length; time++) {
            int minimum = TDarray[0][time];
            for (int date = 1; date < TDarray.length; date++) {
                if (TDarray[date][time] < minimum) {
                    minimum = TDarray[date][time];
                }
            }
            System.out.println("The minimum temperature for time " + (time + 1) + " = " + minimum);
        }
    }

    // Method to calculate the overall average temperature
    public static void AvAll(int[][] TDarray) {
        int sum = 0;
        int totalElements = 0;

        // Iterate through each day (rows)
        for (int[] TDarray1 : TDarray) {
            // Iterate through each time (columns)
            for (int time = 0; time < TDarray1.length; time++) {
                sum += TDarray1[time]; // Add the temperature to the sum
                totalElements++;  // Count the total number of elements
            }
        }

        // Calculate the average temperature
        int average = sum / totalElements;

        // Print the overall average temperature
        System.out.println("The overall average temperature is: " + average);
    }
}