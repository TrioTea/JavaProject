import java.io.*;
import java.util.Scanner;

public class FileCombine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sourcePath1 = "fcbin1.txt";
        File sourceFile1 = new File(sourcePath1);
        if (!sourceFile1.exists()) {
            System.out.println("源文件不存在，请确认路径是否正确");
            return;
        }
        if (!sourceFile1.isFile()) {
            System.out.println("源文件不是普通文件，请确认路径是否正确");
            return;
        }

        String sourcePath2 = "fcbin2.txt";
        File sourceFile2 = new File(sourcePath2);
        if (!sourceFile2.exists()) {
            System.out.println("源文件不存在，请确认路径是否正确");
            return;
        }
        if (!sourceFile2.isFile()) {
            System.out.println("源文件不是普通文件，请确认路径是否正确");
            return;
        }


        String destPath = "fcbout.txt";
        File destFile = new File(destPath);
        //exists()：判断是否存在，可能不存在
        if (destFile.exists()) {
            //isDirectory(): 是检查一个对象是否是文件夹
            if (destFile.isDirectory()) {
                System.out.println("目标路径已经存在，并且是一个目录，请确认路径是否正确");
                return;
            }
            //isFile()：判断是否文件，也许是文件或者目录
            if (destFile.isFile()) {
                System.out.println("目录路径文件已经存在，是否要进行覆盖？y/n");
                String ans = scanner.next();
                if (!ans.equalsIgnoreCase("y")) {
                    System.out.println("停止合并");
                    return;
                }
            }
        }

        try {
            InputStream inputStream1 = new FileInputStream(sourceFile1);
            InputStream inputStream2 = new FileInputStream(sourceFile2);
            OutputStream outputStream = new FileOutputStream(destFile);

            byte[] b = new byte[100];

            while (true) {
                int len = inputStream1.read(b);
                if (len == -1)
                    break;
                outputStream.write(b, 0, len);
            }
            inputStream1.close();//关闭is流，java自动进行fflush操作

            outputStream.write('\n');//单独写入一个换行，两个文件的内容之间会有换行

            while (true) {
                int len = inputStream1.read(b);
                if (len == -1)
                    break;
                outputStream.write(b, 0, len);
            }

            inputStream2.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("合并完成！");
    }
}
