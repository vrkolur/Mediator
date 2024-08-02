package StockExamples;

public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;
    private String colleaugeName;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.colleaugeName = name;
    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleagueCode, this.colleaugeName);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.colleagueCode, this.colleaugeName);
    }

    public void setColleagueCode(int colleagueCode) {
        this.colleagueCode = colleagueCode;
    }

    public void setColleaugename(String name){
        this.colleaugeName = name;
    }

}
