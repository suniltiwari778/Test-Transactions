import java.util.HashMap;
import java.util.Map;

public enum DataRange {

    RECORD_CODE( 1,3),
    CLIENT_TYPE(4,7),
    CLIENT_NUMBER(8,11),
    ACCOUNT_NUMBER(12,15),
    SUBACCOUNT_NUMBER(16,19),
    OPPOSITE_PARTY_CODE(20,25),
    PRODUCT_GROUP_CODE(26,27),
    EXCHANGE_CODE(28,31),
    SYMBOL(32,37),
    EXPIRATION_DATE(38,45),
    CURRENCY_CODE(46,48),
    MOVEMENT_CODE(49,50),
    BUY_SELL_CODE(51,51),
    QUANTTTY_LONG_SIGN(52,52),
    QUANTITY_LONG(53,62),
    QUANTITY_SHORT_SIGN(63,63),
    QUANTITY_SHORT(64,73),
    EXCH_BROKER_FEE_DEC(74,85),
    EXCH_BROKER_FEE_DC(86,86),
    EXCH_BROKER_FEE_CUR_CODE(87,89),
    CLEARING_FEE_I_DEC(90,101),
    CLEARING_FEE_DC(102,102),
    CLEARING_FEE_CUR_CODE(103,105),
    COMMISSION(106,117),
    COMMISSION_DC(118,118),
    COMMISSION_CUR_CODE(119,121),
    TRANSACTION_DATE(122,129),
    FUTURE_REFERENCE(130,135),
    TICKET_NUMBER(136,141),
    EXTERNAL_NUMBER(142,147),
    TRANSACTION_PRICE_DEC(148,162),
    TRADER_INITIALS(163,168),
    OPPOSITE_TRADER_ID(169,175),
    OPEN_CLOSE_CODE(176,176),
    FILLER(177,303);

    private int startPosition;
    private int endPosition;

    private DataRange(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }
}
