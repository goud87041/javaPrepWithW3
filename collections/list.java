
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list {

    public static void main(String[] args) {

        Comparator<String> com = (i, j) -> {
            if (i.length() > j.length() ) {
                return 1;
            } else {
                return -1;
            }
        };
        


        List<String> sort = new ArrayList<>();
        sort.add("abhi");
        sort.add("manoj");
        sort.add("anurag");
        sort.add("vishvash");

        Collections.sort(sort,com);

        System.out.println(sort);


        

    }
}