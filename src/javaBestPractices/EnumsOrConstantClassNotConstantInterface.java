package javaBestPractices;

public enum Color1 {
    BLACK, WHITE, RED
}

public enum Color {

    BLACK(0x000000),
    WHITE(0xffffff),
    RED(0xff0000);

    private int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

public class AppConstants {
    public static final String TITLE = "Application Name";

    public static final int VERSION_MAJOR = 2;
    public static final int VERSION_MINOR = 4;

    public static final int THREAD_POOL_SIZE = 10;

    public static final int MAX_DB_CONNECTIONS = 50;

    public static final String ERROR_DIALOG_TITLE = "Error";
    public static final String WARNING_DIALOG_TITLE = "Warning";
    public static final String INFO_DIALOG_TITLE = "Information";
}


public class EnumsOrConstantClassNotConstantInterface {

}
