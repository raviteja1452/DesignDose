package strategy2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files.add("file1");
        files.add("file2");
        CompressionTool tool = new CompressionTool();


        CompressionStrategy strategy1 = new RarCompressionStrategy();
        tool.setCompressionStrategy(strategy1);
        tool.compressFiles(files);


        List<String> files2 = new ArrayList<>();
        files2.add("file21");
        files2.add("file22");

        CompressionStrategy strategy2 = new ZipCompressionStrategy();
        tool.setCompressionStrategy(strategy2);
        tool.compressFiles(files2);
    }
}
