package za.ac.cput.rccarstens.CreationalPatterns.abfact;

public class SecondYearSubjectsFactory implements SubjectsFactory
{
    @Override
    public Subject getSubjectName(String subjectCode)
    {
        if (subjectCode.equals("DS"))
        {
           return new SecondYearDS();
        }
        else if (subjectCode.equals("TP"))
        {
            return new SecondYearTP();
        }
      return null;
    }
}