public class arr {
    public static void main(String args[]){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
int[] numbers = {1, 5, 10, 25};
int sum = 0;

// Loop through the array and add each element to sum
for (int i = 0; i < numbers.length; i++) {
  sum += numbers[i];
}

System.out.println("The sum is: " + sum);
int[] num = {1, 5, 10, 25};
int s = 0;

// Loop through the array and add each element to sum
for (int i = 0; i < num.length; i++) {
  s += num[i];
  System.out.println("The sum is: " + s);
  int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNumbers) {
  for (int nums : row) {
    System.out.println(nums);
  }
}
}


    }
    
}
