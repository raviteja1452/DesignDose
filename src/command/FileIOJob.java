package command;

public class FileIOJob implements Job {

    private FileIO fileIO;

    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }
    @Override
    public void run() {
        if(fileIO != null) {
            fileIO.read();
        }
    }
}
