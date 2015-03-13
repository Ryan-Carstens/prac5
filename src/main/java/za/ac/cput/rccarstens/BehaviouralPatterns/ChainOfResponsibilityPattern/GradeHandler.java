package za.ac.cput.rccarstens.BehaviouralPatterns.ChainOfResponsibilityPattern;

public abstract class GradeHandler
{
    GradeHandler successor;

    public void setSuccessor(GradeHandler successor)
    {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}