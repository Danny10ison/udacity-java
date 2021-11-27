package phase_one.lesson_2.methods.part1;

public class AddNumbers {
    // add your method here
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        int x = 0, y=0; // change values of x and y to test

        System.out.println(
                x + " + " + y + " = " +
                        addNumbers(x, y)
        );
    }

}
