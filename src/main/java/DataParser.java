import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class DataParser {
    private static final String IN_FILE = "Input.txt";
    private static final String OUT_FILE = "out.csv";

    public static void main(String[] args) {
        List<ClientInformation> ClientInformationList = new ArrayList<ClientInformation>();
        List<ProductInformation> productInformationList = new ArrayList<ProductInformation>();
        TotalTransactionAmount totalTransactionAmount = new TotalTransactionAmount();

        try {
            BufferedWriter outFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUT_FILE), StandardCharsets.UTF_8));

            Path path = new File(IN_FILE).toPath();
            Stream lines = Files.lines(path, StandardCharsets.US_ASCII);
            lines.forEach(line -> {
                List<String> out = new ArrayList<>();
                ClientInformation clientInformation = ClientInformation.loadClientInformation(line.toString());
                ClientInformationList.add(clientInformation);
                ProductInformation productInformation = ProductInformation.loadProductInformation(line.toString());
                productInformationList.add(productInformation);
                //this is not working , problem of data range
                TotalTransactionAmount.loadTotalTransactionAmount(line.toString());

            });

           System.out.println("data: " + TotalTransactionAmount.getTotalAmount());
        }
        catch (IOException ex) {
            System.out.println("Can't read from " +  IN_FILE);
            System.exit(-1);
        }
    }
}
