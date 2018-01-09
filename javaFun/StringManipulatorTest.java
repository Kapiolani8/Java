public class StringManipulatorTest {
    public static void main(String[] args) {
StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
// System.out.println(str); // HelloWorld 
// System.out.println(manipulator.trimAndConcat("  Hello  ", "  World  "));
// System.out.println(manipulator.getIndexOrNull("hello", 'o'));
// System.out.println(manipulator.getIndexOrNull("hello", 'a'));
// System.out.println(manipulator.getIndexOrNullAgain("hello world", "world"));
// System.out.println(manipulator.getIndexOrNullAgain("hello world", "foo"));
// System.out.println(manipulator.concatSubstring("hello", 0, 4, "world"));
// }
// }


StringManipulator manipulator1 = new StringManipulator();
char letter = 'o';
String a = manipulator1.getIndexOrNull("Coding", letter);
String b = manipulator1.getIndexOrNull("Hello World", letter);
String c = manipulator1.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null

StringManipulator manipulator2 = new StringManipulator();
String word1 = "Hello";
String subString = "llo";
String notSubString = "world";
String d = manipulator2.getIndexOrNullAgain(word1, subString);
String e = manipulator2.getIndexOrNullAgain(word1, notSubString);
System.out.println(a); // 2
System.out.println(b); // null

StringManipulator manipulator3 = new StringManipulator();
String word2 = manipulator3.concatSubstring("Hello", 1, 2, "world");
System.out.println(word2); 
    }
}
