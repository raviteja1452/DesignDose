package strategy2;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public String compress(String data) {
        System.out.println("Compressing using zip sdk");
        return data;
    }
}
