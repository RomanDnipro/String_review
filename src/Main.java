import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//import static java.lang.String.format;

public class Main {
    int a =4;
    void method(double d){
        System.out.println(d);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        char[] arr = new char[]{' ','I','T',' ', 'i','s',' ',' ', 's', 't', 'r', 'i', 'n', 'g',' ', '!', ' ', ' '};
        String s = new String(arr);

        String s1 = new String(" IT is  string !  ");
        String s2 = "it is string!";
        String s3 = "It is String!";
        System.out.println(" s: " + "'" + s + "'");
        System.out.println("s1: " + "'" + s1 + "'");
        System.out.println("s2: " + "'" + s2 + "'");
        System.out.println("s3: " + "'" + s3 + "'");
        System.out.println();


        System.out.println("s.charAt(5): " + s.charAt(5));
        System.out.println("s.codePointAt(5): " + s.codePointAt(5));
        System.out.println("s.codePointBefore(5): " + s.codePointBefore(5));
        System.out.println("s.codePointCount(0,s.length()): " + s.codePointCount(0,s.length()));
        System.out.println("s.compareTo(s1): " + s.compareTo(s1) + "  /  " + "s.compareTo(s2): " + s.compareTo(s2)
                + " / что значит лексиграфическое сравнение?");
        System.out.println("s2.compareToIgnoreCase(s3): " + s2.compareToIgnoreCase(s3));
        System.out.println("s2.concat(s3): " + s2.concat(s3));
        System.out.println("s2.contains(\"str\"):" + s2.contains("str") + "  /  " + "s3.contains(\"str\"):"
                + s3.contains("str"));
        System.out.println("s2.contentEquals(s3): " + s2.contentEquals(s3) + "  /  " + "s3.contentEquals(s3): "
                + s3.contentEquals(s3));
        System.out.println("String.copyValueOf(arr): " + String.copyValueOf(arr));
        System.out.println("String.copyValueOf(arr, 4, 6): " + String.copyValueOf(arr, 4, 6));
        System.out.println("s2.endsWith(\" !\"): " + s2.endsWith(" !"));
        System.out.println("s2.equals(new String(\"it is string!\")): " + s2.equals(new String("it is string!"))
                + "  /  " + "s2.equals(new StringBuilder(\"it is string!\")): "
                +  s2.equals(new StringBuilder("it is string!")));
        System.out.println("s2.equalsIgnoreCase(s3): " + s2.equalsIgnoreCase(s3));
        System.out.println("String.format(\"usual text, %s\",s2): " + String.format("usual text, %s",s2));
        System.out.println("s2.getBytes(): " + s2.getBytes() + "  /  "
                + "s2.getBytes(\"UTF-8\"): " + s2.getBytes("UTF-8"));
        System.out.println();
        System.out.print("char[] arrChar = new char[s2.length()];\n" +
                "        s2.getChars(0,s2.length(),arrChar,0);\n" +
                "        System.out.println(arrChar);  : ");
        char[] arrChar = new char[s2.length()];
        s2.getChars(0,s2.length(),arrChar,0);
        System.out.println(arrChar);
        System.out.println();
        System.out.println("s2.hashCode(): " + s2.hashCode() + "  /  " + "s3.hashCode(): "
                + s3.hashCode() + "  /  " + "s3.hashCode(): " + s3.hashCode());
        System.out.println("s2.indexOf('t'): " + s2.indexOf('t') + "  /  " + "s2.indexOf('t', 2): " + s2.indexOf('t',2));
        System.out.println("s2.intern(): " + s2.intern() + " / не понятно!");
        System.out.println("s2.isEmpty(): " + s2.isEmpty());
        System.out.println("String.join(\"__\", s, s2, s3): " + String.join("__", s, s2, s3));
        System.out.println("s2.lastIndexOf('t'): " + s2.lastIndexOf('t'));
        System.out.println("s2.length(): " + s2.length());
        System.out.println("s2.matches(\"(.*)str(.*)\"): " + s2.matches("(.*)str(.*)"));
        System.out.println("s2.offsetByCodePoints(2, 6): " + s2.offsetByCodePoints(2, 6) + " / что?!");
        System.out.println("s2.regionMatches(true,3,\"IS\",0,2): " + s2.regionMatches(true,3,"IS",0,2));
        System.out.println("s2.replace('s', '*'): " + s2.replace('s', '*'));
        System.out.println("s2.replaceAll(\"s\", \"qwerty\"): " + s2.replaceAll("s", "qwerty"));
        System.out.println("s2.replaceFirst(\"s\", \"qwerty\"): " + s2.replaceFirst("s", "qwerty"));
        System.out.println();
        System.out.println("for (String word : s2.split(\" \")) {\n" +
                "            System.out.println(word);\n" +
                "        } :");
        for (String word : s2.split(" ")) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println("s2.startsWith(\"tring\"): " + s2.startsWith("tring"));
        System.out.println("s2.startsWith(\"tring\", 7): " + s2.startsWith("tring", 7));
        System.out.println("s2.subSequence(7,s2.length()): " + s2.subSequence(7,s2.length()));
        System.out.println("s2.substring(7,s2.length()): " + s2.substring(7,s2.length()));
        System.out.println("Arrays.toString(s2.toCharArray()): " + Arrays.toString(s2.toCharArray()));
        System.out.println("s1.toLowerCase(): " + s1.toLowerCase());
        System.out.println("s1.toUpperCase(): " + s1.toUpperCase());
        System.out.println("s2.toString(): " + s2.toString() + " / " + "возвращает ту же строку. Нужен для переопред-я?");
        System.out.println("s1.toUpperCase(): " + s1.toUpperCase());
        System.out.println("\"'\" + s1.trim() + \"'\" : " + "'" + s1.trim() + "'");
        System.out.println("String.valueOf(arr): " + String.valueOf(arr) + " / принимает различные прим. и ссыл параметры");
        System.out.println("String.valueOf(new Main()): " + String.valueOf(new Main()));
    }
}
