package za.ac.cput.rccarstens.CreationalPatterns.FactoryPattern;

public class Lecturer implements Employee
{
    @Override
    public String role() {
        return "Lecturer at CPUT";
    }
}
