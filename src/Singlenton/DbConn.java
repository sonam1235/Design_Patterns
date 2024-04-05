package Singlenton;

public class DbConn {
    private static DbConn db1 = null;
    private DbConn() {}
    public static DbConn getInstance() {
                if(db1 == null) {
                    db1 = new DbConn();
                }
                return db1;
    }
}
