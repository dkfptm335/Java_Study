package datatype;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.println(map.remove("people"));
        System.out.println(map);
        System.out.println(map.size());
        map.put("people", "사람");
        System.out.println(map.keySet());

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);
    }
}
