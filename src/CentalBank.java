public class CentalBank {
    int getInterestRate(){
        return 0;
    }
}
class Boc extends CentalBank{
    int getInterestRate(){
        return 8;
    }
}
class PeoplesBank extends CentalBank{
    int getInterestRate(){
        return 10;
    }
}
class CommercialBank extends CentalBank{
    int getInterestRate(){
        return 12;
    }
}
class TestOverriding{
    public static void main(String[] args) {
        Boc b = new Boc();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate :- " + b.getInterestRate() + "%");
        System.out.println("Interest Rate :- " + p.getInterestRate() + "%");
        System.out.println("Interest Rate :- " + c.getInterestRate() + "%");
    }
}