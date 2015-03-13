package za.ac.cput.rccarstens.CreationalPatterns.PrototypePattern;

public class Subject implements CloneObject
{
    private String subjectCode;

    public Subject(String subjectCode)
    {
        this.subjectCode = subjectCode;
    }

    @Override
    public CloneObject makeCopy()
    {
        return new Subject(subjectCode);
    }

    @Override
    public String toString()
    {
        return "Subject{" +
        "subjectCode='" + subjectCode + '\'' +
        '}';
    }
}