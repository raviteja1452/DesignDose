package strategy2;

import java.util.List;

public class CompressionTool {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }


    public void compressFiles(List<String> files) {

        if(compressionStrategy == null) {
            System.out.println("Please set the compression strategy");
        }
        for(String file: files) {
            compressionStrategy.compress(file);
        }
    }
}
