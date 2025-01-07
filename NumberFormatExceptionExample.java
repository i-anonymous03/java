public class NumberFormatExceptionExample {
public static void main(String[] args) {
String str = "abc";
try {
int num = Integer.parseInt(str);
System.out.println("Parsed number: " + num);
} catch (NumberFormatException e) {
System.out.println("Error: Unable to parse the string as an integer.");
}
}
}

