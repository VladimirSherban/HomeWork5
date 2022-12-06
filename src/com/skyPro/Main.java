package com.skyPro;

public class Main {
    public static void main(String[] args) {
        task1('0');
        task2('1', 2012);
        task3(2024);
        task4(95);
        task5(12);
    }

    public static void task1(char clientOs) {
        System.out.println("\nЗадача_1");
        if (clientOs == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(char clientOs, int clientDeviceYear) {
        System.out.println("\nЗадача_2");
        if (clientOs == '0' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == '1' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3(int year) {
        System.out.println("\nЗадача_3");
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
    }

    public static void task4(int deliveryDistance) {
        System.out.println("\nЗадача_5");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день доставки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня доставки");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня доставки");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5(int monthNumber) {
        System.out.println("\nЗадача_6");
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, сезон зима.");
                break;
            case 2:
                System.out.println("Февраль, сезон зима");
                break;
            case 3:
                System.out.println("Март, сезон весна");
                break;
            case 4:
                System.out.println("Апрель, сезон весна");
                break;
            case 5:
                System.out.println("Май, сезон весна");
                break;
            case 6:
                System.out.println("Июнь, сезон лето");
                break;
            case 7:
                System.out.println("Июль, сезон лето");
                break;
            case 8:
                System.out.println("Август, сезон лето");
                break;
            case 9:
                System.out.println("Сентябрь, сезон осень");
                break;
            case 10:
                System.out.println("Октябрь, сезон осень");
                break;
            case 11:
                System.out.println("Ноябрь, сезон осень");
                break;
            case 12:
                System.out.println("Декабрь, сезон зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
