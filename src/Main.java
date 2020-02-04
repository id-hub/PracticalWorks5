public class Main {

    public static void main(String[] args) {
//	// write your code here
//        String string = ("The decimal system, invented in" +
//                "India around AD 600, was a revolution in quantitative reasoning: using" +
//                "only 10 symbols, even very large numbers could be written down" +
//                "compactly");
//        System.out.println(string.substring(string.length() / 2));

        String string = ("The decimal system, invented in" + " ");

//        int half = string.length() / 2;
        int char1 = string.indexOf("t");
        int char2 = string.lastIndexOf("t");
        System.out.println("Out : " + char1 +
                            char2);
    }
}
