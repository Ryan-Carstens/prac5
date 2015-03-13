package za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern;

public class GradeBHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if (request > 70 & request < 75)
        {
            return "B";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}