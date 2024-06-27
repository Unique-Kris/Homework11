public class Main {

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    public static void printClientOSInfo(int clientOS, int yearOfRelease) {
        if (clientOS == 0 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не определена");
        }
    }

    public static void calculationOfDelivery(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (day + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 2021;
        printLeapYear(year);

        System.out.println("Задание 2");
        printClientOSInfo(1, 2017);

        System.out.println("Задание 3");
        calculationOfDelivery(105);
    }
}