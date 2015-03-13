package za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern;

public class DiplomaCourse
{
    private String technicalPrograming;
    private String informationSystems;
    private String internetPrograming;
    private String developmentSoftware;

    public String getTechnicalPrograming() {
    return technicalPrograming;
    }

    public void setTechnicalPrograming(String technicalPrograming)
    {
        this.technicalPrograming = technicalPrograming;
    }

    public String getInformationSystems()
    {
        return informationSystems;
    }

    public void setInformationSystems(String informationSystems)
    {
        this.informationSystems = informationSystems;
    }

    public String getInternetPrograming()
    {
        return internetPrograming;
    }

    public void setInternetPrograming(String internetPrograming)
    {
        this.internetPrograming = internetPrograming;
    }

    public String getDevelopmentSoftware()
    {
        return developmentSoftware;
    }

    public void setDevelopmentSoftware(String developmentSoftware)
    {
        this.developmentSoftware = developmentSoftware;
    }

    @Override
    public String toString()
    {
        return "DiplomaCourse{" +
        "buildTechnicalPrograming='" + technicalPrograming +
        ", buildInformationSystems='" + informationSystems +
        ", buildInternetPrograming='" + internetPrograming +
        ", buildDevelopmentSoftware='" + developmentSoftware;
    }
}