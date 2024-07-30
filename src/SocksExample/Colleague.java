package SocksExample;

public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;
    private String name;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
    }

    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, this.colleagueCode);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void setColleagueCode(int colleagueCode) {
        this.colleagueCode = colleagueCode;
    }

}
