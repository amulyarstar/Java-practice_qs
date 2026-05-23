import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(
                        10,20,30);

        Iterator<Integer> it =
                list.iterator();

        while (it.hasNext()) {

            System.out.println(
                    it.next());
        }
    }
}
