package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {

    void StringSortFuncton(String[] name) {

        List<String> nameArrylist = Arrays.asList(name);
        Collections.sort(nameArrylist);
        System.out.println(nameArrylist);
    }

}

class Replace {
    public void replace(String[] name) {

        for (String Name : name) {
            String print = "";
            for (int x = 0; x < Name.length(); x++) {
                char alpha = Name.toLowerCase().charAt(x);
                if ("eaioua".indexOf(alpha) > 0 && x < Name.length() - 1) {

                    print = print + Name.charAt(x + 1);

                } else {
                    print = print + Name.charAt(x);
                }
            }
            System.out.println(print);
        }
    }
}
