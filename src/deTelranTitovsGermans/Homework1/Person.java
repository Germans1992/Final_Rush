package deTelranTitovsGermans.Homework1;

import java.util.Random;

public class Person {
    private String fullName;
    private int age;

    // Конструктор без аргументов
    public Person() {
        this.fullName = "John Doe";
        this.age = 25;
    }

    // Конструктор с аргументами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Геттер для fullName (доступен всем пакетам)
    public String getFullName() {
        return fullName;
    }

    // Геттер для age (доступен всем пакетам)
    public int getAge() {
        return age;
    }

    // Сеттер для age (доступен только внутри класса)
    private void setAge(int age) {
        this.age = age;
    }

    // Метод talk(), выводящий сообщение на консоль
    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    // Метод move(), возвращающий число шагов (рандомное число от 0 до 100)
    public int move() {
        Random random = new Random();
        return random.nextInt(101);
    }

}


