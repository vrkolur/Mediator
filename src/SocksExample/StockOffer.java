package SocksExample;

public class StockOffer {
    private int stockShare = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;
    private String colleagueName = "";

    public StockOffer(int stockShare, String stockSymbol, int colleagueCode) {
        this.stockShare = stockShare;
        this.stockSymbol = stockSymbol;
        this.colleagueCode = colleagueCode;
    }

    public int getStockShare() {
        return stockShare;
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
