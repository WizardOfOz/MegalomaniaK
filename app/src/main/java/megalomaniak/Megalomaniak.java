package megalomaniak;

public class Megalomaniak {
    
    public static MegalomaniakClient createClient() {
        return new MegalomaniakClient();
    }

    public static MegalomaniakServer createServer() {
        return new MegalomaniakServer();
    }
}
