/*
Øvelse 4
1. Opret en klasse "Studerende" med attributterne navn, studienummer og en ArrayList af karakterer.
2. Tilføj metoder til at tilføje karakterer og beregne gennemsnit af karaktererne.
3. Opret et par Studerende-objekter, tilføj karakterer til dem og udskriv deres gennemsnitlige karakter.
 */

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + grades +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bobby", 1);
        s1.addGrade(7);
        s1.addGrade(10);
        s1.addGrade(4);
        s1.addGrade(12);
        s1.addGrade(10);

        System.out.println(s1.getAverage());
    }


}
