package za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern;

public class SocketClassAdapter extends Socket implements SocketAdapter
{
    @Override
    public Voltage get240Volt()
    {
        return getVoltage();
    }

    @Override
    public Voltage get12Volt()
    {
        Voltage v= getVoltage();
        return convertVolt(v,20);
    }

    @Override
    public Voltage get3Volt()
    {
        Voltage v= getVoltage();
        return convertVolt(v,80);
    }

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts()/i);
    }
}