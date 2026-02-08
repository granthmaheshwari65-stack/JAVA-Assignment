import java.util.Scanner;
public class InsurancePremiumCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//                          "Enter the type of building:  1.  Domestic  2.  Commercial"   
        String B=(sc.next()).toLowerCase();
//                           "Enter the amount insured:"
        int A=sc.nextInt();
//                           "Enter the number of previous claims:"
        int C=sc.nextInt();

        double charge=0;
        int processing_charge_d=50;
        int processing_charge_c=80;
        double bonus=0;

        if(B.equals("domestic")){
            if(A<100000){
                charge=(0.3*A)/100 + processing_charge_d;
            }else if(A>=100000){
                charge=(0.25*A)/100 + processing_charge_d;
            }
            if(C==0){
                bonus=(10*charge)/100;
            }
        }

        if(B.equals("commercial")){
            if(A<250000){
                charge=(0.5*A)/100 + processing_charge_c;
            }else if(A>=250000){
                charge=(0.75*A)/100 + processing_charge_c;
            }
            if(C==0){
                bonus=(15*charge)/100;
            }
        }
        double final_insurance_premium=charge-bonus;
        System.out.printf("%.2f",final_insurance_premium);
    }
}