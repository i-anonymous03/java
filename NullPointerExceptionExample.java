public class NullPointerExceptionExample {
public static void main(String[] args) {
String str = null;
try {
int length = str.length();
System.out.println("Length of the string: " + length);
} catch (NullPointerException e) {
System.out.println("Error: Null reference encountered.");
}
}
}

NumberFormatException

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

ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExceptionExample {
public static void main(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};
try {
int index = 10; // Accessing an index that is out of bounds
int value = numbers[index];
System.out.println("Value at index " + index + ": " + value);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Error: Index is out of bounds.");
}
}
}
