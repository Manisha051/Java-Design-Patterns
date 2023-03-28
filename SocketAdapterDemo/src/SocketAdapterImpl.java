public class SocketAdapterImpl implements SocketAdapter{

    private Socket socket = new Socket();
    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt(); //120
        return new Volt(v.getVolts()/10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return new Volt(v.getVolts()/40);
    }
}
