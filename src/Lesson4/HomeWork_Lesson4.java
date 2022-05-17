package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_Lesson4 {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {
            humanMakeTurn(field);
            if (isWinner(field, "X")) {
                printField(field);
                System.out.println("X выйграл!");
                break;
            }
            if (isDraw(field)) {
                break;
            }

            //printField(field);
            aiMakeTurn(field);
            printField(field);
            if (isWinner(field, "0")) {
                System.out.println("0 выйграл!");
                break;
            }
            if (isDraw(field)) {
                break;
            }
        }


    }

    //Инициализация игрового поля
    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    //Печать игрового поля
    public static void printField(String[][] field) {
        System.out.println("------------------------------------------");

        for (String[] strings : field) {

            for (int j = 0; j < field[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();

        }
        System.out.println("------------------------------------------");
    }

    //ход игрока
    public static void humanMakeTurn(String[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Сделайте ход");
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if ((x >= 0 && x < field.length) && (y >= 0 && y < field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Поле занято, ходите снова");
                }

            } else {
                System.out.println("За пределами поля, переигрывайте!");
            }
        }

    }

    //ии делает ход
    public static void aiMakeTurn(String[][] field) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (x < field.length && y < field.length) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }
            }
        }
    }

    //проверка победы
    public static boolean isWinner(String[][] field, String turn) {
        int rowCheck;
        int columnCheck;
        int diagonalCheckLeft=0;
        int diagonalCheckRight=0;
        for (int i = 0; i < field.length; i++) {
            columnCheck=0;
            rowCheck=0;
//            diagonalCheckLeft=0;
//            diagonalCheckRight=0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals(turn)) {
                    columnCheck++;
                }
                if (field[j][i].equals(turn)) {
                    rowCheck++;
                }
                if (i == j && field[j][i].equals(turn)){
                    diagonalCheckLeft++;
                }
                if (i + j == field.length - 1 && field[j][i].equals(turn)){
                    diagonalCheckRight++;
                }
            }
            if (columnCheck == field.length || rowCheck == field.length || diagonalCheckLeft == field.length || diagonalCheckRight == field.length){
                return true;
            }
        }
/*        if (
                (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn)) ||
                        (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn)) ||
                        (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        } else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn)) ||
                        (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn))
        ) {
            return true;
        } else if (
                (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn))

        ) {
            return true;
        }*/
        return false;
    }
    public static boolean isDraw (String[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья");
        return true;
    }
}

