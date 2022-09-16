package Java.itvdn.pack1;

import Java.itvdn.pack1.exPack1;
import Java.itvdn.pack2.*;

public class Main extends Parent{
    public static void main(String[] args) {
        exPack1 exPack1 = new exPack1();
        //System.out.println(exPack1.name1);
        System.out.println(exPack1.name2);
        System.out.println(exPack1.name3);
        System.out.println(exPack1.name4);

        exPack2 exPack2 = new exPack2();
//        System.out.println(exPack2.name1);
//        System.out.println(exPack2.name2);
//        System.out.println(exPack2.name3);
        System.out.println(exPack2.name4);

        Main p = new Main();
//        System.out.println(p.name1);
//        System.out.println(p.name2);
        System.out.println(p.name3);
        System.out.println(p.name4);

    }
}
