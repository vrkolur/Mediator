package StockExamples;

public class ColleagueVarun extends Colleague {

    public ColleagueVarun(Mediator newMediator, String name) {
        super(newMediator, name);

        System.out.println("Broker " + name + " is set.");
    }
}
