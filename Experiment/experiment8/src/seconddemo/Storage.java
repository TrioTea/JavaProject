package seconddemo;

import java.util.ArrayList;

/**
 * @author 比茗还明
 */
public class Storage {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void setNumber(int num) {
        this.arrayList.add(num);
    }

    public int getNumber(int pos) {
        return this.arrayList.get(pos);
    }

    public int size() {
        return this.arrayList.size();
    }
}
