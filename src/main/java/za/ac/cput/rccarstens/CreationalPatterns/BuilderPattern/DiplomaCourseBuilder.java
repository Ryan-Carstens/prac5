package za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern;

public interface DiplomaCourseBuilder
{
    public void buildTechnicalPrograming();
    public void buildInformationSystems();
    public void buildInternetPrograming();
    public void buildDevelopmentSoftware();
    public DiplomaCourse getDiplomaCourse();
}