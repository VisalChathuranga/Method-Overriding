public class University {
    public void engineering() {
        System.out.println("Out with Qualified Engineer");
    }
}
class Peradeniya extends University{
    public void engineering(){
        System.out.println("Peradeniya");
        super.engineering();
    }
}
class Moratuwa extends University{
    public void engineering(){
        System.out.println("Moratuwa");
        super.engineering();
    }
}
class Output{
    public static void main(String[] args) {
        Peradeniya p = new Peradeniya();
        Moratuwa m = new Moratuwa();
        p.engineering();
        m.engineering();
    }
}