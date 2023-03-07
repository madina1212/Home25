import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(1,100);
            list.add(number);
            if(number%2==0){
                list1.add(number);
            }else{
                list2.add(number);
            }

        }
        System.out.println(list);
        System.out.println();
        System.out.println(list1);
        System.out.println();
        System.out.println(list2);
    }
}