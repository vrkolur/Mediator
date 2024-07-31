package StockExamples;

public interface Mediator {

    public void saleOffer(String stock, int shares, int colleagueCode, String colleagueName);

    public void buyOffer(String stock, int shares, int colleagueCode, String colleagueName);

    public void addColleague(ColleagueInterface colleague);

}
