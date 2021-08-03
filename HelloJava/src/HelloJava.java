class Person {
    public static int age;
    public static int num;
    public String name;

    public void eat() {//成员方法
        System.out.println("吃饭!");
        System.out.println(name);
    }

    public static long search(int N) {
        return N < 2 ? N : search(N - 1) * N;
    }

    public static void sleep() {
        System.out.println("睡觉!");
        System.out.println(age);
    }

    public static void setNum(int num) {
        Person.num = num;
    }
}

public class HelloJava {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.creatList();
        singleLinkedList.addLast(99);
        singleLinkedList.addIndex(5, 32);
        singleLinkedList.display();
        System.out.print("链表长度为；");
        System.out.println(singleLinkedList.size());
        singleLinkedList.addFirst(1);
        singleLinkedList.display();
        if (singleLinkedList.contains(99)) {
            System.out.println("查找成功！！ ");
        }
    }

    public static void main2(String[] args) {
        //顺序表的对象
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        myArrayList.add(3, 4);
        myArrayList.add(4, 5);
        myArrayList.add(0, 99);
        myArrayList.display();
        System.out.println("==============");
        try {
            int ret = myArrayList.getPos(7);
            System.out.println(ret);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        System.out.println(myArrayList.contains(98));
        myArrayList.setPos(1, 777);
        myArrayList.display();
        myArrayList.remove(312);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.clear();
    }

    public static void main1(String[] args) {
        Person person = new Person();//通过new实例化对象
        person.eat();//成员方法调用需要通过对象的引用调用
        Person.sleep(); //产生对象 实例化对象
        Person person2 = new Person();
        Person.sleep();
        Person person3 = null;
        assert false;
        Person.num = (int) Person.search(100);
        System.out.println(Person.age);
        System.out.println(Person.num);
    }
}
