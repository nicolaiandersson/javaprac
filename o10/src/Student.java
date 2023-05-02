import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double averageGrade() {
        double sum = 0;

        for(Integer g : grades) {
            sum += g;
        }

        return sum / grades.size();
    }

    public String toString() {
        return "Name: " + name + ", Karakterer: " + grades;
    }
    public static void main(String[] args) {
        Student bob = new Student("Bob");

        bob.addGrade(7);
        bob.addGrade(10);
        bob.addGrade(12);
        bob.addGrade(4);
        bob.addGrade(4);

        System.out.println(bob);
        System.out.println("Gennemsnit: " + bob.averageGrade());

        Collections.sort(bob.grades);
        System.out.println(bob.grades);
        Collections.sort(bob.grades,Collections.reverseOrder());
        System.out.println(bob.grades);


    }
}
