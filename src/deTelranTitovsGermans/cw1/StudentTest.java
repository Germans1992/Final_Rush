package deTelranTitovsGermans.cw1;

import java.util.Scanner;

public class StudentTest {
    public StudentTest() {
    }

    public static void main(String[] args) {
        Student studentOne = new Student("John", 18);
        Student studentTwo = new Student("Maria");
        new Scanner(System.in);
        int age = studentOne.getAge();
        age += 100;
        System.out.println(studentOne.getAge());
        studentOne.happyBirthday();
        studentOne.sayHello();
        studentTwo.sayHello();
        System.out.println("University deTelranTitovsGermans.cw1.Student");
        System.out.println("University deTelranTitovsGermans.cw1.Student");
        Student studentThree = new Student("Petya");
    }
}