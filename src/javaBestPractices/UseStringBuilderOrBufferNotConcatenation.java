package javaBestPractices;

public class UseStringBuilderOrBufferNotConcatenation {
    public static void main(String[] args) {
        StringBuilder sbSql
                = new StringBuilder("Insert Into Users (name, email, pass, address)");

        sbSql.append(" values ('").append(user.getName());
        sbSql.append("', '").append(user.getEmail());
        sbSql.append("', '").append(user.getPass());
        sbSql.append("', '").append(user.getAddress());
        sbSql.append("')");

        String sql = sbSql.toString();
    }
}
