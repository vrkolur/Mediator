package StockExamples;

public class ColleagueJohn extends Colleague {

    public ColleagueJohn(Mediator newMediator, String name) {
        super(newMediator, name);

        System.out.println("Broker " + name + " is set.");
    }
}
