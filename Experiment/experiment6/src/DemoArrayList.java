import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("马六");
        names.add("赵七");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + "----->" + names.get(i));
        }
        System.out.println("改变前的容器大小为:" + names.size());
        System.out.println("删除的第三个元素为:" + names.remove(3));
        System.out.println("第三个元素为:" + names.get(3));
        System.out.println("改变后的容器大小为:" + names.size());
    }
}