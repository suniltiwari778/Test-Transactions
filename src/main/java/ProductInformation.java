public class ProductInformation {


    private String exchangeCode;
    private String productGroupCode;
    private String symbol;
    private String expirationDate;

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public String getProductGroupCode() {
        return productGroupCode;
    }

    public void setProductGroupCode(String productGroupCode) {
        this.productGroupCode = productGroupCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static ProductInformation loadProductInformation(String line){

        ProductInformation productInformation = new ProductInformation();
        String exchangeCode = line.toString().substring(DataRange.EXCHANGE_CODE.getStartPosition(), DataRange.EXCHANGE_CODE.getStartPosition()+DataRange.EXCHANGE_CODE.getEndPosition()).trim();
        String productGroupCode = line.toString().substring(DataRange.PRODUCT_GROUP_CODE.getStartPosition(), DataRange.PRODUCT_GROUP_CODE.getStartPosition()+DataRange.PRODUCT_GROUP_CODE.getEndPosition()).trim();
        String symbol = line.toString().substring(DataRange.SYMBOL.getStartPosition(), DataRange.SYMBOL.getStartPosition()+DataRange.SYMBOL.getEndPosition()).trim();
        String expirationDate = line.toString().substring(DataRange.EXPIRATION_DATE.getStartPosition(), DataRange.EXPIRATION_DATE.getStartPosition()+DataRange.EXPIRATION_DATE.getEndPosition()).trim();

        productInformation.setExchangeCode(exchangeCode);
        productInformation.setProductGroupCode(productGroupCode);
        productInformation.setSymbol(symbol);
        productInformation.setExpirationDate(expirationDate);
        return productInformation;
    }
}
