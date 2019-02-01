public class Runner {

    public static void main(String[] args) {

        // warm-up one
        System.out.println(stringE("screen")); // should betrue
        System.out.println(stringE("electee")); // false

        // warm-up two
        System.out.println(doubleX("exxxxx")); // should be true
        System.out.println(doubleX("xoxoxo")); // should be false

        // string one
        System.out.println(firstHalf("Gabe")); // should be "Ga"
        System.out.println(firstHalf("EliotW")); // should be "Eli"

        // string two
        System.out.println(bobThere("bob")); // should be true
        System.out.println(bobThere("steve")); // should be false

        // string three
        System.out.println(countTriple("0000")); // should be 2
        System.out.println(countTriple("1234")); // should be 0

        // array one
//        System.out.println(makeEnds(int[1,2,3]));
//        System.out.println(makeEnds());
//
//        // array two
//        System.out.println(isEverywhere());
//        System.out.println();
//
//        // array three
//        System.out.println(countTriple());
//        System.out.println();

        // logic one
        System.out.println(greenTicket(1,2,3)); // should be 0
        System.out.println(greenTicket(1,1,2)); // should be 10
        System.out.println(greenTicket(1,1,1)); //should be 20
        
        // logic two
        System.out.println(makeChocolate(4, 1, 9)); // should be 4
        System.out.println(makeChocolate(4,1,7)); // should be 2
        System.out.println(makeChocolate(4,1,10)); // should be -1
    }

    // warm-up one
    public static boolean stringE(String str) {
        int counter = 0;
        for (int a = 0; a < str.length(); a++){
            if (str.substring(a, a+1).equals("e")){
                counter++;
            }
        }
        if (1 <= counter && counter <= 3){
            return true;
        } else {
            return false;
        }
    }

    // warm-up two
    public static boolean doubleX(String str) {
        int counter = 0;
        String secondStr = str + "  ";
        for (int a = 0; a < str.length(); a++){
            if (secondStr.substring(a, a+2).equals("xx") && counter == 0){
                return true;
            }
            if (secondStr.substring(a, a+1).equals("x")){
                counter++;
            }
        }
        return false;
    }

    // string one
    public static String firstHalf(String str) {
        int length = str.length() / 2;
        String returnString = "";
        for (int a = 0; a < length; a++){
            returnString += str.substring(a, a+1);
        }
        return returnString;
    }

    // string two
    public static boolean bobThere(String str) {
        String secondStr = str + " ";
        for (int a = 0; a < str.length() - 2; a++){
            if (secondStr.substring(a, a+1).equals("b") && secondStr.substring(a+2, a+3).equals("b")){
                return true;
            }
        }
        return false;
    }

    // string three
    public static int countTriple(String str) {
        int counter = 0;
        String secondStr = str + " ";
        for (int a = 0; a < str.length() - 2; a++){
            if (secondStr.substring(a, a+1).equals(secondStr.substring(a+1, a+2)) && secondStr.substring(a, a+1).equals(secondStr.substring (a+2, a+3))){
                counter++;
            }
        }
        return counter;
    }

    // array one
    public static int[] makeEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int[] returnNums = {first, last};
        return returnNums;
    }

    // array two
    public static boolean isEverywhere(int[] nums, int val) {
        for (int a = 0; a < nums.length - 1; a++){
            if (nums[a] != val && nums[a+1] != val){
                return false;
            }
        }
        return true;
    }

    // array three
    public static int[] seriesUp(int n) {
        int[] gather = new int[n * (n+1) / 2];
        int counter = 0;
        for (int a = 1; a < n + 1; a++){
            for (int b = 1; b < a + 1; b++) {
                gather[counter] = b;
                counter++;
            }
        }
        return gather;
    }

    // logic one
    public static int greenTicket(int a, int b, int c) {
        if (a == b && a == c){
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    // logic two
    public static int makeChocolate(int small, int big, int goal) {
        int amountDone = 0;
        for (int a = 0; a < big; a++){
            if (goal < amountDone + 5){
                a = big;
            } else {
                amountDone = amountDone + 5;
            }
        }
        int remainder = goal - amountDone;
        if (small < remainder){
            return -1;
        } else{
            return remainder;
        }
    }

}
