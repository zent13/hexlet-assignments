package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private final String connectionState  = "connected";
    private TcpConnection tcpCon;

    public Connected(TcpConnection tcpCon) {
        this.tcpCon = tcpCon;
    }


    @Override
    public void connect() {
        System.out.println("Error, has been connected");
    }

    @Override
    public void disconnect() {
        tcpCon.setConnectionState(new Disconnected(tcpCon));
    }

    @Override
    public void write(String data) {
        System.out.println("Ok");
    }

    @Override
    public String getState() {
        return this.connectionState;
    }

}
// END
