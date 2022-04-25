package Lesson2;

public class HomeWork_Lesson2 {
    public static void main(String[] args) {
        System.out.println(chkSum(-4,9));
        chkPositive(-89);
        System.out.println(chkPositiveBool(-18));
        strPrint("Это задание 4 к уроку №2", 5);
        System.out.println(chkLeapYear(2023));
    }
    public static boolean chkSum (int x, int y) {
        boolean result = false;
        int sum =x+y;
        if (sum > 10 && sum < 20) {
            result=true;
        }

        return result;
    }
    public static void chkPositive (int x) {
        if (x >= 0) {
            System.out.println(x + " - число положительное");
        }
        else {
            System.out.println(x + " - число отрицательное");
        }
    }

    public static boolean chkPositiveBool (int x){
        return x < 0;
    }

    public static void strPrint(String strValue, int repeatNum) {
        int i=0;
        while (i<repeatNum) {
            System.out.println(strValue);
            i++;

        }
    }

    public static boolean chkLeapYear (int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);



    }
}
