package phase_one.lesson_2.javadoc.code;

/**
 * This is my first JavaDoc // description
 *
 * @author Dannyose          // block tag for author of the class
 * @see                      // A reference to another class
 */
public class JavaDocExample {

    /**
     * sampleMethod
     *
     * @param text Any string will work
     * @param number Any number will work
     * @return "text number"
     */
    public  String sampleMethod(String text, int number){
        return text + " " + number;
    }

    // calling the method
    String kofi = sampleMethod("hmm", 5);

}
