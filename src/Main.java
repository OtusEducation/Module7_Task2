/*
Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
символов * со сторонами соответствующей длины;
*/

public class Main {
    public static void main(String[] args) {
        final int size = 5;
        String symb = "*";
        printSquare(size, symb);
    }

    private static void printSquare(int size, String symb) {
        int num = 0;
        while (num < size) {
            if (num == 0 || num == size - 1) {
                for (int i = 0; i < size; i++) {
                    System.out.print(symb + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        System.out.print(symb + " ");
                    } else if (i == size - 1) {
                        System.out.print(symb + "\n");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            num++;
        }
    }
}