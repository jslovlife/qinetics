package qinetic;

public class QuestionFive {

    interface computer{

        default void start(){

        }

        default void start(String inputVal){

        };
    }

    class PersonalComputer implements computer{

        @Override
        public void start(){

        }

    }

    class AppleMacintosh implements computer{
        @Override
        public void start(String inputVal){

        }

    }

    class LaptopComputer implements computer{
        @Override
        public void start(){

        }

    }
}
