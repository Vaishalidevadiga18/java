public class lens {
    public static void main(String args[]){
        String text="helloworld";
        System.out.printf("The length of the txt string is: %d", text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(3));
        String txt1 = "Please locate where 'locate' occurs!";
System.out.println(txt1.indexOf("e"));
String txt3 = "Greetings";
String txt4 = "Great things";

System.out.println(txt3.equals(txt4));
String txt5 = "   Hello World   ";
System.out.println("Before: [" + txt5 + "]");
System.out.println("After:  [" + txt5.trim() + "]");
System.out.println(text.replace(" ", ""));
    }
    
}
