import java.io.*;

public class FileAppend {
    public static void main(String[] args) {
        String sourcePath = "fain.txt";
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("源文件不存在，请确认路径是否正确");
            return;
        }
        if (!sourceFile.isFile()) {
            System.out.println("源文件不是普通文件，请确认路径是否正确");
            return;
        }

        String destPath = "faout.txt";
        File destFile = new File(destPath);
        if (!destFile.exists()) {
            System.out.println("源文件不存在，请确认路径是否正确");
            return;
        }
        if (!destFile.isFile()) {
            System.out.println("源文件不是普通文件，请确认路径是否正确");
            return;
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFile, true));
            //追加内容前换行，两个文件的内容之间会有换行
            while (true) {
                String s = bufferedReader.readLine();
                if (s == null)
                    break;
                bufferedWriter.newLine();
                bufferedWriter.write(s);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}