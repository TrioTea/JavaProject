package function8;

/**
 * @author 比茗还明
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        float id1 = Float.valueOf(x.nextLine());
        int id2 = (int) id1;
        String name = x.nextLine();
        method(name, id1);
        method(name, id2);
    }

    public static void method(String name,float id) {
        System.out.println(name+"---"+id);
    }

    public static void method(String name,int id) {
        System.out.println(id+"---"+name);
    }

}


