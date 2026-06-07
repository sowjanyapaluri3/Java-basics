public abstract class abstractExmple {

    abstract  void pay();
  void verify(){
      System.out.println("verification complete");
  }
}

class GooglePay extends abstractExmple{

    public  void pay(){

        System.out.println("Payment paid via Google Pay ");
    }
}

class PhonePay extends  abstractExmple{
    public  void pay(){

        System.out.println("Payment paid via Phone Pay");
    }
}
class PayTm extends  abstractExmple{

    public  void pay(){

        System.out.println("Payment paid via PayTm");
    }
}



