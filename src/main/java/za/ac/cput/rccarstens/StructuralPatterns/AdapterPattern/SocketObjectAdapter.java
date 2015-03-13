package za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern;

public class SocketObjectAdapter implements SocketAdapter
{
    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Voltage get240Volt()
    {
        return sock.getVoltage();
    }

    @Override
    public Voltage get12Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 10);
    }

    @Override
    public Voltage get3Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 40);
    }

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts() / i);
    }
}