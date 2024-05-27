package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }

        String joinStr = "";
//        for (String s : split) {
//            joinStr += s + "-";
//        }

        for (int i=0; i < split.length; i++) {
            String string = split[i];
            joinStr += string;
            if(i != split.length-1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", split);
        System.out.println("result = " + result);

    }
}
