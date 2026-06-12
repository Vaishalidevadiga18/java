public class strn {
    
    public static void main(String[] args) {
        String txt = "Hello World";

        System.out.println(txt.length());
        System.out.println(txt.charAt(1));
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("z"));
        System.out.println(txt.substring(0,5));
        System.out.println(txt.contains("world"));
        String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + "" + lastName);

String fullName = firstName.concat(lastName);
System.out.println(fullName);
String name = "Vaishali";
int age = 21;
System.out.printf("My name is %s and I am %d years old.", name, age);
String text = "Hello";
text = text + " World!";
System.out.println(text);
    }
}
    

