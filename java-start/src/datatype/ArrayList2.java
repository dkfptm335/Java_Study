package datatype;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);

        String result = String.join(" ", pitches);
        System.out.println(result);
    }
}
