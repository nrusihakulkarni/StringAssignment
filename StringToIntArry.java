package String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToIntArry {
    String [] stringArry ;
   public void stringToIntArry (String str) {
       stringArry = str.split(" ");
       System.out.println(Arrays.toString(stringArry));

   }
}
