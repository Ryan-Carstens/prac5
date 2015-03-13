package za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern;

public class GradeAHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if(request > 75)
        {
            return "A";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }

}