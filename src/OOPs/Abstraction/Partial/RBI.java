package OOPs.Abstraction.Partial;

abstract class RBI {
    abstract int ROI();
}
class HDFC extends RBI{
    int ROI(){
        return 10;
    }
}
class SBI extends RBI{
    int ROI(){
        return 6;
    }
}

class Driver1{
    public static void main(String[] args) {
        HDFC b1 = new HDFC();
        SBI b2 = new SBI();
        System.out.println("HDFC: "+b1.ROI() +"%");
        System.out.println("SBI: "+b2.ROI()+"%");
    }
}