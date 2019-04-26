package detelrangroup7;

public class ArrayUtilsChar {
    /*public static void sortArrayChar(String[] a) {

        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    String buffer = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buffer;
                    flag = true;
                }
            }
            //printArray(a, 6);
        } while (flag );
    }*/
    public static void printArrayChar(String[] a, String name) {
        int i;
        System.out.println("------------------");
        for (i = 0; i < a.length; i++) {
            System.out.println(name + "["+i+"]="+ a[i]);
        }
        System.out.println("------------------");
    }
}


