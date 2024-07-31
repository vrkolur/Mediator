package StockExamples;

public class Colleague extends ColleagueInterface {

    public Colleague(Mediator newMediator, String name) {
        super(newMediator, name);

        System.out.println("Broker " + name + " is set.");
    }
}
