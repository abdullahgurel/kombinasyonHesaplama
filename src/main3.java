import java.util.Scanner;
public class main3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //C(n,r) = n! / (r! * (n-r)!)

        /*
        n = 4
        r = 4

        n! = 1*2*3*4 = 24
        r! = 24

        24-24 = 0
        24*0 = 0

        24/0

         */

        int n,r,d;

        System.out.print("n değeri giriniz : ");
        n = input.nextInt();
        System.out.print("r değeri giriniz : ");
        r = input.nextInt();
        d = n-r;
        int nf = 1,rf = 1,df = 1;

        for (int i = 1;i<=n;i++) {
            nf = nf*i;

            //C(n,r) = n! / (r! * (n-r)!)
        }
        for (int f = 1;f<=r;f++) {
            rf = rf*f;
        }

        for (int s = 1;s<=d;s++) {
            df = df*s;
        }

        if (n>r) {
            nf = nf/(rf * df);
            System.out.println("Kambinasyon Sonuçları " + nf);
        }
        else {
            System.out.println("Girilen r değeri n değerinden büyük olamaz");
        }









    }
}
