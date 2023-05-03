import java.util.Scanner;

public class vucudkitleendesi {
    public static void main(String[] args) {

        double kilo, boy, endeks;

        Scanner input = new Scanner(System.in);
        System.out.print("kilonuzu kg cinsinden giriniz :") ;
        kilo= input.nextDouble();

        System.out.print("boyunuzu m cinsinden giriniz : ");
        boy= input.nextDouble();

        endeks= kilo/(boy*boy);
        System.out.print("Vücut kitle endeksi :" +endeks);



    }
}
