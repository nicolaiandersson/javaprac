import java.util.ArrayList;
import java.util.Collections;

public class Car {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(10);
        arr.add(7);

        for(Integer i : arr) {
            System.out.println(i);
        }

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        Collections.sort(arr);
        System.out.print(arr);
    }
}
