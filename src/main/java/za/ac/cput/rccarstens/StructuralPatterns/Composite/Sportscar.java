package za.ac.cput.rccarstens.StructuralPatterns.Composite;

/**
 * Created by student on 2015/03/13.
 */
public class Sportscar implements Vehicle
{

    String carName;
    public Sportscar(String cn)
    {
        this.carName = cn;
    }


    @Override
    public void hoot() {
        System.out.println(carName + "hoots loudly");
    }

    @Override
    public void open() {
        System.out.println(carName + "opens via electronic key");
    }


}
