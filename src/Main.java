public class Main {

    public static void main(String[] args) {

        // ex. 1
        //simpleCalculator(1, 3, 4);


        // ex. 2
/*      comparisonTwoDigits(1, 2, 3);
        comparisonTwoDigits(21, 2, 43);
        comparisonTwoDigits(10, 12, 3);
        comparisonTwoDigits(4, 12, 5);*/

        // ex. 3
/*      System.out.println("The number=3 is even number = " + isEvenNumber(3));
        System.out.println("The number=4 is even number = " + isEvenNumber(4));*/

        // ex. 4
        //showAllFourDigitsNumbers();

        // ex. 5
        //sortNumbersAscending(2, 1, 8);

        // ex. 6
        //areaAndCircuitOfFigure(3,4);

        //ex. 7
/*        calculateX0OfQuadraticEquation(1,2,-3);
        calculateX0OfQuadraticEquation(1,2,1);
        calculateX0OfQuadraticEquation(2,-1,8);*/

        //ex. 8
        //exerciseNumber8();

        //ex. 9
        //createTableWithFirst10EvenNumbers();

        //ex. 10
        //averageFromTheTable(new double[] {4,6,8});

        //ex. 11
        //findMinAndMax(new double[]{2, 3, 1, -1, 4, 0});
    }

    //ex. 1
    public static void simpleCalculator(double a, double b, double c) {
        System.out.println("(a+b)*c= " + (a + b) * c);
        System.out.println("(a-b)/c= " + (a - b) * c);
        System.out.println("a+b/c= " + (a + (b / c)));

        a++;
        b++;
        c++;
        System.out.println("Po inkrementacji:");

        System.out.println("(a+b)*c= " + (a + b) * c);
        System.out.println("(a-b)/c= " + (a - b) * c);
        System.out.println("a+b/c= " + (a + (b / c)));
    }

    //ex. 2
    public static void comparisonTwoDigits(int a, int b, int c) {
        if (a + b > c) {
            System.out.println("Równanie " + a + "+" + b + ">" + c + " jest prawdziwe");

            if (a == b) {
                System.out.println(a + " jest równe " + b);
            } else {
                System.out.println(a + " nie jest równe " + b);
            }
        } else {
            System.out.println("Równanie " + a + "+" + b + ">" + c + " nie jest prawdziwe");

            if (a == b) {
                System.out.println(a + " jest równe " + b);
            } else {
                System.out.println(a + " nie jest równe " + b);
            }
        }
    }

    //ex. 3
    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ex. 4
    public static void showAllFourDigitsNumbers() {
        int number = 1000;
        while (String.valueOf(number).length() < 5) {
            System.out.println(number);
            number += 3;
        }
    }

    //ex. 5
    public static void sortNumbersAscending(int a, int b, int c) {

        //Bubble sort
        int table[] = new int[]{a, b, c};
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }

    // ex. 6
    public static void areaAndCircuitOfFigure(double a, double b) {
        double area = 0.5 * a * b;
        double circuit = a + b + Math.sqrt(a * a + b * b);

        System.out.println("Pole wynosi: " + area + "\n" + " natomiast obwód: " + circuit);
    }

    // ex. 7
    public static void calculateX0OfQuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Nie ma miejsc zerowych" + "\n");
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("Miejsce zerowe to: " + x0 + "\n");
        } else {
            double x0 = (-b - Math.sqrt(delta)) / (2 * a);
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Miejsce zerowe x0 to: " + x0 + "\n");
            System.out.println("Miejsce zerowe x1 to: " + x1 + "\n");
        }

    }

    // ex. 8
    public static void exerciseNumber8() {
        int table[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("Table at start:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
        System.out.println("Table at end:");
        for (int i = 0; i < table.length; i++) {
            table[i] += 5;
            System.out.println(table[i]);
        }
    }

    // ex. 9
    public static void createTableWithFirst10EvenNumbers() {
        int evenNumbersTable[] = new int[10];
        int numberToCheck = 0;
        int i = 0;
        while (i < 10) {
            if (numberToCheck % 2 == 0) {
                evenNumbersTable[i] = numberToCheck;
                i++;
                numberToCheck++;
            } else {
                numberToCheck++;
            }
        }
        System.out.println("test");
        for (int j = 0; j < evenNumbersTable.length; j++) {
            System.out.print(evenNumbersTable[j] + ",");
        }
    }

    // ex. 10
    public static void averageFromTheTable(double[] tab) {

        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        double result = sum / tab.length;

        System.out.println("Średnia to: " + result);

    }

    public static void findMinAndMax(double[] tab) {
        double min = tab[0];
        double max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
            if (max < tab[i]) {
                max = tab[i];
            }
        }

        System.out.println("Minimum to: " + min + " max to: " + max);
    }
}
