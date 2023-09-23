package strategy2;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public String compress(final String data) {
        System.out.println("Compressing using rar sdk");
        return data;
    }
}
