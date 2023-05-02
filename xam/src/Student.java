import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public double averageGrade() {
        double sum = 0;
        for(Integer g : grades) {
            sum += g;
        } return sum / grades.size();
    }

    public static void main(String[] args) {
        Student s = new Student("Karl");
        s.grades.add(7);
        s.grades.add(10);
        s.grades.add(12);
        s.grades.add(4);
        s.grades.add(12);
        s.grades.add(12);



        System.out.println(s.averageGrade());
    }
}
