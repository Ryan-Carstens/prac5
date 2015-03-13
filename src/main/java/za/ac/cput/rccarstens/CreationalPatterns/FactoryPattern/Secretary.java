package za.ac.cput.rccarstens.CreationalPatterns.FactoryPattern;

public class Secretary implements Employee
{
    @Override
    public String role() {
        return "Secretary at CPUT";
    }
}
