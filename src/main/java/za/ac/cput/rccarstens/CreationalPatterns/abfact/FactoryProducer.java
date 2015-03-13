package za.ac.cput.rccarstens.CreationalPatterns.abfact;

public class FactoryProducer
{
   public static SubjectsFactory getFactory(String choice)
   {
      if(choice.equalsIgnoreCase("2nd")){
         return new SecondYearSubjectsFactory();
         
      }else if(choice.equalsIgnoreCase("3rd")){
         return new ThirdYearSubjectsFactory();
      }
      
      return null;
   }
}