package za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern;

public class GradeDHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if (request > 60 & request < 65)
        {
            return "D";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}