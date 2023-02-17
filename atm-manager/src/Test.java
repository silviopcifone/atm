import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int[][] matrix = new int[3][];
        matrix[0] = new int[4];
        matrix[1] = new int[2];
        matrix[2] = new int[3];

        int[] array2 = {3, 4, 5};

        for(int i = 0; i< array2.length; i++) {
        }
        System.out.println(array2.toString());

        for (int number :
                array) {
            System.out.println(number);
        }

        array2 = array;

        array2[0] = 55;

        int[] tempArray = array.clone();

        tempArray[0] = 21;

        ArrayList<Integer> personalList = new ArrayList<>();

        personalList.add(1);

        HashMap<Integer, String> personalMap = new HashMap<>();
        personalMap.put(1, "Ciao");
    }
}
