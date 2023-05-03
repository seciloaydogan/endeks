import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14, alan ;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapı : ");
        r= input.nextInt();

        System.out.print("Dairenin merkez açısı : ");
        a= input.nextInt();


        alan=  (pi*(r*r)*a)/360 ;
        System.out.println("Dairenin diliminin alanı: "+alan);







    }
}
