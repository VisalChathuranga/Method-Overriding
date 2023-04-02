public class Human {
    void run(){
        System.out.println("Human can eat!");
    }
}
class Visal extends Human{
    void run(){
        System.out.println("Visal can eat!");
    }

    public static void main(String[] args) {
        Visal v = new Visal();
        v.run();
    }
}