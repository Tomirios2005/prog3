public class ConnectionManager {

        private static ConnectionManager instance;
        private final String url;
        private final String user;
        private final String password;

    public ConnectionManager(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
