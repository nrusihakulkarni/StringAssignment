package String;

import java.util.Locale;

public class OvelsAndConsonants {
    void ovelsandconsonants(String string) {
        int ovelCntr = 0;
        int consonantsCntr = 0;
        for (int x = 0; string.length() > x; x ++) {
            char Chr = string.toLowerCase().charAt(x) ;
            if ("eaioua".indexOf(Chr)>0 ) {
                ovelCntr++;
            } else {
                consonantsCntr++;
            }
        }
        System.out.println("Ovels : " + ovelCntr + "\nconsonants : " + consonantsCntr);
    }
}
