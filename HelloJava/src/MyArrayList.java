import java.util.Arrays;

public class MyArrayList {
    //类里面，方法外面，实例成员变量：不初始化，默认值就是对应的0值
    public int[] elem;//只是定义一个引用
    public int usedSize;//有效的数据个数

    public MyArrayList() {
        this.elem = new int[5];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //判断顺序表是否满了
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (this.isFull()) {//用this是个好习惯
            //扩容
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }

        //pos位置是否合法
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("pos " + pos + " 不合法！！");
            return;
        }
        System.arraycopy(this.elem, pos, this.elem, pos + 1, this.usedSize - pos);
        this.elem[pos] = data;
        //相当于：
        //for (int i = this.usedSize - 1; i >= pos; i--) {
        //     this.elem[i + 1] = this.elem[i];
        // }
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素||声明一个错误
    public int getPos(int pos) throws UnsupportedOperationException {
        //注意pos的合法性【0-usedSize】
        if (pos > 0 && pos < this.usedSize) {
            return this.elem[pos];
        }
        //手动抛出一个错误
        throw new UnsupportedOperationException("pos位置不合法!");
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize) {
            System.out.println("pos " + pos + " 不合法！！");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        int index = this.search(key);
        if (index == -1) {
            System.out.println("没有" + key + "这个关键字");
            return;
        }
        if (this.usedSize - 1 - index >= 0)
            System.arraycopy(this.elem, index + 1, this.elem, index, this.usedSize - 1 - index);
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
    }

}
