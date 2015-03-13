package za.ac.cput.rccarstens.StructuralPatterns.Composite;

/**
 * Created by student on 2015/03/13.
 */
import java.util.ArrayList;
import java.util.List;

public class Composite implements Vehicle {

    List<Vehicle> components = new ArrayList<Vehicle>();

    @Override
    public void hoot() {
        for (Vehicle component : components) {
            component.hoot();
        }
    }

    @Override
    public void open() {
        for (Vehicle component : components) {
            component.open();
        }
    }

    public void add(Vehicle component) {
        components.add(component);
    }

    public void remove(Vehicle component) {
        components.remove(component);
    }

    public List<Vehicle> getVehicles() {
        return components;
    }

    public Vehicle getVehicle(int indx) {
        return components.get(indx);
    }

}