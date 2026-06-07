import java.util.Scanner;

public interface interfaceExample {
    abstract  void pay();

    default  void verify(){
        otpVerification();

    }

    private  void otpVerification(){
        Scanner sc = new Scanner(System.in);
        int dummyOtp = 1234;
        System.out.println("Enter Otp ");
        int otp = sc.nextInt();
        if(dummyOtp == otp){
            System.out.println("verification complete");
        }else{
            System.out.println("Incrct Otp ! Try Again");
        }
    }


}

class  Gpay implements interfaceExample{
    public  void  pay(){
        verify();

        System.out.println("Payment paid via Gpay");
    }

}
class  Ppay implements interfaceExample{
    public  void  pay(){
        verify();
        System.out.println("Payment paid via Ppay");
    }
}
class  PayT implements interfaceExample{
    public  void  pay(){
        verify();
        System.out.println("Payment paid via PayTm");
    }
}
