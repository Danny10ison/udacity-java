package phase_one.lesson_2.loops.do_while_loop;

public class DoWhileLoopExercise {
    public static void main(String[] args) {
        /*Format fo "do...while" loop is*/

        // int counter = 0;
        // do{
        //
        //   some
        //   logic
        //   here
        //
        // }while(condition)
        // do while loop is like while loop,
        // but runs the do block first,
        // before checking the condition

        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        int counter = 0;
        do {
            System.out.println(numbers[counter]);
            counter++;
        }while (counter < numbers.length);
    }
}
