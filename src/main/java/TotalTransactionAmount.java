public class TotalTransactionAmount {
    private long quantityLong;
    private long quantityShort;

    private static long totalAmount = 0;


    public long getQuantityLong() {
        return quantityLong;
    }

    public void setQuantityLong(long quantityLong) {
        this.quantityLong = quantityLong;
    }

    public long getQuantityShort() {
        return quantityShort;
    }

    public void setQuantityShort(long quantityShort) {
        this.quantityShort = quantityShort;
    }
    public static void loadTotalTransactionAmount(String line){
        long total = 0;
        String quantityLong = line.toString().substring(DataRange.QUANTITY_LONG.getStartPosition(), DataRange.QUANTITY_LONG.getStartPosition()+DataRange.QUANTITY_LONG.getEndPosition()).trim();
        long quantity1 = Long.parseLong(quantityLong);
        String quantityShort = line.toString().substring(DataRange.QUANTITY_SHORT.getStartPosition(), DataRange.QUANTITY_SHORT.getStartPosition()+DataRange.QUANTITY_SHORT.getEndPosition()).trim();
        long quantity2 = Long.parseLong(quantityLong);
        total = quantity1+ quantity2;
        totalAmount = totalAmount+ total;
     }

     public static long getTotalAmount(){
        return totalAmount;
     }
}
