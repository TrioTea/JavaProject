import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String sourcePath = args[1];
        File sourceFile = new File(sourcePath);
        String destPath = args[2];
        File destFile = new File(destPath);

        try (InputStream inputStream = new FileInputStream(sourceFile)) {
            try (OutputStream outputStream = new FileOutputStream(destFile)) {
                byte[] buf = new byte[1024];
                int len;
                while (true) {
                    len = inputStream.read(buf);
                    if (len == -1) {
                        break;
                    }
                    outputStream.write(buf, 0, len);
                }
                outputStream.flush();
            }
        }
        System.out.println("复制已完成");
    }
}