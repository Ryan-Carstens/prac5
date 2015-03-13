package za.ac.cput.rccarstens.StructuralPatterns.AdapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Voltage {
    private int volts;
    public Voltage(int volts) {
        this.volts = volts;
    }
    public int getVolts() {
        return volts;
    }
    public void setVolts(int volts) {
        this.volts = volts;
    }
}