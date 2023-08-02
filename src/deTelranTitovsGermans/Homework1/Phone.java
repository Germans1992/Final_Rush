package deTelranTitovsGermans.Homework1;


import java.util.Random;

public class Phone {
    private String number;
    public String model;
    private int weight;

    // Геттер и сеттер для переменной number
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Конструктор класса Phone
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес должен быть больше 0");
        }
    }

    // Метод receiveCall
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Метод call
    public void call(String targetName) {
        Random random = new Random();
        boolean isReachable = random.nextBoolean();
        if (isReachable) {
            System.out.println("Дозвонился до " + targetName);
        } else {
            System.out.println("Абонент " + targetName + " не доступен");
        }
    }

    public static void main(String[] args) {
        // Создание трех экземпляров класса Phone
        Phone phone1 = new Phone("123-456-789", "Samsung Galaxy", 150);
        Phone phone2 = new Phone("987-654-321", "iPhone 12", 200);
        Phone phone3 = new Phone("111-222-333", "Xiaomi Mi 10", -50); // Некорректный вес

        // Вызов методов receiveCall и call для каждого объекта
        phone1.receiveCall("Alice");
        phone1.call("Bob");
        phone2.receiveCall("John");
        phone2.call("Mike");
        phone3.receiveCall("Tom");
        phone3.call("Kate");
    }

    public int getWeight() {
        return weight;
    }
}





