package za.ac.cput.rccarstens.CreationalPatterns.abfact;

public class ThirdYearSubjectsFactory implements SubjectsFactory
{
@Override
public Subject getSubjectName(String subjectCode)
{
    if (subjectCode.equals("DS"))
    {
        return new ThirdYearDS();
    }
    else if (subjectCode.equals("TP"))
    {
        return new ThirdYearTP();
    }
    return null;
}
}