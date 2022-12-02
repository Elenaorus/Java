package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listResult = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(111);
        list.add(150);
        list.add(1);
        list.add(195);


        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
