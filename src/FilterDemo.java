import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> filterList = new ArrayList<>();
        for (int i : list) {
            if (i < 5) {
                filterList.add(i);
            }
        }
        System.out.println(filterList);

        List<Integer> filterList2 = list.stream().filter(e -> e <5).collect(Collectors.toList());
        System.out.println(filterList2);

        Optional<Integer> found = list.stream().filter(p -> p < 5 ).findFirst();
        if (found.isPresent()) {
            System.out.println("Tổng có " + found.get()+ " phần tử lớn hơn 3.");
        }

        //Tính tổng 2 số cộng dồn: (22,3) = 25 --> (25,4)=29 -> (29,5)=34.
        List<Integer> list2 = Arrays.asList(22,3,4,5,6,7);
        Integer sum = list2.stream().reduce((a,b) -> a+b).get();
        System.out.println("TỔNG CÁC PHẦN TỬ TRONG MẢNG: " + sum);
    }
}
