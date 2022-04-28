package Lesson3;

import java.util.Random;
import java.util.Scanner;


public class HomeWork_Lesson3 {
    public static void main(String[] args) {
        System.out.println(16/5);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        /*Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        System.out.println(salary + 5000);*/

        //Задача №1
        // Задаем целочисленный массив, состоящий из элементов 0 и 1
        // при помощи вспомогательного метода getNumbers,
        int[] newArray = getNumbers(8);

        //Выводим в консоль полученный массив, при помощи вспомогательного метода printArray
        printArray(newArray);

        //В полученном массиве заменяем 0 на 1, 1 на 0
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                newArray[i] = 1;
            } else {
                newArray[i] = 0;
            }
        }
        //Выводим в консоль результат, при помощи вспомогательного метода printArray
        printArray(newArray);

        //Задача 2. Задаем пустой целочисленный массив длиной 100
        int[] arrayTask2 = new int[100];

        //С помощью цикла заполняем его значениями 1 2 3 4 5 6 7 8 … 100
        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = i + 1;
        }
        //Выводим в консоль результат, при помощи вспомогательного метода printArray
        printArray(arrayTask2);

        //Задача 3. Задаем массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        //Выводим в консоль результат, при помощи вспомогательного метода printArray
        printArray(arrayTask3);

        //Проходим по нему циклом, и числа меньшие 6 умножаем на 2
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] *= 2;
            }
        }

        //Выводим в консоль результат, при помощи вспомогательного метода printArray
        printArray(arrayTask3);

        //Задача 4. Создать квадратный двумерный целочисленный массив и диагональные элементы заполняем единицами
        int n = getRandomValue(0,20);
        int[][] table = new int[n][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j || i + j == table.length - 1) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
            }
        }
        //Выводим в консоль результат, при помощи вспомогательного метода print2DArray
        print2DArray(table);

        //Задача 5. Получаем одномернный массив при помощи вспомогательного метода getArray1D
        // и выводим в консоль при помощи вспомогательного метода printArray
        printArray(getArray1D(6, 777));

        //Задача 6. Задаем одномерный массив и находим в нем минимальный и максимальный элементы
        int[] arrayTask6 = new int[getRandomValue(5, 10)];
        for (int i = 0; i < arrayTask6.length; i++) {
            arrayTask6[i] = getRandomValue(-100, 100);
        }

        //Выводим в консоль результат, при помощи вспомогательного метода printArray
        printArray(arrayTask6);

        //Находим минимальное и максимальное число в массиве
        int nMin = arrayTask6[0];
        int nMax = arrayTask6[0];

        for (int j : arrayTask6) {
            if (j > nMax) {
                nMax = j;
            }
            if (j < nMin) {
                nMin = j;
            }
        }
        //Выводим в консоль результат
        System.out.println("Минимальное число в массиве arrayTask6: " + nMin);
        System.out.println("Максимальное число в массиве arrayTask6: " + nMax);

        //Задача 7. Проверяем есть ли в массиве место, в котором сумма левой и правой части равны
        // при помощи метода checkBalance

        int[] arrayTask7 = {1, 10, 5, 1, 1, 2, 2};
        System.out.println(checkBalance(arrayTask7));


    }

    public static int[] getNumbers(int quantity) {
        int[] array = new int[quantity];
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            array[i] = random.nextInt(2);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr) {
        //for (int i = 0; i <= arr[0].length; i++) {
        //System.out.print(i + " ");
        //}
        //System.out.println();
        for (int[] ints : arr) {
            //System.out.print(i + 1 + " ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[] getArray1D(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;

    }

    public static int getRandomValue(int lowBound, int upBound) {
        Random random = new Random();
        return random.nextInt(upBound - lowBound) + lowBound;

    }

    public static boolean checkBalance (int[] array){
        int sumLeft = 0;
        int sumRight;
        for (int i=0; i<array.length; i++){
            sumLeft +=array[i];
            sumRight = 0;
            for (int j = i+1; j<array.length; j++){
                sumRight += array[j];
            }
            if (sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }


}
