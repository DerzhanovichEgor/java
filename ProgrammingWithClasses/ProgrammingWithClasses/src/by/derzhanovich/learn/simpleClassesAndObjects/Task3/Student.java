package by.derzhanovich.learn.simpleClassesAndObjects.Task3;
/*
Создайте класс Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов).
Создайте массив из десяти элементов такого типа.Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 9 или 10
 */

public class Student {
    private String name;
    private int group;
    private int[] marks = new int[5];

    public Student(){
    }
    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public void bestStudents(){
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == 9 || marks[i] == 10){
                count++;
                if(count == marks.length){
                    System.out.println(this);
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Студент: " + name + ", группа: " + group + " имеет отметки не ниже 9 баллов";
    }
}


