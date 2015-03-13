package za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern;

public class GradeCHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if (request > 65 & request < 70)
        {
            return "C";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}