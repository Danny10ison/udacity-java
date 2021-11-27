package phase_one.lesson_2.loops.while_loop;

public class WhileLoopExercise {
    public static void main(String[] args) {
        /*Format for while*/
        // int index = 0;
        // while (condition) {
        //    do
        //    something
        // }
        // While loop continuously executes
        // as long as a given condition is "True"

        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        int index = 0;
        while (index < numbers.length){
            System.out.println(numbers[index]);
            index++;
        }

    }
}
