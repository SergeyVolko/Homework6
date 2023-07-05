public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int num = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 10;
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int num = 17;
        for (int i = 0; i <= num; i+= 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int minNum = -10;
        int maxNum = 10;
        for (int i = maxNum; i >= minNum; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int minYear = 1904;
        int maxYear = 2096;
        for (int i = minYear; i <= maxYear; i += 4) {
            System.out.println(i + " год является високсным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int minNum = 7;
        int maxNum = 98;
        for (int i = minNum; i <= maxNum; i += minNum) {
            if (i < maxNum) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int minNum = 1;
        int factor = 2;
        int maxNum = 512;
        for (int i = minNum; i <= maxNum; i *= factor) {
            if (i < maxNum) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int months = 12;
        int sumMonth = 29000;
        int total = 0;
        for (int i = 1; i <= months; i++) {
            total += sumMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double contribution = 29000;
        double total = 0;
        double percent = 0.12;
        int months = 12;
        double percentMonth = 1.0 + percent / months;
        for (int i = 1; i <= months; i++) {
            total = (total + contribution) * percentMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int num  = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num  * i);
        }
    }
}