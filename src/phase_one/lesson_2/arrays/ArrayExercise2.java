package phase_one.lesson_2.arrays;

public class ArrayExercise2 {
    public static void main(String[] args) {
        // Create an array using the int data type
        int[] numbers = new  int[5];

        //Add integers to each of the five locations in the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
