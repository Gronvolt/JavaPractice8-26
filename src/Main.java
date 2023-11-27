import java.awt.*;
import java.util.Scanner;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    task1();
                    break;
                }
                case 2: {
                    task2();
                    break;
                }
                case 3: {
                    task3();
                    break;
                }
                case 4: {
                    task4();
                }
                case 5: {
                    task5();
                }
                default:
                    System.out.println("\nВыберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да") || choice.equalsIgnoreCase("yes")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет") || choice.equalsIgnoreCase("no")) {
            scanner.close();
            continueExecution = false;
        }
    }

//    Пользователь вводит с клавиатуры размер стороны
//    квадрата. Требуется отобразить на экран заполненный
//    квадрат. Размер стороны равен введённому размеру.
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        //Ввод стороны квадрата с клавиатуры
        System.out.print("Введите длину стороны квадрата: ");
        int sideLength = scanner.nextInt();

        //Вывод квадрата
        for (int j = 0; j < sideLength; j++) {
            for (int i = 0; i < sideLength; i++) {
                if (i == sideLength - 1) {
                    System.out.print(" * \n");
                } else {
                    System.out.print(" * ");
                }
            }
        }
    }

    //Пользователь вводит с клавиатуры размер стороны
    //квадрата. Требуется отобразить на экран незаполненный
    //квадрат (отображаются только границыквадрата). Размер
    //стороны равен введённому размеру.
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        //Ввод стороны квадрата с клавиатуры
        System.out.print("Введите длину стороны квадрата: ");
        int sideLength = scanner.nextInt();

        //Вывод квадрата
        for (int j = 0; j < sideLength; j++) {

            //Первое условия для вывода верхней стороны из "*"
            if (j == 0 || j == sideLength - 1) {
                for (int i = 0; i < sideLength; i++) {
                    System.out.print(" * ");
                }
            }

            //Второе условия для вывода границ квадрата
            if (j > 0 && j < sideLength - 1) {
                for (int i = 0; i < sideLength; i++) {

                    if (i == 0 || i == sideLength - 1) {
                        System.out.print(" * ");
                    }

                    if (i > 0 && i < sideLength - 1) {
                        System.out.print("   ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    //Пользователь вводит с клавиатуры длину и ширину
    //прямоугольника. Требуется отобразить на экран незаполненный прямоугольник (отображаются только границы прямоугольника). Размер длины и ширины равен
    //введенным данным.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        //Ввод с клавиатуры сторон прямоугольника
        System.out.print("Введите ширину прямоугольника: ");
        int widthRectangle = scanner.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int heightRectangle = scanner.nextInt();

        //Вывод полого прямоугольника
        for (int i = 0; i < heightRectangle; i++) {
            //Первое условия для вывода верхней стороны из "*"
            if (i == 0 || i == heightRectangle - 1) {
                for (int j = 0; j < widthRectangle; j++) {
                    System.out.print(" * ");
                }
            }

            //Второе условия для вывода границ прямоугольника
            if (i > 0 && i < heightRectangle - 1) {
                for (int j = 0; j < widthRectangle; j++) {

                    if (j == 0 || j == widthRectangle - 1) {
                        System.out.print(" * ");
                    }

                    if (j > 0 && j < widthRectangle - 1) {
                        System.out.print("   ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    //Показать на экран все простые числа в диапазоне,
    //указанном пользователем. Число называется простым,
    //если оно делится без остатка только на себя и на единицу.
    //Например, три — это простое число, а четыре нет.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        //Ввод диапазона простых чисел
        System.out.print("Введите начало дипазона: ");
        int min = scanner.nextInt();
        System.out.print("Введите предел диапазона: ");
        int max = scanner.nextInt();

        //Алгоритм рассчета простого числа
        for (int i = min; i < max; i++) {
            if (checkSimpleNum(i)) {
                System.out.println(i + " - простое число.");
            }
        }
    }


    //Показать на экран таблицу умножения в диапазоне,
    //указанном пользователем.
    public static void task5 () {
        Scanner scanner = new Scanner(System.in);
        //Ввод диапазона простых чисел
        System.out.print("Введите начало дипазона: ");
        int min = scanner.nextInt();
        System.out.print("Введите предел диапазона: ");
        int max = scanner.nextInt();

        //Вывод таблицы умножения в указанном диапазоне
        for (int i = min; i < max; i++) {
            //Вывод таблицы умножения для текущего числа i
            for (int j = 0; j < 10; j++) {
                System.out.print(i + "*" + j + " = " + (i * j) + " † ");
            }
            System.out.println("\n-------------------------------------------------------------------------------");
        }
    }

    public static boolean checkSimpleNum(int i) {
        if (i == 2) {
            return true;
        }
        return i % 2 != 0 && i != 1;
    }
}
