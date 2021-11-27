package phase_one.lesson_2.loops.for_loop;

public class ForLoopExercise {
    public static void main(String[] args) {
        /*Format for "for loop" is */
        // for (initialisation; condition; increment/decrement){
        //     Some coding logic, etc.
        // }
        // For loops executes until a condition is met,
        // condition is "True"

        int [] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
