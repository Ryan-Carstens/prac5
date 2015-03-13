package za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Socket {
    public Voltage getVoltage(){
        return new Voltage(240);
    }
}