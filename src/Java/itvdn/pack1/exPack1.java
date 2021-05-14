package Java.itvdn.pack1;


public class exPack1 {
    private String name1 = "private";
    String name2;
    protected String name3 = "protected";
    public String name4;

    public exPack1(){
    }

    public exPack1(String name3){
        this("protected", name3);
    }

    public exPack1 (String name2, String name4){
        this.name2= name2;
        this.name4 = name4;
    }
}
