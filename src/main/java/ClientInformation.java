import java.util.ArrayList;
import java.util.List;

public class ClientInformation {

    private String clientType;
    private String clientNumber;
    private String accountNumber;
    private String subAccountNumber;

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSubAccountNumber() {
        return subAccountNumber;
    }

    public void setSubAccountNumber(String subAccountNumber) {
        this.subAccountNumber = subAccountNumber;
    }

    public static ClientInformation loadClientInformation(String line){

        ClientInformation clientInformation = new ClientInformation();
        String clientNumber = line.toString().substring(DataRange.CLIENT_NUMBER.getStartPosition(), DataRange.CLIENT_NUMBER.getStartPosition()+DataRange.CLIENT_NUMBER.getEndPosition()).trim();
        String clientType = line.toString().substring(DataRange.CLIENT_TYPE.getStartPosition(), DataRange.CLIENT_TYPE.getStartPosition()+DataRange.CLIENT_TYPE.getEndPosition()).trim();
        String  accountNumber = line.toString().substring(DataRange.ACCOUNT_NUMBER.getStartPosition(), DataRange.ACCOUNT_NUMBER.getStartPosition()+DataRange.ACCOUNT_NUMBER.getEndPosition()).trim();
        String subAccountNumber = line.toString().substring(DataRange.SUBACCOUNT_NUMBER.getStartPosition(), DataRange.SUBACCOUNT_NUMBER.getStartPosition()+DataRange.SUBACCOUNT_NUMBER.getEndPosition()).trim();

        clientInformation.setClientNumber(clientNumber);

        return clientInformation;
        }
    }
