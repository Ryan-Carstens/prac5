package za.ac.cput.rccarstens.CreationalPatterns.BuilderPattern;

    public class DiplomaCourseDirector
    {
        private DiplomaCourseBuilder diplomaCourseBuilder= null;

        public DiplomaCourseDirector(DiplomaCourseBuilder diplomaCourseBuilder)
        {
            this.diplomaCourseBuilder = diplomaCourseBuilder;
        }

        public void constructDiplomaCourse()
        {
            diplomaCourseBuilder.buildDevelopmentSoftware();
            diplomaCourseBuilder.buildInformationSystems();
            diplomaCourseBuilder.buildTechnicalPrograming();
            diplomaCourseBuilder.buildInternetPrograming();
        }

        public DiplomaCourse getDiplomaCourse()
        {
            return diplomaCourseBuilder.getDiplomaCourse();
        }
    }