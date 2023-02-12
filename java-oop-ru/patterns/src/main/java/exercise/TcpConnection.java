package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

// BEGIN
public class TcpConnection {
    private Connection connectionState;
    private String ip;
    private int port;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.connectionState = new Disconnected(this);
    }

    public String getCurrentState() {
        return this.connectionState.getState();
    }

    public void connect() {
        connectionState.connect();
    }

    public void disconnect() {
        connectionState.disconnect();
    }

    public void write(String data) {
        connectionState.write(data);
    }

    public void setConnectionState(Connection newState) {
        this.connectionState = newState;
    }

}
// END
