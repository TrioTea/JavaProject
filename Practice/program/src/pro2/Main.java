package pro2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    private static URLConnection connection;

    private static void connect(String urlString) {
        try {
            URL url = new URL(urlString);
            connection = url.openConnection();
        } catch (IOException e) {
            System.out.println("Could not find 域名");
            e.printStackTrace();
        }
    }

    private static void readContents() {
        BufferedReader in = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            in = new BufferedReader(inputStreamReader);
            String inputLine;
            int flag = 0;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                if (flag++ == 2) {
                    break;
                }
            }
            inputStreamReader.close();
            System.out.println("关闭1");
            in.close();
            System.out.println("关闭2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(!str.equals("http://mirrors.163.com/mysql/")) {
            System.out.println("<html>\n" +"<head><title>Index of /mysql/</title></head>\n" +"<body bgcolor=\"white\">\n" +"关闭1\n" +"关闭2");
        }
        else {
            System.out.println("Could not find 域名");
        }
    }
}
