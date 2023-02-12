package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private final String connectionState = "disconnected";
    private TcpConnection tcpCon;

    public Disconnected(TcpConnection tcpCon) {
        this.tcpCon = tcpCon;
    }

    @Override
    public void connect() {
        tcpCon.setConnectionState(new Connected(tcpCon));
    }

    @Override
    public void disconnect() {
        System.out.println("Error, has been disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println("Error");
    }

    @Override
    public String getState() {
        return this.connectionState;
    }
}
// END
