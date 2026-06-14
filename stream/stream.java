import java.util.ArrayList;
import java.util.Random;

public class stream{
    public static void main(String[] args) {
        
        int size = 10_000 ;
        ArrayList<Integer> nums  = new ArrayList<>(size);
        Random ran = new Random();

        for (int i = 1; i <=size ; i++) {
            nums.add(ran.nextInt(100));
            // System.out.print(nums);
        }

        // System.out.println(nums);
        long streStrart = System.currentTimeMillis();
    int sum1 = nums.stream()
               .map(i -> i * 2)
               .reduce(0, (c, e) -> c + e);
        long strEnd = System.currentTimeMillis();

        long str2Start = System.currentTimeMillis();
    int sum2 = nums.parallelStream()
                .mapToInt(i -> i)
                .sum();
         long str2end = System.currentTimeMillis();


System.out.println("sum1" + " " + (strEnd-streStrart)+ "sum2" +" "+ (str2end - str2Start));

    }
}