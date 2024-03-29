package datatype;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1));

        for (String pitch : pitches) {
            System.out.println(pitch);
        }
    }
}
