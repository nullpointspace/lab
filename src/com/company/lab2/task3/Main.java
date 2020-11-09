package com.company.lab2.task3;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant("1", "2", "3" , 4.0);

        Student[] students = new Student[]{
          new Student("1", "2", "3" , 5.0),
          student
        };

        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
        }
    }
}

/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой
научной работы.
ü	Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую
среднюю оценку.
ü	Создать переменную типа Student, которая ссылается на объект типа Aspirant.
ü	Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента
равна 5, то сумма 100, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5,
то сумма 200, иначе 180.
ü	Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для
каждого элемента массива.
 */