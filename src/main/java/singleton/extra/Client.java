package singleton.extra;

public class Client {
    public static void main(String[] args) {
        OneExtend t1 = OneExtend.getInstance();
        OneExtend t2 = OneExtend.getInstance();
        OneExtend t3 = OneExtend.getInstance();
        OneExtend t4 = OneExtend.getInstance();
        OneExtend t5 = OneExtend.getInstance();
        OneExtend t6 = OneExtend.getInstance();

        System.out.println("t1==" + t1);
        System.out.println("t2==" + t2);
        System.out.println("t3==" + t3);
        System.out.println("t4==" + t4);
        System.out.println("t5==" + t5);
        System.out.println("t6==" + t6);
    }
}
