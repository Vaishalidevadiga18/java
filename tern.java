public class tern {
    public static void main(String args[]){
        int time = 2;
String message = (time < 12) ? "Good morning."
               : (time < 18) ? "Good afternoon."
               : "Good evening.";
System.out.println(message);
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
    }
    
}
