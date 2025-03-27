package megalomaniak;

/**
 * Factory class for creating Megalomaniak clients and servers.
 */
public class Megalomaniak {
    
    public static MegalomaniakClient createClient() {
        return new MegalomaniakClient();
    }

    public static MegalomaniakServer createServer() {
        return new MegalomaniakServer();
    }
}
