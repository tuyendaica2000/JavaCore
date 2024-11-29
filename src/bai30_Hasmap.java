import java.util.HashMap;

public class bai30_Hasmap {
    public static void main(String[] args) {
        // 1. Khai báo
        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,Float> map2 = new HashMap<>();
        /* CÁC PHƯƠNG THỨC
        * 1. put(key,value): Thêm 1 ptu theo cặp key, value
        * 2. get(key): Truy xuất giá trị thông qua key.
        * 3. remove(key): Xóa 1 ptu (xóa cả căp key,value)
        * 4. containsKey(key): Kiểm tra xem KEY có tồn tại trong Hashmap không>=?
        * 5. containsValue(value): Kiểm tra xem VALUE có tồn tại trong Hashmap không?
        * 6. isEmpty(): Kiểm tra xem Hashmap có rônỗng hay không?
        * 7. size(): Kiểm tra số lượng ptu trong Hashmap.
        * */

        // 2. Thêm các ptu vào hashmap
        map.put(1,"Orange");
        map.put(2,"Apple");
        map.put(3,"Banana");

        // 3. Lấy giá trị của 1 ptu
        String value = map.get(2);
        String value2 = map.get(1);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // 4. Xóa 1put khỏi hashmap
        map.remove(2);
        System.out.println(map2.get(2));

        // 5. Kiểm tra xem 1 ptu có tồn tại trong hashmap k?
        boolean check = map.containsKey(4);
        System.out.println(check);

        // 6.Kiểm tra xem 1 ptu có tồn tại trong hashmap k?
        boolean checkValue = map.containsValue("Orange");
        System.out.println(checkValue);

        // 7. Kiểm tra xem Hashmap có rỗng hay k?
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        // 8. Lấy số lượng pt trong hashmap
        int soLuongpt = map.size();
        System.out.println(soLuongpt);

        // 9. Duyệt hashmap
        for (Integer key : map.keySet()){
            String VL = map.get(key);
            System.out.println(VL);
        }
    }
}
