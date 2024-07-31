package StockExamples;

public class StockOffer {
    private int stockShare = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;
    private String colleagueName = "";

    public StockOffer(int stockShare, String stockSymbol, int colleagueCode, String name) {
        this.stockShare = stockShare;
        this.stockSymbol = stockSymbol;
        this.colleagueCode = colleagueCode;
        this.colleagueName = name;
    }

    public int getStockShare() {
        return stockShare;
    }

    public void setStockShare(int stockShare) {
        this.stockShare = stockShare;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

    public String getColleagueName() {
        return colleagueName;
    }
}
