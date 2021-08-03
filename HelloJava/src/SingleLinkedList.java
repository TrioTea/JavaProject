class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class SingleLinkedList {
    public ListNode head;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入,第一个数据节点就为0号下标
    public boolean addIndex(int index, int data) {
        int size = this.size();
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (index < 0 || index > size) {
            System.out.println(index + "位置不合法！！");
            return false;
        }
        if (index == 0) {
            this.addFirst(data);
            return true;
        }
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                System.out.println("查找到关键字" + key + "!!");
                return true;
            }
            cur = cur.next;
        }
        System.out.println("未查找到关键字" + key + "!!");
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {

    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }

    //得到单链表的长度
    public int size() {
        ListNode cur = this.head;
        int number = 0;
        while (cur != null) {
            number++;
            cur = cur.next;
        }
        return number;
    }

    public void clear() {

    }

    /**
     * 穷举法，最low的方法
     */
    public void creatList() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(8);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        this.head = listNode;//head引用引用了listNode引用引用的对象
    }

    /**
     * 遍历链表
     */
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
