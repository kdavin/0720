import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List l=new ArrayList();

        for (int i = 1; i <= 100; i++) {
            l.add(i);

        }
        for (int j = 0; j < 100; j++) {
            System.out.println(l.get(j));
        }
    }

}
