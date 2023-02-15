public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientIOS = 0;
        int clientAOS = 1;
        if (clientIOS <= 0) {
        } else {
            ;
        }
        System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientAOS <= 1) {
        } else {
            ;
        }
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (2015 > clientDeviceYear) {
            int clientOS = 1;
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("такого не существует");
            }
        }
        if (2015 <= clientDeviceYear) {
            System.out.println("установите обычное приложение");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("год является весокосным");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("год является весокосным");
        else if (year % 100 == 0)
            System.out.println("год является весокосным");
        else
            System.out.println("год не является весокосным");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }

        if (deliveryDistance > 100) {
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
       int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("номер месяца больше 13");
        }
    }
}










