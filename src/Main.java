import java.util.*;

public class Main {
    public static int integersBelowZero (ArrayList<Integer> arr){
        int mem = 0;
        for (int i : arr){
            if (i < 0){
                mem ++;
            }
        }
        return (mem);
    }
    public static int doublesBelowZero (ArrayList<Double> arr){
        int mem = 0;
        for (double i : arr){
            if (i < 0){
                mem ++;
            }
        }
        return (mem);
    }

    public static int booleanTFCount (ArrayList<Boolean> arr, boolean bool){
        int mem = 0;
        for (boolean i : arr){
            if (i == bool){
                mem ++;
            }
        }
        return (mem);
    }

    public static boolean stringSearch (ArrayList<String> arr, String str){
        for (String i : arr){
            if (i.equals(str)){
                return (true);
            }
        }
        return (false);
    }

    public static boolean foundInBoth (ArrayList<Integer> a, ArrayList<Integer> b){
        for (int i : a){
            for (int j : b){
                if (i == j){
                    return (true);
                }
            }
        }
        return (false);
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(
                Arrays.asList(-1, 0, 1)
        );
        ArrayList<Double> doubles = new ArrayList<>(
                Arrays.asList(1.1, 0.1, -1.1)
        );
        ArrayList<Boolean> booleans = new ArrayList<>(
                Arrays.asList(false, false, true, false)
        );
        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("String", "stings")
        );
        ArrayList<Integer> integers1 = new ArrayList<>(
                Arrays.asList(5, 6, 9, 2, 0 , 8)
        );
	System.out.println(integersBelowZero(integers));
    System.out.println(doublesBelowZero(doubles));
    System.out.println(booleanTFCount(booleans, true) + ", " + booleanTFCount(booleans, false));
    System.out.println(stringSearch(strings, "string"));
    System.out.println(foundInBoth(integers, integers1));

    }
}
