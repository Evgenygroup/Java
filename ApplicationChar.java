package detelrangroup7;

import java.util.Arrays;

public class ApplicationChar {
        public static void main (String...params) {

            String [] letters = {"ulj","abc","bbb","zklo","cdr"};
            ArrayUtilsChar.printArrayChar(letters, "letters");
            Arrays.sort(letters);
           /* ArrayUtilsChar.sortArrayChar(letters);*/
            ArrayUtilsChar.printArrayChar(letters, "letters");
        }

}
